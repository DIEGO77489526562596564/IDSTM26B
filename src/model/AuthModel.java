package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {
	
	private Connection conn;
	
	public AuthModel() {
		
		try { conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_datos","root","");
			
		}catch(Exception e){
			System.out.println("Error de conexion: " + e.getMessage());
		}
		
	}
	
	public boolean acces(String email, String password) {
		 try {
	            String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

	            PreparedStatement pass = conn.prepareStatement(sql);
	            pass.setString(1, email);
	            pass.setString(2, password);

	            ResultSet rs = pass.executeQuery();

	            return rs.next();

	        } catch (Exception e) {
	            System.out.println("Error query: " + e.getMessage());
	        }

	        return false;
	}
		
}


