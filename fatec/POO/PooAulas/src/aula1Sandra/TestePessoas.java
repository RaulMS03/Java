package aula1Sandra;
import java.util.Scanner;

public class TestePessoas {
    public static void main(String[]args) {
        Scanner entra = new Scanner(System.in);
        Pessoas p = new Pessoas();
        
        System.out.println("Insira os dados.");
        System.out.println("Insira o id: ");
        p.id = entra.nextInt();
        entra.nextLine();
        System.out.println("Insira o nome: ");
        p.nome = entra.nextLine();
        System.out.println("Insira o endereço: ");
        p.endereco	= entra.nextLine();
        p.ImprimirPessoa();
        entra.close();
    }
}
  