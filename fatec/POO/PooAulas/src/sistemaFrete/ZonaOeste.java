package sistemaFrete;

public class ZonaOeste extends Correio {
	public double calcularFrete() {
		return super.getPreco() * 0.40;
}
}
