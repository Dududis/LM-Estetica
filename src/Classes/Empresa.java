package Classes;

import java.util.Scanner;

public class Empresa {
//nome, cnpj, nicho
	protected String nome;
	protected String cnpj;
	protected String nicho;
	
	public String getNome(String nome) {
		   return nome;
	}	
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj(String cnpj) {
		   return cnpj;
	}	
		
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNicho(String nicho) {
		   return nicho;
	}	
		
	public void setNicho(String nicho) {
		this.nicho = nicho;
	}
	
	 
      Empresa(){
    	  
    	  @SuppressWarnings("resource")
			Scanner input =  new Scanner(System.in);
    	  
    	  System.out.println("Digite o nome da empresa a ser cadastrada");
    	  String nome = input.nextLine();
			this.setNome(nome);
    	  
    	  System.out.println("Digite o CNPJ da empresa");
    	  String cnpj = input.nextLine();
    	    this.setCnpj(cnpj);
    	 
    	    System.out.println("Digite o ramo de atuação da empresa");
    	  String nicho = input.nextLine();
    	     this.setNicho(nicho);
    	       	    
    	  Empresa.contrataFuncionario();   
      }
	
	   public static void contrataFuncionario() {
		 System.out.println("iniciando o cadastro dos funcionários.");
		 System.out .println("Cadastro Massoterapeuta");
		 Funcionario a = new Funcionario();
   
	   }
      
      
}//fim
