
public class Endereco {
	//atributos
	private String nomeRua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	//private Clientes endereco;
	
	//construtor
	public Endereco() {
		this.nomeRua = "Caelid";
		this.numero = "200";
		this.complemento = "proximo a uma torre cheia de dragão";
		this.bairro = "east of limgrave";
		this.cidade = "Lands Between";
		this.estado = "Elden ring";
		this.cep = "02435-045";
	}
	
	// getter e setter
	
	public String getNomeRua() {
		return this.nomeRua;
	}
	
	public void setNomeRua(String nm) {
		this.nomeRua = nm;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String num) {
		this.numero	= num;
	}
	
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setComplemento(String comp) {
		this.complemento = comp;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String ba) {
		this.bairro = ba;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cid) {
		this.cidade = cid;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setEstado(String est) {
		this.estado = est;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cp) {
		this.cep = cp;
	}
	
	/*public Clientes getClientes() {
		return this.endereco;
	}
	
	public void setClientes(Clientes cli) {
		this.endereco = cli;
	}*/
	
	
	//impressao 
	public void imprimirEndereco() {
		System.out.println("Rua: " + this.getNomeRua());
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Complemento: " + this.getComplemento());
		System.out.println("Bairro: " + this.getBairro());
		System.out.println("Cidade: " + this.getCidade());
		System.out.println("Estado: " + this.getEstado());
		System.out.println("CEP: " + this.getCep());
	}
}
