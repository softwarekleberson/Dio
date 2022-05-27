
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}

	@Override
	public void extrato() {

		System.out.println("Extrato da Conta Corrente");
		super.informacoesExtrato();
	}

}
