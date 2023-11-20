package aula3Sandra;

public class Juridicas extends Pessoas {
	//atributos
	private String cnpj;
	
	// construtor
	public Juridicas() {
		super("FARIAR LIMERS", "35.675.123-4");
		this.cnpj = "132.354-5467"; 
	}
	
	//Impressao
	public void ImprimirJuridicas() {
		ImprimirPessoas(); 
		System.out.println("Cnpj: " + this.cnpj);
	}
}
