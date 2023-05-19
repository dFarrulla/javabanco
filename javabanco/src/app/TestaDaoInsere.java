package app;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaDaoInsere {
	
	

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o nome do contato: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite o e-mail do contato: ");
	        String email = scanner.nextLine();
	        
	        System.out.print("Digite o endereço do contato: ");
	        String endereco = scanner.nextLine();
	        
	        scanner.close();
		
	        Contato contato = new Contato();
	        contato.setNome(nome);
	        contato.setEmail(email);
	        contato.setEndereco(endereco);
	        
	        ContatoDao dao;
	        try {
	            dao = new ContatoDao();
	            dao.adiciona(contato);
	            System.out.println("Gravação feita com sucesso");
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}