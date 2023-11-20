package sistemaVacina;

public class Gato extends Animal {
	public double calcularVacina() {
		if(super.getPeso() <= 10) {
			return super.getPeso() * 0.01;
 		} else if (super.getPeso() > 10 && super.getPeso() <= 15) {
 			return super.getPeso() * 0.015;
 		} else if (super.getPeso() > 15 && super.getPeso() <= 25) {
 			return super.getPeso() * 0.02;
 		} else if (super.getPeso() > 25) {
 			return super.getPeso() * 0.03;
 		}
		return super.getPeso();
	}
}
