package fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João\n");
		
		Scanner entra = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entra.nextLine();// comando usado pra excrever linhas atraves do scanner.
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = entra.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entra.nextInt();
		/*	
		* 	Sempre que usar um nextInt/double e precisar usar algo com string em seguida, use:
		*	(nome do scanner).nextLine(); para pular linha, pois eles deixam o \n pra tras e acabam
		*	não pulando a linha. 
		*/ 
		
		System.out.println("\nNome Completo = " + nome + " " + sobrenome);
		System.out.println("Idade = " + idade + "\n");
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		entra.close();// sempre feche o scanner apos de terminar de usar.
	}
}
