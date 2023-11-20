package codigoRuiRossi;

public class EDadoInvalido extends Exception {
	private static final long serialVersionUID = 1L;

public EDadoInvalido() {
    super("Dado inválido!");
  }
  
  public EDadoInvalido(String mensagem) {
    super("Dado inválido!\n" + mensagem);
  }
}

/*	Explicação:
 * 
 * 	A classe "EDadoInvalido" é uma classe que estende a classe "Exception", que significa que a classe "EDadoInvalido" é uma 
 * 	classe de exceção personalizada que pode ser usada para representar erros especificos a dados invalidos.
 * 
 * 	Em seguida é definida a variavel chamada "serialVersionUID", é a variavel usada para controlar a versão da classe para fins de 
 *  serialização (é o processo de converter um objeto Java em uma sequencia de bytes para armazenamento). O valor "1L" é uma convenção comum
 *  para a versão da classe(e pode ser incrementado quando a classe é modificada).
 *  
 *  O primeiro construtor é criado sem fornecer uma mensagem personalizada, ele chama o construtor da classe pai "Exception" 
 *  utilizando da palavra "super" para passar a mensagem "Dado inválido!". Isso significa que por padrão, um objeto "EDadoinvalido" tera
 *  a mensagem "Dado inválido!" associada a ele quando for lançado como uma exceção.  
 *  
 *  Ja o segundo construtor recebe uma mensagem personalizada como argumento e chama o construtor da classe pai "Exception" com a mensagem
 *  "Dado inválido!" seguida pela mensagem personalizada fornecida como parte da exceção. Isso permite que voce crie objetos "EDadoInvalido"
 *  com mensagens especificas que fornecem detalhes sobre o erro ocorrido.
 */



/********************************************************************
 * Este arquivo � parte integrante do livro identificado abaixo e � *
 * protegido pela legisla��o que trata dos direitos autorais.       *
 *                                                                  *
 * T�tulo:  Programa��o de Computadores em Java                     *
 * Autor:   Rui Rossi dos Santos                                    *
 * Editora: NovaTerra Editora e Distribuidora Ltda.                 *
 * Ano:     2014                                                    *
 ********************************************************************/