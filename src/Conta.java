
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int NUMERO_SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente ,double saldo) {
		
		this.agencia = AGENCIA_PADRAO;
		this.numero += NUMERO_SEQUENCIAL++;
		
		this.cliente = cliente;
		setSaldo(saldo);
	}
	
	
	protected void informacoesExtrato() {
		System.out.println("----- Extrato -------");
		System.out.println(String.format("Nome cliente %s : ", this.cliente.getNome()));
		System.out.println(String.format("Agencia %d : ", this.numero));
		System.out.println(String.format("Agencia %d", this.agencia));
		System.out.println(String.format("Saldo %.2f", this.saldo));
		System.out.println("--------Fim-----------");
	}

	
	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
		}
	}
	
	
	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}	
	}
	
	
	@Override
	public void transferir(IConta contaDestino, double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
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
	
	public void setSaldo(double saldo) {
		if(saldo > 0)
		this.saldo = saldo;
	}
}
