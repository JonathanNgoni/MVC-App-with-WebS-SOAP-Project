package scola;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;

public class connection {
	
	public static Connection con;
	public static Statement state;
	public static PreparedStatement states;
	private static String dtE;

	public static void Initial() throws SQLException {
		con = null;
		state = null;
		states = null;
		String url = ("jdbc:mysql://localhost:3306/scolarite");
		String user = ("root");
		String password = ("ngoni");
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, user, password);
			state = con.createStatement();

			System.out.println("You are connected to the databases");
		} catch (SQLException e) {
			System.out.println("pas de connection");

		}
		
	}	
	

/*public static void main (String[] args) throws SQLException{
	Initial();
}*/

}