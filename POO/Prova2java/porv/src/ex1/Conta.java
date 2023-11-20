
public class Conta {
	// atributos
	private int numero;
	private double saldo;
	private double limite;
	// em "Conta" é declarado um atributo do tipo "Clientes"
	private Clientes titular;
		
	// construtores
	public Conta() {
		this.numero = 300;
		this.saldo = 50000;
		this.limite = 2000;
	}
	
	public Conta(int nm, double sl, double lim) {
		this.numero = nm;
		this.saldo = sl;
		this.limite = lim;
	}
	
	public Conta(Conta d) {
		this.numero = d.numero;
		this.saldo = d.saldo;
		this.limite = d.limite;
	}
	
	// metodos getters e setters
	
	public int getNumero() { 
		return this.numero;
	}
	
	public void setNumero(int nm) {
		this.numero = nm;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double sl) {
		this.saldo = sl;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double lim) {
		this.saldo = lim;
	}
	
	
	// necessita de um getter e setter para "Clientes titular", estrutura a seguir:
	
	public Clientes getClientes() {
		return this.titular;
	}
	
	public void setClientes(Clientes cli) {
		// ira receber a referencia de um objeto.
		this.titular = cli;
	}
	
	// metodo impressao
	
	public void imprimirConta() {
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Limite: " + this.getLimite());
	}
}
