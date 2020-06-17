package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConexion {
	static{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConexion(){
		Connection con=null;
		try {
			
		    con = DriverManager.getConnection("jdbc:mysql://https://node226327-env-4487273.j.layershift.co.uk/sedenorte?serverTimezone=UTC","root","CFGogg79103");           
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
		
}