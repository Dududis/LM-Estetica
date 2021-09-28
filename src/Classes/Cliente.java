package Classes;

public abstract class Cliente {

	private String nome;
	private String sobrenome;
	private boolean alergia;
	private String tipodealergia;
	
	public String getNome(String nome) {
		   return nome;
	}	
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome(String sobrenome) {
		   return sobrenome;
	}	
		
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getAlergia(String alergia) {
		   return alergia;
	}
	
	public boolean setAlergia(boolean alergia) {
		return this.alergia = alergia;
	}
		
	
	public String getTipodealergia(String tipodealergia) {
		   return tipodealergia;
	}	
		
	public void setTipodealergia(String tipodealergia) {
		this.tipodealergia = tipodealergia;
	}
	
	
}// fim
