package sistemaVacina;

public abstract class Animal implements Vacina {
	// atributos
	private String nome;
	private int idade;
	private double peso;
	private double tamanho;
	private String porte;
	private String data;
	
	// metodos getters 
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getTamanho() {
		return this.tamanho;
	}
	
	public String getPorte() {
		return this.porte;
	}
	
	public String getData() {
		return this.data;
	}
	
	// metodos setters
	public void setNome(String nm) {
		this.nome = nm;
	}
	
	public void setIdade(int id) {
		this.idade = id;
	}
	
	public void setPeso(double pe) {
		this.peso = pe;
	}
	
	public void setTamanho(double tam) {
		this.tamanho = tam;
	}
	
	public void setPorte(String por) {
		this.porte = por;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return String.format(
				"Nome: %s\nIdade: %s anos\nPeso: %s quilos\nTamanho: %s cm\nPorte: %s\nData: %s",
				getNome(),
				getIdade(),
				getPeso(),
				getTamanho(),
				getPorte(),
				getData()
		);
	}
	
	//metodo de impressão 
	public void imprimirAnimal() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Peso: " + getPeso());
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("Porte: " + getPorte());
	}
}
