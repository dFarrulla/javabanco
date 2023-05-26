package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancojava.ConnectionFactory;
import modelo.Contato;
import modelo.Funcionario;

public class FuncionarioDao {
	
	private Connection con;
	
	public FuncionarioDao() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}
	
	public void adiciona(Funcionario funcionario) throws SQLException {
		 String sql = ("insert into funcionarios (nome, usuario, senha) values (?, ?, ?)");
		 PreparedStatement stmt = con.prepareStatement(sql);
		 //stmt.setString(1, "Clayton");
		 stmt.setString(1, funcionario.getNome());
		 stmt.setString(2, funcionario.getUsuario());
		 stmt.setString(3, funcionario.getSenha());
		 stmt.execute();
		 stmt.close();
		 con.close();
	}
	
	public List <Funcionario> getLista() throws SQLException{
		String sql = "select * from funcionarios";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		while (rset.next()) {
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(rset.getString("nome"));
			funcionario.setUsuario(rset.getString("usuario"));
			funcionario.setSenha(rset.getString("senha"));
			funcionarios.add(funcionario);
			
		}
		rset.close();
		stmt.close();
		return funcionarios;
	}
	
	

}
