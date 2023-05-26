package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;

public class JdbcInsere {

	public static void main(String[] args) {
		
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = ("insert into contatos (nome, email, endereco) values (?, ?, ?)");
			 PreparedStatement stmt = con.prepareStatement(sql);
			 stmt.setString(1, "Clayton");
			 stmt.setString(2, "clayton@gmail.com");
			 stmt.setString(3, "Av. Brasil, 1.000");
			 stmt.execute();
			 stmt.close();
			 System.out.println("Gravação realizada com sucesso no Banco de Dados");
			 con.close();
			 
			 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	

	}

}
