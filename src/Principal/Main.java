//Luiz Eduardo Matias e Ana Carolina Nascimento  data: 27/09 Horário 04:06 
//Engenharia da computação 4 périodo
//Programa para cadastro de uma empresa no ramo da estética 

package Principal;

import java.util.Scanner;
import classes.Empresa;
import classes.Agenda;
import classes.Cliente;
import classes.Produtos;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
			
		int escolha;
		
	do {
		
		System.out.printf("Olá, bem vindo ao gerenciador. \n\n");
		System.out.println("Inicializando... \n\n");
		Empresa empresa = new Empresa();
		
		System.out.printf("Bem vindo ao gerenciador, empresa %s. \n", empresa.getEmpresa());
		System.out.println("Escolha uma das opções abaixo");
		System.out.println("\n 1 - Agenda; \n 2 - Cadastrar Cliente; \n 3 - Estoque; \n 4 - Gerenciar Dados da Empresa; \n 5 - Sair\n.\n");
		
		escolha = input.nextInt();
		
		if(escolha == 1) {
			
			Agenda agenda = new Agenda();
			
		}if(escolha == 2) {
			
			Cliente cliente = new Cliente();
			
		}if(escolha == 3) {
			
		//	Estoque estoque = new Estoque();
			
		}if(escolha == 4) {
			
			break;	
			
		}else {
			
			System.out.println("Você só pode escolher alguma das opções fornecidas ");
		}
		
		
      }while(escolha !=4);
		
	}
	
	
}
