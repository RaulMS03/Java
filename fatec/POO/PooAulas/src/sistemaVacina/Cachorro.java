package sistemaVacina;

public class Cachorro extends Animal {
	public double calcularVacina() {
		if(super.getPeso() <= 15) {
			return super.getPeso() * 0.01;
 		} else if (super.getPeso() > 15 && super.getPeso() <= 25) {
 			return super.getPeso() * 0.1;
 		} else if (super.getPeso() > 25 && super.getPeso() <= 35) {
 			return super.getPeso() * 0.15;
 		} else if(super.getPeso() > 35) {
 			return super.getPeso() * 0.2;
  		}
		return super.getPeso();
	}
}
