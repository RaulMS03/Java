package sistemaVacina;
import java.util.Scanner;

public class VerificaAnimal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Vacina[] vac = new Vacina[100];
		
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------| Sistema de Vacinas! |-------------");
		System.out.println("------------- | Qual o seu animal:|--------------");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		System.out.println("1 - Cachorro.");
		System.out.println("2 - Gato.");
		System.out.println("3 - Sair.");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		int tipo = ler.nextInt();
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < vac.length; i++) {
			
			if(tipo == 1) {
				Animal ani = new Cachorro();
				System.out.println("Digite o nome: ");
				ler.nextLine();
				String nome = ler.nextLine();
				ani.setNome(nome); 
				
				System.out.println("-------------------------------------------------");	
				System.out.println("Digite a Idade: ");
				int idade = ler.nextInt();
				ani.setIdade(idade);
				ler.nextLine();
				
				System.out.println("-------------------------------------------------");	
				System.out.println("Digite o Peso: ");
				double peso = ler.nextDouble();
				ani.setPeso(peso);
				ler.nextLine();
				
				System.out.println("-------------------------------------------------");	
				System.out.println("Digite o Tamanho: ");
				double tamanho = ler.nextDouble();
				ani.setTamanho(tamanho);
				ler.nextLine();
				
				System.out.println("-------------------------------------------------");	
				System.out.println("Digite o Porte: ");
				String porte = ler.nextLine();
				ani.setPorte(porte);
				
				System.out.println("-------------------------------------------------");
				System.out.println("Digite a data: ");
				String data = ler.nextLine();
				ani.setData(data);
				
				vac[i] = ani;
				
				for (Vacina v: vac) {
					if(v == null) break;
					System.out.println("-------------------------------------------------");
					System.out.println("-------------------------------------------------");
					System.out.println("-----------------|Ficha Animal|------------------");
					System.out.println("-------------------| Dogers |--------------------");
					System.out.println("-------------------------------------------------");
					System.out.println("-------------------------------------------------");
					System.out.println("Dose: " + v.calcularVacina() + " Ml's");
					System.out.println(v.toString());
					System.out.println("-------------------------------------------------");
					System.out.println("-------------------------------------------------");
				}
				
				break;
			}
			
		}

		
		for (int i = 0; i < vac.length; i++) {
			if(tipo == 2) {
				Animal gat = new Gato();
				System.out.println("Digite o nome: ");
				ler.nextLine();
				String nome = ler.nextLine();
				gat.setNome(nome);
				
				System.out.println("-------------------------------------------------");
				System.out.println("Digite a Idade: ");
				int idade = ler.nextInt();
				gat.setIdade(idade);
				ler.nextLine();
				
				System.out.println("-------------------------------------------------");
				System.out.println("Digite o Peso: ");
				double peso = ler.nextDouble();
				gat.setPeso(peso);
				ler.nextLine();
				
				System.out.println("-------------------------------------------------");
				System.out.println("Digite o Tamanho: ");
				double tamanho = ler.nextDouble();
				gat.setTamanho(tamanho);
				ler.nextLine();
				
				System.out.println("-------------------------------------------------");
				System.out.println("Digite o Porte: ");
				String porte = ler.nextLine();
				gat.setPorte(porte);
			
				System.out.println("-------------------------------------------------");
				System.out.println("Digite a data: ");
				String data = ler.nextLine();
				gat.setData(data);
				
				vac[i] = gat;
				
				for (Vacina g: vac) {
					if(g == null) break;
					System.out.println("-------------------------------------------------");
					System.out.println("-------------------------------------------------");
					System.out.println("-----------------|Ficha Animal|------------------");
					System.out.println("-------------------| Caters |--------------------");
					System.out.println("-------------------------------------------------");
					System.out.println("-------------------------------------------------");
					System.out.println("Dose: " + g.calcularVacina() + " Ml's");
					System.out.println(g.toString());
					System.out.println("-------------------------------------------------");
					System.out.println("-------------------------------------------------");
				}
				
				break;
			}
		}
		
		while(tipo == 3) {
			break;
		}
		
		ler.close();
	}
}
