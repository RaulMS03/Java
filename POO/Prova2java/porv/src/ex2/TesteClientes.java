
public class TesteClientes {
	public static void main(String[] args) {
		
		Clientes c = new Clientes();
		Conta cont = new Conta();
		Endereco end = new Endereco();
		
		cont.setClientes(c);
		c.setEndereco(end);
		
		/*
		System.out.println("Referencia do objeto na memoria: " + cont.getClientes());	
		System.out.println("Titular: " + cont.getClientes().getNome() + "\n");
		*/
		
		c.imprimirClientes();
		end.imprimirEndereco();
		cont.imprimirConta();
	}
}
