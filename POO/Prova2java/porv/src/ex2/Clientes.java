
public class Clientes {
	// atributos
		private String nome;
		private String sobrenome;
		private String cpf;
		private Endereco local;
		
		// construtores
		public Clientes() {
			this.nome = "Eldenringueson";
			this.sobrenome = "Dark Soulza";
			this.cpf = "123-456-789-0";
		}
		
		public Clientes(String nm, String sb, String cp, String end) {
			this.nome = nm;
			this.sobrenome = sb;
			this.cpf = cp;
		}
		
		public Clientes(Clientes c) {
			this.nome = c.nome;
			this.sobrenome = c.sobrenome;
			this.cpf = c.cpf;
		}
		
		// metodos getters e setters
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String nm) {
			this.nome = nm;
		}
		
		public String getSobrenome() {
			return this.sobrenome;
		}
		
		public void setSobrenome(String sb) {
			this.sobrenome = sb;
		}
		
		public String getCpf() {
			return this.cpf;
		}
		
		public void setCpf(String cp) {
			this.cpf = cp;
		}
		
		public Endereco getEndereco() {
			return this.local;
		}
		
		public void setEndereco(Endereco end) {
			this.local = end;
		}
		
		// impressao
		public void imprimirClientes() {
			System.out.println("Nome: " + this.getNome());
			System.out.println("Sobrenome: " + this.getSobrenome());
			System.out.println("CPF: " + this.getCpf());
		}
}
