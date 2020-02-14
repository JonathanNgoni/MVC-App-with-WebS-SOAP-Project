package scola;

import java.beans.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ScolariteDepart {
	static connection cox;
	
	public static PreparedStatement states;
	public static PreparedStatement statis;
	public static  String year="2019/2020";
	public static int idS;
	

	public static String getYear() {
		return year;
	}

	public static void setYear(String year) {
		ScolariteDepart.year = year;
	}
//la registration de nouveau etudiant dans table etudiant
	public static Inscription Insert(String nomS, String prenomS, String dob,
			String email, String Adress, String specialite, int level ) throws SQLException {
		 Students std=null;
		 Inscription insc=null;
		cox.Initial();
	

		states = cox.con
				.prepareStatement("INSERT INTO students(nomS,prenomS,Address,email,specialite,level,year,birthday) VALUES(?,?,?,?,?,?,?,?)");
		states.setString(1, nomS);
		states.setString(2, prenomS);
		states.setString(3, Adress);
		states.setString(4, email);
		states.setString(5, specialite);
		states.setInt(6, level);
		states.setString(7, getYear());
		states.setString(8, dob);
		int j = states.executeUpdate();
		System.out.println(j);
		if (j > 0) {
			ResultSet res = cox.state
					.executeQuery("Select * from students where email= '"
							+ email + "'");
			if (res.next()) {

				idS = res.getInt("idStudents");
                 
				
			int in=	RegisterInscription(idS, nomS, prenomS, specialite, level);
			insc = new Inscription(in, idS, nomS, prenomS, specialite, level, getYear(),"actif");
				
				std = new Students(idS,res.getString("prenomS"),res.getString("nomS"),res.getString("birthday"),
						res.getString("email"),res.getString("specialite"),res.getInt("level")
						,res.getString("year"));
				
				  System.out.println("yur numer " + idS+ " nom "+ std.getName()+" "+std.getSurname());

				

			}
		}

		return insc;

	}
//la premier inscription  d'etudiant 
	public static int RegisterInscription(int idStudents, String nomS,String prenomS, String specialite, int level)
			throws SQLException {
	      int idInsr=0;
	      cox.Initial();
		statis = cox.con.prepareStatement("INSERT INTO inscription (idStudents,nomS, prenomS, specialite, level, year, status) VALUES (?,?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
		statis.setInt(1, idStudents);
		statis.setString(2, nomS);
		statis.setString(3, prenomS);
		statis.setString(4, specialite);
		statis.setInt(5, level);
		statis.setString(6, getYear());
		statis.setString(7, "actif");
		int i = statis.executeUpdate();
		ResultSet ro1 = statis.getGeneratedKeys();
		if(ro1.next()){
			idInsr  = ro1.getInt(1);
	          System.out.println("your id iscrption "+idInsr);
		}else{
			idInsr  = 0;
	          System.out.println("no register");
		}
			
	
                  return idInsr;
	}
//reinscription l'annee scolaire
	public static Inscription ReInscriptionScola(int idStudents, String specialite,
			int level) throws SQLException {
		Inscription ins = null;
		cox.Initial();
		ResultSet reso = cox.state.executeQuery("Select * from inscription where idStudents = '"
						+ idStudents + "' and status = 'valided'");
		if (reso.next()) {
			int numIns = RegisterInscription(idStudents, reso.getString("nomS"),
					reso.getString("prenomS"), specialite, level);
			
			ins= new Inscription(numIns, idStudents, reso.getString("nomS"),
					reso.getString("prenomS"), specialite, level, getYear(),"actif");
			System.out.println("reinscription done yur numero de iscr is "+ ins.getIdIns());
		} else {
			System.out.println("yu hv not valided ths year");
		}
		return ins;
	}
	
	//affectation de nouveau decision par chef de departement
	public static boolean Decision(int ID, String decision) throws SQLException{
		boolean bol =false;
		
			cox.Initial();
		
			Inscription insp	 = ServicesBiblio.VerificationInscripton(ID,getYear());
			
		try{
			if( insp == null){
				System.out.print("nope");
			}else{
				 
				PreparedStatement statii;
				
					statii = cox.con.prepareStatement("update inscription set status = ? where idStudents ='" + ID + "' and year ='"+ getYear() +"'");
					statii.setString(1, decision);
					int g = statii.executeUpdate();
					if(g>0)
						bol=true;
					System.out.println("done");
				
					
			}
		}catch(Exception e){
			
		}
		
		return bol;	
		
		
		
	}
	
	public static boolean Ouverture(String Date) throws SQLException{
		cox.Initial();
		boolean bol =false;
		PreparedStatement st = cox.con.prepareStatement("INSERT INTO academicyear (CurrentYear) VALUES (?)");
		st.setString(1,"CurrentYear");
		int i = st.executeUpdate();
		if(i>0){
			
			setYear(Date);
			bol= true;
		}
		return bol;
	}
	public static String Verifier_Date() throws SQLException{
		cox.Initial();
		String date = null;
		ResultSet rs = cox.con.createStatement().executeQuery("SELECT * FROM academicyear ORDER BY idAcademicYear DESC limit 1");
		while(rs.next()){
			date = rs.getString("CurrentYear");
			System.out.println(date);
			
		}
		return date;
	}
	public static void main(String[] args) throws SQLException {
		//Insert("bara1p", "rooo1p", "02/06/200p", "rooo1p@gmail.com", "chikanga","gl", 4);
		//ReInscriptionScola(61, "gl", 3);
		// Reinscription(61, "baradza", "inno", "gl", 7);
		//ConScola(60,"2019/2020");
		//Decision(60,"blocked");
		//Liste("infor");
		//Ouverture("2018");
		 //Verifier_Date();
		
	}
}
