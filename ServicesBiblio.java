package scola;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServicesBiblio {
	static connection cox;
	//verification from the biblo
		public static Inscription VerificationInscripton(int sd ,String year) throws SQLException {
			Inscription s = null;
			cox.Initial();
				ResultSet rese = cox.state.executeQuery("Select * from inscription where ( idStudents= '"+ sd + "' and year ='"+ year +"')");
				if(rese.next()) {
					
				s =new Inscription (rese.getInt("idinscription"),rese.getInt("idStudents"), rese.getString("nomS"), rese.getString("prenomS"),
				rese.getString("specialite"),rese.getInt("level"), rese.getString("year"),rese.getString("status"));
					
					System.out.println("You have done your inscription at scholalite and yur num of inscr is "+ s.getIdIns());

				}else
	           System.out.println("the student is not registered for this year");
			
			return s;
		}
		//pour verifier les listes des etudiant soit blocké ou fin
		public static ArrayList<Inscription> Liste(String status) throws SQLException{
			ArrayList <Inscription> StIns = new ArrayList<Inscription>();
			Inscription ins=null;
			cox.Initial();
			if(status!="infor"){
			ResultSet resy = cox.state.executeQuery("Select * from inscription where status ='"+ status+"'");
			
			while(resy.next()){
				ins= new Inscription (resy.getInt("idinscription"),resy.getInt("idStudents"), resy.getString("nomS"), resy.getString("prenomS"),
						resy.getString("specialite"),resy.getInt("level"), resy.getString("year"),resy.getString("status"));
				StIns.add(ins);
			}
			
			}else{
				ResultSet resy = cox.state.executeQuery("Select * from inscription");
				
				while(resy.next()){
					ins= new Inscription (resy.getInt("idinscription"),resy.getInt("idStudents"), resy.getString("nomS"), resy.getString("prenomS"),
							resy.getString("specialite"),resy.getInt("level"), resy.getString("year"),resy.getString("status"));
					StIns.add(ins);
					System.out.println(ins.toString());
					
					}
			}
			return StIns;
		}
}
