
public class Teste {
	public static void main(String[] args) throws TamanhoMinimo {
		
		Cliente c1 = new Cliente("kleberson");
		ContaCorrente cc = new ContaCorrente(c1);
					
		Cliente kaw = new Cliente("kaw");
		ContaPoupanca cp = new ContaPoupanca(kaw);
		
		cc.depositar(1);
		
		cp.depositar(5000);
		cp.sacar(1000);
		cp.transferir(cc, 2000);
		
		cp.extrato(kaw, cp);
		cc.extrato(c1, cc);
		
	}
}
