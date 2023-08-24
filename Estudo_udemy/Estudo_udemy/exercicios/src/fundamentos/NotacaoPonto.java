package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
	
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // "replace" pega a primeira posicao e troca pela segunda
		s = s.toUpperCase();// "toUpperCase" deixa tudo maiusculo
		s = s.concat("!!!");// "Concat" concatena no final da frase
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());// por ser uma string, é possivel utilizar o metodo sem declarar a variavel
		
		String y = "Bom dia X" // é possivel quebrar a linhas no ponto ou apos dele para continuar a aplicaçao de metedos.
				.replace("X", "Raul")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
