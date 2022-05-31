
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int NUMERO_SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	protected Cliente clientes;
	protected InformacoesExtrato extrato;
	
	public Conta(Cliente cliente ) {
		
		this.agencia = AGENCIA_PADRAO;
		this.numero += NUMERO_SEQUENCIAL++;
		
		this.clientes = cliente;

	}

	@Override
	public void sacar(double valor) {
		
		if(this.saldo >= valor  && valor > 0) {
			this.saldo -= valor;
		}
		else {
			throw new IllegalArgumentException("Saldo insuficiente ou valor irregular");
		}
	}
	
	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
		else {
			throw new IllegalArgumentException("Saldo do deposito inferior ou igual a zero");
		}
	}
	
	@Override
	public void transferir(Conta contaDestino, double valor) {
		if(valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
		}else {
			throw new IllegalArgumentException("Saldo insuficiente ou inferior a zero");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getClientes() {
		return clientes;
	}
	
	public InformacoesExtrato getExtrato() {
		return extrato;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", clientes=" + clientes
				+ ", extrato=" + extrato + "]";
	}
	
	
}
