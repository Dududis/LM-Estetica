//Luiz Eduardo Matias e Ana Carolina Nascimento  data: 27/09 Hor�rio 04:06 
//Engenharia da computa��o 4 p�riodo
//Programa para cadastro de uma empresa no ramo da est�tica 

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
		
		System.out.printf("Ol�, bem vindo ao gerenciador. \n\n");
		System.out.println("Inicializando... \n\n");
		Empresa empresa = new Empresa();
		
		System.out.printf("Bem vindo ao gerenciador, empresa %s. \n", empresa.getEmpresa());
		System.out.println("Escolha uma das op��es abaixo");
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
			
			System.out.println("Voc� s� pode escolher alguma das op��es fornecidas ");
		}
		
		
      }while(escolha !=4);
		
	}
	
	
}
