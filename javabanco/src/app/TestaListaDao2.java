package app;

import java.sql.SQLException;
import java.util.List;

import dao.ContatoDao;
import dao.FuncionarioDao;
import modelo.Contato;
import modelo.Funcionario;

public class TestaListaDao2 {

	public static void main(String[] args) {
		try {
			FuncionarioDao cdao = new FuncionarioDao();
			List<Funcionario> funcionarios = cdao.getLista();
			
			for (Funcionario funcionario : funcionarios) {
				System.out.println("Nome: " +funcionario.getNome());
				System.out.println("Email: " +funcionario.getUsuario());
				System.out.println("Endereço: " +funcionario.getSenha());
			} 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
