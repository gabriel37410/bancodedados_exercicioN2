package banco_de_dados.conexaoSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

	public static void main(String[] args) {

		// login : admin
		// senha : admin123

		String databaseConnectionUrl = "jdbc:sqlserver://localhost;databaseName=exercicioN2;";
		String user = "admin";
		String password = "admin123";

		try (Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password)) {

			System.out.println("Connected to Microsoft SQL Server!");

		} catch (SQLException errorConnectionIntoDatabase) {
			System.out.print("Opss, There is an error: ");
			errorConnectionIntoDatabase.printStackTrace();
		}


		//INSERE PESSOA==================================================================================
		String insertString = "INSERT INTO Pessoa (pessoaId, pessoaNome, pessoaIdade) VALUES (?, ?, ?)";
		// Tentativa de inserir valor na tabela
		try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password);
			  PreparedStatement stmt = connectionUrl.prepareStatement(insertString);
			) {
			Pessoa p1 = new Pessoa(1, "Maria", 50);
			stmt.setInt(1, p1.getPessoaId()); // insira na primeira ? o id da pessoa
			stmt.setString(2, p1.getPessoaNome()); // insira na segunda ? o nome da pessoa
			stmt.setInt(3, p1.getPessoaIdade()); // insira na terceira ? a idade da pessoa

			stmt.executeUpdate(); // executa o insert

			Pessoa p2 = new Pessoa(2, "Lucia", 24);
			// insira na primeira ? o id da pessoa
			stmt.setInt(1, p2.getPessoaId());
			stmt.setString(2, p2.getPessoaNome()); // insira na segunda ? o nome da pessoa
			stmt.setInt(3, p2.getPessoaIdade()); // insira na terceira ? a idade da pessoa

			stmt.executeUpdate(); // executa o insert

			Pessoa p3 = new Pessoa(3, "João", 45);
			// insira na primeira ? o id da pessoa
			stmt.setInt(1, p3.getPessoaId());
			stmt.setString(2, p3.getPessoaNome()); // insira na segunda ? o nome da pessoa
			stmt.setInt(3, p3.getPessoaIdade()); // insira na terceira ? a idade da pessoa

			stmt.executeUpdate(); // executa o insert

			Pessoa p4 = new Pessoa(4, "Flavia", 31);
			// insira na primeira ? o id da pessoa
			stmt.setInt(1, p4.getPessoaId());
			stmt.setString(2, p4.getPessoaNome()); // insira na segunda ? o nome da pessoa
			stmt.setInt(3, p4.getPessoaIdade()); // insira na terceira ? a idade da pessoa

			stmt.executeUpdate(); // executa o insert

		} catch (SQLException e) {
			e.printStackTrace();
		}

/*	
		//ATUALIZA PESSOA==================================================================================
        String updateString = "UPDATE Pessoa SET pessoaNome = ?, pessoaIdade = ? WHERE pessoaId=?";
        // Tentativa de atualizar valor na tabela
        try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password); 
        	  PreparedStatement stmt = connectionUrl.prepareStatement(updateString);
        	) {
        	
        	Pessoa p1 = new Pessoa(1, "Mariano", 20); // a pessoa alterada
        	stmt.setString(1, p1.getPessoaNome()); // insira na primeira ? o nome da pessoa
        	stmt.setInt(2, p1.getPessoaIdade()); // insira na terceira ? a idade da pessoa
        	// insira na última ? o id da pessoa
        	stmt.setInt(3, p1.getPessoaId());	
        	
        	stmt.executeUpdate(); // executa o update
        	
        	System.out.println("Pessoa alterada!");
        	
		} 
		catch (SQLException e) {
        	e.printStackTrace();
        }
*/
/*
		//DELETA PESSOA==================================================================================
		String deleteString = "DELETE Pessoa WHERE pessoaId=?";
		try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password); 
			  PreparedStatement stmt = connectionUrl.prepareStatement(deleteString);
	  		) {
        	
        	int personId = 2;
        	// insira na ? o id da pessoa
        	stmt.setInt(1, personId);
        	
        	stmt.executeUpdate(); // executa o delete
        	
        	System.out.println("Pessoa removida!");
        	
		} 
		catch (SQLException e) {
        	e.printStackTrace();
		}
*/		
/*
		//FAZ UM SELECT NA PESSOA==================================================================================
        try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password); 
        	  Statement stmt = connectionUrl.createStatement(); // não tem variável, se quiser variável, precisa do prepare
        	) {
        	
            String SQL = "SELECT * FROM Pessoa"; // consulta de SELECT
            ResultSet rs = stmt.executeQuery(SQL); // executa o SELECT

            // itera pelos dados - enquanto houver uma linha para ler ....
            while (rs.next()) {
            	Pessoa p = new Pessoa(); // cria um objeto de pessoa
            	p.setPessoaId(rs.getInt("pessoaId")); // insere id recuperado do banco na pessoa
            	p.setPessoaNome(rs.getString("pessoaNome")); // insere nome recuperado do banco na pessoa
            	p.setPessoaIdade(rs.getInt("pessoaIdade")); // insere idade recuperada do banco na pessoa

            	System.out.println(p); // imprime a pessoa
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
*/

		//INSERE ENDERECO==================================================================================
		String insertEndereco = "INSERT INTO Endereco (enderecoId, enderecoCidade, enderecoRua, enderecoNumero) VALUES (?, ?, ?, ?)";
		// Tentativa de inserir valor na tabela
		try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password);
			  PreparedStatement stmt = connectionUrl.prepareStatement(insertEndereco);
			) {
			Endereco e1 = new Endereco(1, "Joinville", "Blumenau", 1930);
			stmt.setInt(1, e1.getEnderecoId()); // insira na primeira ? o id do endereco
			stmt.setString(2, e1.getEnderecoCidade()); // insira na segunda ? a cidade do endereco
			stmt.setString(3, e1.getEnderecoRua()); // insira na terceira ? a rua do endereco
			stmt.setInt(4, e1.getEnderecoNumero()); // insira na quarta ? o numero do endereco

			stmt.executeUpdate(); // executa o insert

			Endereco e2 = new Endereco(2, "Passos", "Rio Grande", 41);
			stmt.setInt(1, e2.getEnderecoId()); // insira na primeira ? o id do endereco
			stmt.setString(2, e2.getEnderecoCidade()); // insira na segunda ? a cidade do endereco
			stmt.setString(3, e2.getEnderecoRua()); // insira na terceira ? a rua do endereco
			stmt.setInt(4, e2.getEnderecoNumero()); // insira na quarta ? o numero do endereco

			stmt.executeUpdate(); // executa o insert

			Endereco e3 = new Endereco(3, "Passos", "Das Hortencias", 212);
			stmt.setInt(1, e3.getEnderecoId()); // insira na primeira ? o id do endereco
			stmt.setString(2, e3.getEnderecoCidade()); // insira na segunda ? a cidade do endereco
			stmt.setString(3, e3.getEnderecoRua()); // insira na terceira ? a rua do endereco
			stmt.setInt(4, e3.getEnderecoNumero()); // insira na quarta ? o numero do endereco

			stmt.executeUpdate(); // executa o insert

			Endereco e4 = new Endereco(4, "Joinville", "Ottokar Doerffel", 856);
			stmt.setInt(1, e4.getEnderecoId()); // insira na primeira ? o id do endereco
			stmt.setString(2, e4.getEnderecoCidade()); // insira na segunda ? a cidade do endereco
			stmt.setString(3, e4.getEnderecoRua()); // insira na terceira ? a rua do endereco
			stmt.setInt(4, e4.getEnderecoNumero()); // insira na quarta ? o numero do endereco

			stmt.executeUpdate(); // executa o insert

		} catch (SQLException e) {
			e.printStackTrace();
		}

/*
		//FAZ UM SELECT NO ENDERECO==================================================================================
        try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password); 
        	  Statement stmt = connectionUrl.createStatement(); // não tem variável, se quiser variável, precisa do prepare
        	) {
        	
            String SQL = "SELECT * FROM Endereco"; // consulta de SELECT
            ResultSet rs = stmt.executeQuery(SQL); // executa o SELECT

            // itera pelos dados - enquanto houver uma linha para ler ....
            while (rs.next()) {
				Endereco e = new Endereco(); // cria um objeto do endereco
				e.setEnderecoId(rs.getInt("enderecoId"));
				e.setEnderecoCidade(rs.getString("enderecoCidade"));
				e.setEnderecoRua(rs.getString("enderecoRua"));
				e.setEnderecoNumero(rs.getInt("enderecoNumero"));

            	System.out.println(e); // imprime o endereco
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
		}
*/

		//FAZ UM SELECT COM JOIN==================================================================================
        try ( Connection connectionUrl = DriverManager.getConnection(databaseConnectionUrl, user, password); 
        	  Statement stmt = connectionUrl.createStatement(); // não tem variável, se quiser variável, precisa do prepare
        	) {
        	
            String SQL = "select distinct p.pessoaId, p.pessoaNome, p.pessoaIdade, enderecoCidade, enderecoRua, enderecoNumero from Pessoa p JOIN Endereco on Endereco.enderecoId = p.pessoaId"; // consulta de SELECT
            ResultSet rs = stmt.executeQuery(SQL); // executa o SELECT

            // itera pelos dados - enquanto houver uma linha para ler ....
            while (rs.next()) {

				Endereco e = new Endereco(); // cria um objeto do endereco
				e.setEnderecoCidade(rs.getString("enderecoCidade"));
				e.setEnderecoRua(rs.getString("enderecoRua"));
				e.setEnderecoNumero(rs.getInt("enderecoNumero"));
				System.out.println(e); // imprime o endereco
				
				Pessoa p = new Pessoa(); // cria um objeto de pessoa
            	p.setPessoaId(rs.getInt("pessoaId")); // insere id recuperado do banco na pessoa
            	p.setPessoaNome(rs.getString("pessoaNome")); // insere nome recuperado do banco na pessoa
            	p.setPessoaIdade(rs.getInt("pessoaIdade")); // insere idade recuperada do banco na pessoa
				System.out.println(p); // imprime a pessoa
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
		}

	}
}