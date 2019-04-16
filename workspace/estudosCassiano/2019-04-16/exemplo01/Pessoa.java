package exemplo01;

/**
 * Classer base para gerar um objeto do tipo Pessoa
 * @author Edilson Gotardi Murbach
 *
 * @since 16 de abr de 2019 19:48:35
 *
 * @version 
 *
 */
public class Pessoa {
	String nome;
	int idade;
	float altura;
	float peso;
	
	//construtor da classe
	public Pessoa(String nome, int idade, float altura, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	//método comum para exibição dos dados da Pessoa
	public void exibirPessoa() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		System.out.println("IMC: "+calcularIMC());
	}
	
	public float calcularIMC() {
		return peso/(altura*altura);
	}

}
