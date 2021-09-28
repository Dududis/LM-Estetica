package Classes;

public abstract class Pessoa {
	
	protected String nome;
	protected String sobrenome;
	protected int idade;
	protected int rg;
		
	public String getNome(String nome) {
		   return nome;
	}	
		
	public void setnome(String nome) {
		this.nome = nome;
	}	
		
	public String getsobrenome(String sobrenome) {
		   return sobrenome;
	}	
		
	public void setsobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}		
		
	public int getidade(int idade) {
		   return idade;
	}	
		
	public void setidade(int idade) {
		this.idade = idade;
	
	}
	
	public int getrg(int rg) {
		   return rg;
	}	
		
	public void setrg(int rg) {
		this.rg = rg;
	}
	
	
	
	
	
}//fim
