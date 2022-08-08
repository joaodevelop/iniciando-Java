
public class contaPoupança extends Conta {
	
	
	public contaCorrente(cliente cliente) {
		super(cliente);
	}
	

	
	
	
	@Override
	public void imprimirExtrato() {
		System.out.println("==== Extrato da Conta Poupança ====");
		super.imprimirInfos();
	
	}



	
	
	
}
	
