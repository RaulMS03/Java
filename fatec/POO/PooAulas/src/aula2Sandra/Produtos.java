package aula2Sandra;

public class Produtos {
	private int codProd;
	private String descricao;
	private double preco;
	
	// construtor sem parametros
	public Produtos() {
		this.codProd = 202;
		this.descricao = "Prod. na validade.";
		this.preco = 20.00;
	}
	
	// construtor com parametros
	public Produtos(int cod, String desc, double pre) {
		this.codProd = cod;
		this.descricao = desc;
		this.preco = pre;
	}
	
	// construtor copia
	public Produtos(Produtos p) {
		this.codProd = p.codProd;
		this.descricao = p.descricao;
		this.preco = p.preco;
	}
	
	// getters
	public int getCodProd() {
		return this.codProd;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	// setters
	public void setCodProd(int cod) {
		this.codProd = cod;
	}
	
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public void setPreco(double pre) {
		this.preco = pre;
	}
	
	// Impressao 
	public void imprimirProdutos() {
		System.out.println("Codigo do produto: " + this.codProd);
		System.out.println("Descricao do produto: " + this.descricao);
		System.out.println("Preco do produto: " + this.preco);
	}
}

