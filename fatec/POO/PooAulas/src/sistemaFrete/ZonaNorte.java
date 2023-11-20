package sistemaFrete;

public class ZonaNorte extends Correio {
	public double calcularFrete() {
		return super.getPreco() * 0.30;
	}
}
