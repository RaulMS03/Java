
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		
		int i;
		Curso c = new Curso();
		Disciplina d[] = new Disciplina [5];
		c.imprimirCurso();
		System.out.println("");
		
		i = 0;
		while(i<5) {
			d[i] = new Disciplina();
			System.out.println("Entre com o nome da disciplina: ");
			d[i].setNomeDisc(entra.nextLine());
			System.out.println("Entre com a carga horaria da disciplina: ");
			d[i].setCargaHoraria(entra.nextInt());
			entra.nextLine();
			d[i].setCurso(c);
			i++;
		}
		
		for (Disciplina disciplina: d) {
			disciplina.imprimirDisciplina();
		}
    }
}
