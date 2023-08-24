package fundamentos;
import java.util.Date;// exercicio basico de import, mostrando como funciona.

public class Import {
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!";// caminho completo do java
		System.out.println(b);
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		// crtl + shift + o: organiza os imports.
		//JButton botao = new JButton();
	}
}
