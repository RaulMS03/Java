package codigoRuiRossi;

public interface Tributavel {
  double calcularIcms();
}

/*	Explicação:
 * 
 * 	A "interface" é publica, que indica que essa interface é acessivel fora do pacote onde esta definida.
 * 
 * 	As classes "Alimento" e "Cosmetico" implementam a interface "Tributavel" para indicar que elas tem a capacidade de 
 *  calcular o Icms de acordo com as regras especificas para "Alimentos" e "Cosmeticos".
 *  
 *  Dessa maneira, é possivel criar objetos dessas classes e chamar o metodo "calcularIcms()" para calcular o Icms com base nas 
 *  taxas especificas definidas em cada classe. Isso nos permite tratar objetos de diferentes classes de maneira uniforme, desde 
 *  todas implementem a interface "Tributavel".
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