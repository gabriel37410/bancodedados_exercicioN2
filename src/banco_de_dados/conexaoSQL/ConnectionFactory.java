package banco_de_dados.conexaoSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static void main(String[] args) {
		
		// login : admin
		// senha : admin123
		
		String databaseConnectionUrl = "jdbc:sqlserver://localhost;databaseName=exercicioN2;";
		String user = "admin";
		String password = "admin123"; 
	
		try( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password) ){
			
			System.out.println("Connected to Microsoft SQL Server!");
			
		} catch( SQLException errorConnectionIntoDatabase ){
			System.out.print("Opss, There is an error: ");
			errorConnectionIntoDatabase.printStackTrace();
		}
	}
}