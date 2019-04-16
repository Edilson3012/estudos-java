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
		System.out.println(classificarIMC());
	}
	
	public float calcularIMC() {
		return peso/(altura*altura);
	}
	
	//método para classificar o IMC
	public String classificarIMC() {
		
		if ( (calcularIMC() < 16)  ) {
			return "Baixo Peso - Desnutrido";
		} else if ( (calcularIMC() < 17) ) {
			return "Baixo Peso Moderado - Desnutrido";
		} else if ( (calcularIMC() < 18.5) ) {
			return "Baixo Peso Suave - Desnutrido";
		} else if ( (calcularIMC() < 25) ) {
			return "Peso Normal - Eutrofia";
		} else if ( (calcularIMC() < 30) ) {
			return "Pré obesidade";
		} else if ( (calcularIMC() < 35) ) {
			return "Obesidade I - SobrePeso";
		} else if ( (calcularIMC() < 40) ) {
			return "Obesidade II - Severa";
		} 
		
		return "Obesidade III - Mórbida";
	}
	

}
