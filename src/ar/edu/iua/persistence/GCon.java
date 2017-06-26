package ar.edu.iua.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GCon {
    
    	private static GCon GC; // Propiedad del Singleton
	private Connection c;

	private GCon() throws ClassNotFoundException, SQLException { // Constructor privado
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "karqui");
        }

	public static GCon getInstance() throws ClassNotFoundException, SQLException {
		if (GC == null)
			GC = new GCon();
		return GC;
	}

	public Connection getConnection() {
		return c;
	}
}
