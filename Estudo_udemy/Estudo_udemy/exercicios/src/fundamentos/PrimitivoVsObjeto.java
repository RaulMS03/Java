package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		// tudo o resto alem dos tipos primitivos são objetos.
		String s = "texto";
		s.toUpperCase();
		
		
		// wrappers são a versão objeto dos tipos primitivos.
		int a = 123;
		System.out.println(a);
	}
}
