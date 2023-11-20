package sistemaFrete;

import static javax.swing.JOptionPane.*;
import java.text.NumberFormat;

public class VerificaEntrega {
	public static void main(String[] args) {
		Frete[] taxa = new Frete[100];
		
		for(int i = 0; i < taxa.length; i++) {
			Correio correio = null;
			String sr = "";
			
			int zona = showOptionDialog(null, "Selecione o destino", "Serviço de Entrega",
					0,QUESTION_MESSAGE,null,new String[] {"Centro","Zona Norte","Zona Sul", "Zona Leste", "Zona Oeste", "Sair"}, null);
			if(zona == -1) break;
			if(zona == 0) correio = new Centro();
			if(zona == 1) correio = new ZonaNorte();
			if(zona == 2) correio = new ZonaSul();
			if(zona == 3) correio = new ZonaLeste();
			if(zona == 4) correio = new ZonaOeste();
			if(zona == 5) System.exit(0);
			
			 while (true) {
			        sr = showInputDialog(null,"Informe o CEP: ");
			        if (sr == null) break;
			        try {
			          correio.setCep(sr);
			          break;
			        }
			        catch(TratamentoErros tr) {
			          showMessageDialog(null,tr.getMessage(),"",ERROR_MESSAGE);
			        }
			      }
			  if (sr == null) break;
		      
		      while (true) {
			        sr = showInputDialog(null,"Informe o Endereço: ");
			        if (sr == null) break;
			        try {
			          correio.setEndereco(sr);
			          break;
			        }
			        catch(TratamentoErros tr) {
			          showMessageDialog(null,tr.getMessage(),"",ERROR_MESSAGE);
			        }
			      }
			  if (sr == null) break;
		      
		      while (true) {
			        sr = showInputDialog(null,"Informe a Descrição: ");
			        if (sr == null) break;
			        try {
			          correio.setDescricao(sr);
			          break;
			        }
			        catch(TratamentoErros tr) {
			          showMessageDialog(null,tr.getMessage(),"",ERROR_MESSAGE);
			        }
			      }
			  if (sr == null) break;
		      
		      while (true) {
		          sr = showInputDialog(null,"Informe o preço");
		          if (sr == null) break;
		          try {
		            correio.setPreco(sr);
		            break;
		          }
		          catch(TratamentoErros tr) {
		            showMessageDialog(null,tr.getMessage(),"",ERROR_MESSAGE);
		          }
		        }
		        if (sr == null) break;
		        
		        taxa[i] = correio;
		      }
		
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				String sr = "";
				for (Frete f: taxa) {
					if (f == null) break;
					sr += "\n" + f + " - FRETE: " + nf.format( f.calcularFrete());
				}
				if (sr.length() == 0) System.exit(0);
	    
				showMessageDialog(null, sr,"Lista de Entregas",
						INFORMATION_MESSAGE);
				System.exit(0);
			
		}
}


