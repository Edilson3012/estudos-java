package encapsulamento;

import javax.swing.JOptionPane;

/**
 * @descrition Classe para demonstrar a utiliza��o dos m�todos acessores que
 *             contribuem com o princ�pio do Encapsulamento
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
	private boolean ativo;

	// Construtor da classe Conta
	/**
	 * @param nome
	 * @param numeroConta
	 * @param saldoConta
	 * @param senha
	 */
	public Conta(String nome, int numeroConta, float saldoConta, String senha, Boolean ativo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.senha = senha;
		this.ativo = true;
	}

	// m�todo para exibir dados da conta do cliente
	public void exibirDadosContaCliente() {
		System.out.println("Cliente: " + getNome());
		System.out.println("N�mero da Conta: " + getNumeroConta());
		System.out.println("Saldo da conta: " + getSaldoConta());
		System.out.println("Senha: " + getSenha());
		System.out.println("Situa��o da conta: "+isAtivo());
	}

	// m�todo para alterar o nome do cliente
	public void alterarNomeCliente() {
		// pegar o n�mero da conta informado pelo usu�rio
		int nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da conta: "));

		// se o n�mero da conta informado for igual ao que est� cadastrado, entra na
		// condi��o
		if (nConta == getNumeroConta()) {
			String novoNome = JOptionPane.showInputDialog("Informe o novo nome do cliente: ");
			setNome(novoNome);
		} else { // caso o n�mero da conta informada for diferente do que esta cadastrado
			JOptionPane.showMessageDialog(null, "N�mero da conta inv�lida ou inexistente!");
		}
		exibirDadosContaCliente();
	}

	// m�todo para realizar um dep�sito em uma conta banc�ria
	public void realizarDeposito() {
		// pegar o n�mero da conta informado pelo usu�rio
		int nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da conta: "));

		// se o n�mero da conta informado for igual ao que est� cadastrado, entra na
		// condi��o
		if (nConta == getNumeroConta()) {
			float valorDeposito = Float.parseFloat((JOptionPane.showInputDialog("Informe o valor a ser Depositado: ")));
			setSaldoConta(getSaldoConta() + valorDeposito);
			JOptionPane.showMessageDialog(null, "Dep�sito realizado com sucesso no valor de R$ " + valorDeposito);
		} else { // caso o n�mero da conta informada for diferente do que esta cadastrado
			JOptionPane.showMessageDialog(null, "N�mero da conta inv�lida ou inexistente!");
		}
		JOptionPane.showMessageDialog(null, "Novo saldo da conta: " + getSaldoConta());
	}

	// m�todo para realizar saque da conta
	public void realizarSaque() {
		// pegar o n�mero da conta informado pelo usu�rio
		int nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da conta: "));

		// se o n�mero da conta informado for igual ao que est� cadastrado, entra na
		// condi��o
		if (nConta == getNumeroConta()) {
			float valorSaque = Float.parseFloat((JOptionPane.showInputDialog("Informe o valor a ser sacado: ")));

			if (getSaldoConta() >= valorSaque) {
				setSaldoConta(getSaldoConta() - valorSaque);
				JOptionPane.showMessageDialog(null, "Saque realizado com sucesso no valor de R$: " + valorSaque + ""
						+ "\nNovo saldo da conta R$: " + getSaldoConta());
			} else {
				JOptionPane.showMessageDialog(null, "N�o � poss�vel realizar o saque! Saldo insuficiente!");
			}

		} else { // caso o n�mero da conta informada for diferente do que esta cadastrado
			JOptionPane.showMessageDialog(null, "N�mero da conta inv�lida ou inexistente!");
		}
	}

	//m�todo para trocar senha
	public void trocarSenha() {
		// pegar o n�mero da conta informado pelo usu�rio
		int nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da conta: "));

		// se o n�mero da conta informado for igual ao que est� cadastrado, entra na
		// condi��o
		if (nConta == getNumeroConta()) {

			String senhaAtual = (JOptionPane.showInputDialog("Informe a senha atual: "));

			if (senhaAtual.equals(getSenha())) {
				String novaSenha = (JOptionPane.showInputDialog("Informe a nova senha: "));
				setSenha(novaSenha);
				JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Senha inv�lida! Tente novamente!");
			}
		} else { // caso o n�mero da conta informada for diferente do que esta cadastrado
			JOptionPane.showMessageDialog(null, "N�mero da conta inv�lida ou inexistente!");
		}
	}
	
	
	//m�todo para verificar se a senha informada � igual a que esta salva
	public void validarSenha() {
		// pegar o n�mero da conta informado pelo usu�rio
		int nConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da conta: "));

		// se o n�mero da conta informado for igual ao que est� cadastrado, entra na
		// condi��o
		if (nConta == getNumeroConta()) {

			int i=0;
			
			while(  i<3  ) {
				String senhaAtual2 = (JOptionPane.showInputDialog("Informe a senha atual: "));
				
				if( senhaAtual2.equals(getSenha()) ) {
					JOptionPane.showMessageDialog(null, "Senha validada com sucesso!");
					break;
				} 
				
				if ( (i==2) && (!senhaAtual2.equals(getSenha())) ) {
					JOptionPane.showMessageDialog(null, "As suas tentativas foram esgotadas e sua conta foi bloqueada!");
					ativo=false;
				}
				i++;
			}
			exibirDadosContaCliente();
			
		} else { // caso o n�mero da conta informada for diferente do que esta cadastrado
			JOptionPane.showMessageDialog(null, "N�mero da conta inv�lida ou inexistente!");
		}
	}

	// M�todos acessores - Get and Set
	// Serve para guardar/pegar uma informa��o espec�fica posteriormente, ap�s
	// realizar algum cadastro
	// get = pegar uma informa��o
	public String getNome() {
		return nome;
	}

	// set = alterar uma informa��o
	private void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	private float getSaldoConta() {
		return saldoConta;
	}

	private void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
