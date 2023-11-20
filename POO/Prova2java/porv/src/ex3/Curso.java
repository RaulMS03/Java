
public class Curso {
	private int codigo;
    private String nome;
    private int cargaTotal;
    
    public Curso() {
    	this.codigo = 001;
    	this.nome = "ADS";
    	this.cargaTotal = 200;
    }

    public Curso(int codigo, String nome, int cargaTotal) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaTotal = cargaTotal;
    }

    // Getters e Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaTotal() {
        return cargaTotal;
    }

    public void setCargaTotal(int cargaTotal) {
        this.cargaTotal = cargaTotal;
    }
    
    // impressao
    
    public void imprimirCurso() {
    	System.out.println("Cod: " + this.getCodigo());
    	System.out.println("Nome: " + this.getNome());
    	System.out.println("Carga Total: " + this.getCargaTotal() + " horas");
    }
}
