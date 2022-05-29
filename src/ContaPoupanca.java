
public final class ContaPoupanca extends Conta implements IExtrato{

	private Cliente cliente;
	private ContaPoupanca contaPoupanca;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void extrato(Cliente cliente, Conta conta) {
		InformacoesExtrato extrato = new InformacoesExtrato();
		extrato.tirarExtrato(cliente, conta);
	}
}
