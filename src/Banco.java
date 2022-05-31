import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

	private String nome;
	
	private Set<Cliente> clientes = new HashSet<>();
	private List<Conta> conta = new ArrayList<>();
	
	
	public Banco(String nome) {
		super();
		
		setNome(nome);
	}
	
	public void adiconaConta(Conta obj) {
		this.conta.add(obj);
	}
	
	public void removerConta(Conta obj) {
		this.conta.remove(obj);
	}
	
	public int countConta() {
		return this.conta.size();
	}
	
	public Conta getPosicicaoConta(int i) {
		return this.conta.get(i);
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
