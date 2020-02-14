package scholars;

import java.io.IOException;











import scola.Inscription;
import scola.ScolariteDepart;
import scola.Students;
import scola.connection;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ScolaControla extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
    public ScolaControla() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String role =(String) request.getParameter("formuler");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ScolariteDepart reg = null;
		switch (role) {
		
		case "LA":
			RequestDispatcher rd;
			
			String pass= request.getParameter("password");
			String name= request.getParameter("name");

         if(pass.equals("jona123")){
			request.setAttribute("welcom","welcome "+name+" you can set the new values of rate and nassib");
				 rd = request.getRequestDispatcher("Admin.jsp");
				  rd.include(request, response);
			}
         else{
				request.setAttribute("errour!","votre password n'existe pas*, Retry!");
				 rd = request.getRequestDispatcher("AdminLogin.jsp");
				  rd.include(request, response);
			}
			
		break;	
		case "register":
			Inscription ins;
			
			RequestDispatcher rd1;
			//String nomS, String prenomS, String dob,String email, String Adress, String specialite, int level
			int level = Integer.parseInt(request.getParameter("niveau"));
			try {
				ins= ScolariteDepart.Insert(request.getParameter("nomS"),request.getParameter("prenomS"),request.getParameter("dob"),request.getParameter("email"),
				request.getParameter("adress"),request.getParameter("specialite"),level);
				if( ins.equals(null)){
					request.setAttribute("afiche","not successful" );
					 rd1 = request.getRequestDispatcher("Afiche.jsp");
					  rd1.include(request, response);
				}else{
					
					request.setAttribute("afiche",ins.getNomS()+" "+ins.getPrenomS()+" ID "+ ins.getIdStudents()+" inscrire sur numero "+ ins.getIdIns());
					 rd1 = request.getRequestDispatcher("Afiche.jsp");
					  rd1.include(request, response);
				}
					
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
				
			
			break;
		case "chefD":
			RequestDispatcher rd2;
			String date =request.getParameter("year");
			boolean opn;
			try {
				opn = reg.Ouverture(date);
				if(opn== true){
					 request.setAttribute("afiche","you have succefuly  open  the new academic year "+ date);
					 rd2 = request.getRequestDispatcher("Afiche.jsp");
					  rd2.include(request, response);}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
		 break;
			
		case "reIns":
			RequestDispatcher rd3;
			Inscription  insd;
			try {
				insd= reg.ReInscriptionScola(Integer.parseInt(request.getParameter("idStudent")),
				request.getParameter("specialite"), Integer.parseInt(request.getParameter("niveau")));
				if( insd.equals(null)){
					 request.setAttribute("afiche","you can not reincripe for  this year"+ reg.getYear());
					 rd2 = request.getRequestDispatcher("Afiche.jsp");
					  rd2.include(request, response);
					
				}else{
					
					 request.setAttribute("afiche","you have succefuly  done your Reinscription  year "+ insd.getYear()+ "\n "
					 		+ " ID inscription "+ insd.getIdIns() +" "
							 +" \n  and here are your details fullname "+ insd.getPrenomS() +" "+ insd.getNomS());
					 rd3 = request.getRequestDispatcher("Afiche.jsp");
					  rd3.include(request, response);
				}
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		default:
			break;
			
		case "liste":
			RequestDispatcher rd4;
			 ArrayList <Inscription> lst;
			String liste =request.getParameter("liste");
			if(liste.equals("")){
				request.setAttribute("afiche","Error");
				 rd2 = request.getRequestDispatcher("Afiche.jsp");
				  rd2.include(request, response);
			}else{
				try {
					lst=	scola.ServicesBiblio.Liste(liste);
					if(lst.equals(null)){
						request.setAttribute("afiche","there is no one in the database ");
						 rd2 = request.getRequestDispatcher("Afiche.jsp");
						  rd2.include(request, response);
					}else{
						request.setAttribute("afiche","here is the liste "+ lst.toString());
						 rd2 = request.getRequestDispatcher("Afiche.jsp");
						  rd2.include(request, response);
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			break;
		case "status":
			RequestDispatcher rds;
			boolean lol;
			String stut =request.getParameter("status");
			int id = Integer.parseInt(request.getParameter("stdID"));
			try {
			lol=	reg.Decision(id, stut);
			if(lol== true){
				request.setAttribute("afiche","yu have succefully changed the status of student "+id+" to "+stut);
				 rd2 = request.getRequestDispatcher("Afiche.jsp");
				  rd2.include(request, response);
			}else{
				request.setAttribute("afiche","not succfl");
				 rd2 = request.getRequestDispatcher("Afiche.jsp");
				  rd2.include(request, response);
			}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
