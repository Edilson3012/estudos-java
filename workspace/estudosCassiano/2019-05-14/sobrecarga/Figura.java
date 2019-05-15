/**
 * 
 */
package sobrecarga;

/**
 * @descrition Classe criada para demonstrar a utilização do recurso de
 *             sobrecarga
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 14 de mai de 2019 as 21:49:59
 *
 * @version
 *
 */
public class Figura {

	/*
	 * O que determina a sobrecarga de métodos são assinaturas diferentes, ou seja,
	 * tipo, quantidade e ordem dos parâmetros
	 */

	Integer a, b, c, d;

	// Construtor para um Ponto
	public Figura(int a) {
		this.a = a;
	}

	// Construtor para uma Linha
	public Figura(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// Construtor para um Triângulo
	public Figura(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Construtor para um retângulo
	public Figura(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	// Método genérico que identifica o tipo de figura criada
	public void exibirFigura() {
		if ((a != null) && (b == null) && (c == null) && (d == null)) {
			exibirFigura(a);
		} else if ((a != null) && (b != null) && (c == null) && (d == null)) {
			exibirFigura(true);
		} else if ((a != null) && (b != null) && (c != null) && (d == null)) {
			exibirFigura(a, b, c);
		} else {
			exibirFigura(a, b, c, d);
		}
	}

	// métodos sobrecarregados para exibir os dados das Figuras
	public void exibirFigura(int a) {
		System.out.println("É um ponto de valor: " + a);
	}

	public void exibirFigura(boolean x) {
		System.out.println("É uma linha de coordenadas " + a + " e " + b);
	}

	public void exibirFigura(int a, int b, int c) {
		System.out.println("É um triângulo coordenadas " + a + " e " + b + " e " + c);
	}

	public void exibirFigura(int a, int b, int c, int d) {
		System.out.println("É um retângulo de coordenadas " + a + " e " + b + " e " + c + " e " + d);
	}

}
