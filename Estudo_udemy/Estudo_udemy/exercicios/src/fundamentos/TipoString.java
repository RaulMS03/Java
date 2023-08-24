package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));// charAt pega a posição da letra
		
		String s = "Boa tarde";// nao podemos modificar o valor original, mas alterar as suas propriedades.
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));// "começa com" -> a palavra desejada pra conferir.
		System.out.println(s.startsWith("boa"));// iniciamos a string com maiusculo, vai dar falso 
		System.out.println(s.toLowerCase().startsWith("boa"));// agora vai dar true, pois, transformamos tudo em minuscula e verificamos.
		System.out.println(s.endsWith("tarde"));// mesmo processo do startsWith, porem ele ve o final.
		System.out.println(s.length());// conta quantos caracteres tem na frase.
		System.out.println(s.equals("boa tarde"));// ele esta verificando se é igual a String instanciada, porem vai dar falso pois esta em minuscula.
		System.out.println(s.equalsIgnoreCase("boa tarde"));// neste caso vai dar verdadeiro, pois ele vai ignorar se esta em maiusculo ou minusculo.
		
		//Maneiras diferentes de lidar com variaveis.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		//maneira 1, mais demorada:
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario " + salario + "\n\n");
		
		//maneira 2, mais rapida e simples:
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		//%s -> string, %d -> valores inteiros, %f -> valores com decimal(pode-se usar .2, .1, .3, pra alterar o tamanho das casas decimais).
		
		//maneira 3, não é muito diferente:
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);// basicamente a mesma coisa so que dentro de uma variavel.
		
 		System.out.println("Frase qualquer".contains("qual")); // verifica se contem na frase.
		System.out.println("Frase qualquer".indexOf("qual"));// pega o que esta escrito e mostra a posição inicial.
		System.out.println("Frase qualquer".substring(6));// pega o indice desejado e começa a partir dele.
		System.out.println("Frase qualquer".substring(6, 10));// inicia no indice 6 e termina no 10(na verdade o 10 nao esta incluido, entao vamos até o 9)
	}
}
