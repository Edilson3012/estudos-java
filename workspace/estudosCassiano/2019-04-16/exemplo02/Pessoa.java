/**
 * 
 */
package exemplo02;

/**
 * @author Edilson Gotardi Murbach
 *
 * @since 16 de abr de 2019 21:49:26
 *
 * @version
 *
 */
public class Pessoa {

	String nome;
	int idade;
	float altura;
	float peso;

	/**
	 * @param nome
	 * @param idade
	 * @param altura
	 * @param peso
	 */
	public Pessoa(String nome, int idade, float altura, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	// método comum para exibição dos dados da Pessoa
	public void exibirPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + calcularIMC());
		System.out.println("Classificação: " + classificarIMC(calcularIMC()));
	}

	// método para calcular o IMC
	public float calcularIMC() {
		return peso / (altura * altura);
	}

	// método para classificar o IMC
	public String classificarIMC(float imc) {
		// pegar o resultado do método calcularIMC() e verificar em que situação ele se encaixa
		if ((imc < 16)) {
			return "Baixo Peso - Desnutrido";
		} else if ((imc < 17)) {
			return "Baixo Peso Moderado - Desnutrido";
		} else if ((imc < 18.5)) {
			return "Baixo Peso Suave - Desnutrido";
		} else if ((imc < 25)) {
			return "Peso Normal - Eutrofia";
		} else if ((imc < 30)) {
			return "Pré obesidade";
		} else if ((imc < 35)) {
			return "Obesidade I - SobrePeso";
		} else if ((imc < 40)) {
			return "Obesidade II - Severa";
		}

		return "Obesidade III - Mórbida";
	}

}
