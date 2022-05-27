
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}

	@Override
	public void extrato() {

		System.out.println("Extrato da Conta Corrente");
		super.informacoesExtrato();
	}

	
	
}
