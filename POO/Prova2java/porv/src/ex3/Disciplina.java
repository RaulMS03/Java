
public class Disciplina {
	private String nomeDisc;
    private int cargaHoraria;
    private Curso curso;
    
    public Disciplina() {
    	this.nomeDisc = "DESGRACA DE POO";
    	this.cargaHoraria = 200;
    }

    public Disciplina(String nomeDisc, int cargaHoraria) {
        this.nomeDisc = nomeDisc;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public Curso getCurso() {
    	return this.curso;
    }
    
    public void setCurso(Curso c) {
    	this.curso = c;
    }
    
    // impressao 
    
    public void imprimirDisciplina() {
    	System.out.println("Nome da Disciplina: " + this.getNomeDisc());
    	System.out.println("Carga horaria: " + this.getCargaHoraria());
    }
}
