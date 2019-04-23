package encapsulamento;

/**
 * @descrition Classe para demonstrar a utilização dos métodos acessores que contribuem com o princípio do Encapsulamento
 *
 * @author Edilson Gotardi Murbach
 *
 * @since 23 de abr de 2019 19:57:20
 *
 * @version
 *
 */
public class Conta {

	private String nome;
	private int numeroConta;
	private float saldoConta;
	private String senha;
	
	//Construtor da classe Conta
	/**
	 * @param nome
	 * @param numeroConta
	 * @param saldoConta
	 * @param senha
	 */
	public Conta(String nome, int numeroConta, float saldoConta, String senha) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.senha = senha;
	}

	//Métodos acessores - Get and Set
	//Serve para guardar/pegar uma informação específica posteriormente, após realizar algum cadastro
	//get = pegar uma informação 
	public String getNome() {
		return nome;
	}

	//set = alterar uma informação
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
