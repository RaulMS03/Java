package aula3Sandra;

public class TestaPessoa {
	public static void main(String[] args) {
		Fisicas fi = new Fisicas();
		Juridicas j = new Juridicas();
		
		System.out.println("Pessoas: ");
		fi.ImprimirFisicas();
		System.out.println("----------------------------------------");
		System.out.println("Grandes Empresas, Pequenos Negocios:");
		j.ImprimirJuridicas();
	}
}
