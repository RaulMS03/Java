package aula3Sandra;

public class Fisicas extends Pessoas {
	// atributos
	private String cpf;
	private String dataDeNascimento;
	
	//construtor
	public Fisicas() {
		super();
		this.cpf = "123.456.678-9";
		this.dataDeNascimento = "12/05/2101";
	}
	
	//impressao
	public void ImprimirFisicas() {
		ImprimirPessoas();
		System.out.println("CPF:" + this.cpf);
		System.out.println("Data de nascimento: " + this.dataDeNascimento);
	}
}
