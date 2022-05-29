
public class InformacoesExtrato {
	
	
	public void tirarExtrato(Cliente cliente, Conta conta) {
		
		System.out.println("----- Extrato -------");
		
		System.out.println("Nome Cliente : " + cliente.getNome());
		System.out.println("Agencia : " + conta.getAgencia());
		System.out.println("Numero " + conta.getNumero());
		System.out.println("Saldo " + conta.getSaldo());
		
		System.out.println("--------Fim-----------");
		
	}
}

