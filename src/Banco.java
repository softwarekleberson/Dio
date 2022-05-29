import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

	private String nome;
	
	private Set<Cliente> clientes = new HashSet<>();
	private List<Conta> conta = new ArrayList<>();
	
	
	public Banco(String nome, Set<Cliente> clientes, List<Conta> conta) {
		super();
		
		setNome(nome);
		
		this.clientes = clientes;
		this.conta = conta;
	}
	
	public void adiconaConta(Conta conta) {
		this.conta.add(conta);
	}
	
	public void adiconaCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Conta> getConta() {
		return conta;
	}
	
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
	
}
