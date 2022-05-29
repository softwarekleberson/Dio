
public class Cliente {
	
	public static final int TAMANHO_MINIMO_NOME_BANCO = 2;
	
	private String nome;
	private Conta conta;
	
	private InformacoesExtrato extrato;
	
	public Cliente(String nome) throws TamanhoMinimo {
		setNome(nome);
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws TamanhoMinimo {
		if(nome == null || nome.length() <= TAMANHO_MINIMO_NOME_BANCO) {
			throw new TamanhoMinimo("Tamanho minimo para nome deve " + TAMANHO_MINIMO_NOME_BANCO);
		}
		
		this.nome = nome;
	}
	
	public InformacoesExtrato getExtrato() {
		return extrato;
	}

}
