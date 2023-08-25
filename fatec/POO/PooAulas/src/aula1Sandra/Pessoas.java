package aula1Sandra;

public class Pessoas {
	public int id;
    public String nome;
    public String endereco;
    
    public Pessoas() {
    	this.id = 12;
    	this.nome = "Ronaldo";
    	this.endereco = "Luganenhum";
    }
    
    public Pessoas(int cod, String nm, String end) {
    	this.id = cod;
    	this.nome = nm;      
    	this.endereco = end;
    }
    
    public Pessoas(Pessoas p) {
    	this.id = p.id;
    	this.nome = p.nome;
    	this.endereco = p.endereco;
    }
    

    public void ImprimirPessoa() {
        System.out.println("id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
    }
}
