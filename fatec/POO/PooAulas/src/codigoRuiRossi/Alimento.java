package codigoRuiRossi;

public class Alimento extends Produto {
  public double calcularIcms() { 
    return super.getPreco() * 0.12; 
  }
}


/* 	Explicação:
 * 
 *  A classe "Alimento" é uma subclasse da classe "Produto".
 *  O metodo "calcularIcms()" é um "double" e publico, pode ser acessado fora da classe.
 * 	Aqui acontece o calculo do Icms da classe "Alimento", "super" é usado para chamar o metodo "getPreco()" da classe pai "Produto".
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