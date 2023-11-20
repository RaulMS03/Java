package sistemaFrete;

public class ZonaSul extends Correio{
	public double calcularFrete() {
		return super.getPreco() * 0.50;
	}
}
