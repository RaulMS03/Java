package aula3Sandra;

public class Pessoas {
	//atributos 
	private String nome;
	private String rg;
	
	//construtor 
	public Pessoas() {
		this.nome = "Raul Abliblubli";
		this.rg = "67.234.234-5";
	}
	
	public Pessoas(String nm, String r) {
		this.nome = nm;
		this.rg = r;
	}
	
	//get
	public String getNome() {
		return this.nome;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	//impressao
	public void ImprimirPessoas() {
		System.out.println("Nome: " + getNome());
		System.out.println("RG: " + getRg());
	}
	
}
