import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	
	private List<Cliente> cliente = new ArrayList<>();
	private List<Conta> conta = new ArrayList<>();
	
	public List<Cliente> getCliente() {
		return cliente;
	}
	
	public List<Conta> getConta() {
		return conta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
