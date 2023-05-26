package app;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDao;
import dao.FuncionarioDao;
import modelo.Contato;
import modelo.Funcionario;

public class TestaDaoInsere2 {
	
	

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o nome do contato: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite usuário: ");
	        String usuario = scanner.nextLine();
	        
	        System.out.print("Digite a senha: ");
	        String senha = scanner.nextLine();
	        
	        scanner.close();
		
	        Funcionario funcionario = new Funcionario();
	        funcionario.setNome(nome);
	        funcionario.setUsuario(usuario);
	        funcionario.setSenha(senha);
	        
	        FuncionarioDao dao;
	        try {
	            dao = new FuncionarioDao();
	            dao.adiciona(funcionario);
	            System.out.println("Gravação feita com sucesso");
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}