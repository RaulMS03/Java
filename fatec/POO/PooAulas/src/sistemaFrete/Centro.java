package sistemaFrete;

public class Centro extends Correio {
	public double calcularFrete() {
			return super.getPreco() * 0.10;
	}
}
