package aula2Sandra;

public class Clientes {
	private int codCli;
	private String nomeCli;
	private String enderecoCli;
	private String telefoneCli;
	
	// construtor sem parametro
	public Clientes() {
		this.codCli = 1;
		this.nomeCli = "Raul";
		this.enderecoCli = "Av. das Batatas";
		this.telefoneCli = "11 96852-6477";
	}
	
	// construtor com parametro
	public Clientes(int cod, String nome, String end, String tel) {
		this.codCli = cod;
		this.nomeCli = nome;
		this.enderecoCli = end;
		this.telefoneCli = tel;
	}
	
	// construtor copia
	public Clientes(Clientes c) {
		this.codCli = c.codCli;
		this.nomeCli = c.nomeCli;
		this.enderecoCli = c.enderecoCli;
		this.telefoneCli = c.telefoneCli;
	}
	
	// getters
	public int getCodCli() {
		return this.codCli;
	}
	
	public String getNomeCli() {
		return this.nomeCli;
	}
	
	public String getEnderecoCli() {
		return this.enderecoCli;
	}
	
	public String getTelefoneCli() {
		return this.telefoneCli;
	}
	
	// setters
	public void setCodCli(int cod) {
		this.codCli = cod;
	}
	
	public void setNomeCli(String nome) {
		this.nomeCli = nome;
	}
	
	public void setEnderecoCli(String end) {
		this.enderecoCli = end;
	}
	
	public void setTelefoneCli(String tel) {
		this.telefoneCli = tel;
	}
	
	// impressao com o get
	public void imprimirCliente() {
		System.out.println("Codigo do Cliente: " + getCodCli());
		System.out.println("Nome do Cliente: " + getNomeCli());
		System.out.println("Endereco do Cliente: " + getEnderecoCli());
		System.out.println("Telefone do Cliente: " + getTelefoneCli());
	}
}
