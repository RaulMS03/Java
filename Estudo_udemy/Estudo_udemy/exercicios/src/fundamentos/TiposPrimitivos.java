package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23; // maximo até 127, minimo -128.
		short numeroDeVoos = 542; // maximo até 32767, minimo até -32768.
		int id = 56789; // maximo até 2147483647, minimo até -2147483648.
		long pontosAcumulados = 3_234_845_223L; // depois de 2147483647 é interessente usar o long.
		
		/* Atenção:
		 * L = literal longo pois passa do maximo de numeros comportados no int.
		 * Valor maximo pra um long 922_337_203_685_477_580.
		 * Valor minimo -9_223_372_036_854_775_808.
		 */
		
		// Tipos numéricos reais
		float salario = 11_445.44F;//F significa literal float
		double vendasAcumuladas = 2_991_797_103.01;//Ponto flutuante menor que o float
		
		// Tipo booleano
		boolean estaDeFerias = false; // Ou pode ser "true" tambem.
		
		// Tipo caractere
		char status = 'A'; // Uma letra pra representar algo, so aceita uma letra, ou um simbolo "?", ou um numero "1". O 'A' significa ativo
		
		// Exemplos em pratica com base no estudo anterior
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365 + " dias.");
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2 + " viagens.");
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " pontos.");
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
