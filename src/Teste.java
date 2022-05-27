
public class Teste {
	public static void main(String[] args) {
		
		Cliente kleberson = new Cliente();
		kleberson.setNome("kleberson");
		
		Cliente kaw = new Cliente();
		kaw.setNome("kaw");
		
		Cliente chica = new Cliente();
		chica.setNome("chica");
		
		Conta cc = new ContaCorrente(kleberson,2500);
		cc.depositar(500);
		
		Conta cp = new ContaPoupanca(kaw,1000);
		cp.transferir(cc, 500);
		
		Conta conta = new ContaPoupanca(chica,150);
		conta.sacar(100);
		
		cc.extrato();
		cp.extrato();
		conta.extrato();
	}
}
