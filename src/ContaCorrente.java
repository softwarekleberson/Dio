
public final class ContaCorrente extends Conta implements IExtrato {
	
	private Cliente cliente;
	private ContaCorrente contaCorrente;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void extrato(Cliente cliente, Conta conta) {
		InformacoesExtrato extrato = new InformacoesExtrato();
		extrato.tirarExtrato(cliente, conta);
	}

	
	
}
