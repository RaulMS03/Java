package codigoRuiRossi;

import static javax.swing.JOptionPane.*;
import java.text.NumberFormat;

public class CadastroProdutos {
  public static void main(String[] args) {
    Tributavel[] registros =  new Tributavel[100];
    
    for (int i = 0; i < registros.length; i++) {
      Produto produto = null;
      String str = "";
      
      int tipo = showOptionDialog(null,"Tipo do produto",
        "Selecione",0,QUESTION_MESSAGE,null,
        new String[]{"Cosmético","Alimento"},"Cosmético");
      if(tipo == -1) break;
      if(tipo == 0) produto = new Cosmetico();
      else if(tipo == 1) produto = new Alimento();
    
      while (true) {
        str = showInputDialog(null,"Informe o código");
        if (str == null) break;
        try {
          produto.setCodigo(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      while (true) {
        str = showInputDialog(null,"Informe a descrição");
        if (str == null) break;
        try {
          produto.setDescricao(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      while (true) {
        str = showInputDialog(null,"Informe o preço");
        if (str == null) break;
        try {
          produto.setPreco(str);
          break;
        }
        catch(EDadoInvalido di) {
          showMessageDialog(null,di.getMessage(),"",ERROR_MESSAGE);
        }
      }
      if (str == null) break;
      
      registros[i] = produto;
    }
    
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String str = "";
    for (Tributavel t: registros) {
      if (t == null) break;
      str += "\n" + t + " - ICMS: " + nf.format( t.calcularIcms());
    }
    if (str.length() == 0) System.exit(0);
    
    showMessageDialog(null, str,"Lista de Produtos",
      INFORMATION_MESSAGE);
    System.exit(0);
  }
}

/*	Explicação:
 * 
 * 	Esse é o metodo main da classe "CadastroProduto" do programa, ele possui o import do interface grafica e o import de formatação de números.
 * 
 * 	Primeiramente é criado um array chamado "registros", capaz de armazenar ate 100 objetos que implementam a interface "Tributavel", ele serve para
 *  armazenar os produtos cadastrados.
 *  
 *  É iniciado um um loop por meio do "for", que percorre o array "registros" para cadastrar produtos. Dentro do loop é declarado duas variaveis, sendo elas,
 *  "produto" para representar o produto atual e "str" para coletar entradas do usuário.
 *  
 *  Em seguida temos uma variavel chamada "tipo" que armazena a opção do tipo do produto desejado (Cosmetico ou Alimento), isso tudo é feito por meio de 
 *  uma caixa de dialogo na interface grafica. Se o usuário clicar no botão "Cancelar" ou fechar a caixa de dialogo, o valor de "tipo" será -1 e o loop
 *  será interrompido usando "break". Caso o usuário selecione 0 para "Cosmetico" ou 1 para "Alimento", é criado uma instancia da classe "Cosmetico" ou 
 *  "Alimento" e é atribuido a variavel "produto"
 *  
 *  Apos isso, o codigo segue um "padrão" para coletar o código, descrição e preço, validando e verificando se eles correspondem com as condições, caso eles 
 *  estejam errados, uma exceção aparecera e sera tratada por meio do "EDadoInvalido". Apos tudo estar certo, é coletado as informações do produto, que é 
 *  armazenado no array "registros"
 *  
 * 	Logo apos, é criado uma instancia do "NumberFormat" para formatar os valores monetários e, em seguida, é iniciado outro loop para iterar os produtos 
 * 	armazenados em "registros". Se um elemento no array "registro" for "null", isso indica o fim dos produtos cadastrados, e o loop é interrompido usando
 * 	"break". Dentro do loop, os detalhes de cada produto, incluindo a descrição e o valor do ICMS calculado, são formatados em uma string e adicionados
 *  à variavel "str". Caso a variavel "str" esteja vazia (sem produtos cadastrados), o programa é encerrado com "System.exit(0)".
 *  
 *  Por fim, uma caixa de diálogo é usada para exibir a lista de produtos cadastrados, incluindo suas informações e valores de ICMS. Após a exibição da 
 *  caixa de diálogo, o programa é encerrado com "System.exit(0)".
 *  
 * 
 * 	Resumo e explicação do funcionamento do codigo geral:
 *	
 *	Este programa permite ao usuário cadastrar produtos do tipo "Cosmetico" ou "Alimento", coletando código, descrição e preço para cada produto, e em seguida, 
 *	exibe uma lista dos produtos cadastrados com seus respectivos valores de ICMS em uma caixa de diálogo antes de encerrar a execução. A estrutura do programa 
 *	é guiada por caixas de diálogo e loops que coletam as informações necessárias do usuário e garantem que os dados sejam válidos, e no final exibe a quantida de
 * 	produtos inseridos pelo usuario.
 */



/********************************************************************
 * Este arquivo � parte integrante do livro identificado abaixo e � *
 * protegido pela legisla��o que trata dos direitos autorais.        *
 *                                                                  *
 * T�tulo:  Programa��o de Computadores em Java                      *
 * Autor:   Rui Rossi dos Santos                                    *
 * Editora: NovaTerra Editora e Distribuidora Ltda.                 *
 * Ano:     2014                                                    *
 ********************************************************************/