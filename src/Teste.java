
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
		
		Banco b1 = new Banco("santarder");
		b1.adiconaCliente(kaw);
		b1.adiconaCliente(c1);
		
		b1.adiconaConta(cp);
		b1.adiconaConta(cc);
		System.out.println("Total de contas " + b1.countConta());
		System.out.println(b1.getPosicicaoConta(0));
		b1.removerConta(cp);
		System.out.println("Total de contas " + b1.countConta());

				
	}
}
