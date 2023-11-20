package sistemaFrete;

public class TratamentoErros extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TratamentoErros() {
		super("Erro: Dados Invalidos!");
	}
	
	public TratamentoErros(String msg) {
		super("Erro: Dados Invalidos!\n" + msg);
	}
}
