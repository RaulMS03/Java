package aula2Sandra;
import java.util.Scanner;

public class SistemaVendas {
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		Clientes cli = new Clientes(); // uso do get
		Pedidos ped = new Pedidos(); // uso do set
		// construtor copia
		Produtos p = new Produtos();
		Produtos p1 = new Produtos(p);
		
		System.out.println("Bem vindo ao nosso sistema de vendas\n 1 - Clientes\n 2 - Pedidos\n 3 - Produtos\n 4 - Sair\nO que deseja acessar?");
		int selecao = entra.nextInt();
		while(selecao == 1 || selecao == 2 || selecao == 3 || selecao == 4) {
			if (selecao == 1) {
				cli.imprimirCliente();
				System.out.println("O que deseja acessar?\n 1 - Clientes\n 2 - Pedidos\n 3 - Produtos\n 4 - Sair\n");
				selecao = entra.nextInt();
			} else if (selecao == 2){
				ped.setNumeroPed(10);
				ped.setDataPed("24/03/2005");
				ped.setValorPed(15.00);
				ped.imprimirPedidos();
				System.out.println("O que deseja acessar?\n 1 - Clientes\n 2 - Pedidos\n 3 - Produtos\n 4 - Sair\n");
				selecao = entra.nextInt();
			} else if (selecao == 3) {
				p1.imprimirProdutos();
				System.out.println("O que deseja acessar?\n 1 - Clientes\n 2 - Pedidos\n 3 - Produtos\n 4 - Sair\n");
				selecao = entra.nextInt();
			} else if (selecao == 4){
				break;
			}
		}
		entra.close();
	}
}
