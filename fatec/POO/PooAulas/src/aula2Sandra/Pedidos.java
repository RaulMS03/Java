package aula2Sandra;

public class Pedidos {
	private int numeroPed;
	private String dataPed;
	private double valorPed;
	
	// construtor sem parametro
	public Pedidos() {
		this.numeroPed = 01;
		this.dataPed = "12/04/2023";
		this.valorPed = 12.50;
	}
	
	// construtor com parametro 
	public Pedidos(int num, String data, double val) {
		this.numeroPed = num;
		this.dataPed = data;
		this.valorPed = val;
	}
	
	// construtor copia
	public Pedidos(Pedidos p) {
		this.numeroPed = p.numeroPed;
		this.dataPed = p.dataPed;
		this.valorPed = p.valorPed;
	}
	
	// getters
	public int getNumeroPed() {
		return this.numeroPed;
	}
	
	public String getDataPed() {
		return this.dataPed;
	}
	
	public double getValorPed() {
		return this.valorPed;
	}
	
	// setters
	
	public void setNumeroPed(int num) {
		this.numeroPed = num;
	}
	
	public void setDataPed(String data) {
		this.dataPed = data;
	}
	
	public void setValorPed(double val) {
		this.valorPed = val;
	}
	
	// impressao dos valores
	public void imprimirPedidos() {
		System.out.println("Numero do pedido: " + this.numeroPed);
		System.out.println("Data do pedido: " + this.dataPed);
		System.out.println("Valor do pedido: " + this.valorPed);
	}
}
