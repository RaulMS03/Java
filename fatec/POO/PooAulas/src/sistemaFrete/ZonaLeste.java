package sistemaFrete;

public class ZonaLeste extends Correio {
	public double calcularFrete() {
		return super.getPreco() * 0.20;
	}
}
