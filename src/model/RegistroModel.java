package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegistroModel {
	
	private Connection conn;
		
		public RegistroModel() {
			
			try { conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacion","root","educadex2026");
			
			System.out.println("Conexion registro OK");
				
			}catch(Exception e){
				System.out.println("Error de conexion: " + e.getMessage());
			}
			
		}
		
		public boolean registrar(String username, String bio) {

		    try {

		        String sql = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";

		        PreparedStatement ps = conn.prepareStatement(sql);

		        ps.setString(1, username.trim());
		        ps.setString(2, "1234"); 
		        ps.setString(3, bio.trim());

		        return ps.executeUpdate() > 0;

		    } catch(Exception e) {
		        System.out.println(e.getMessage());
		    }

		    return false;
		}

}
