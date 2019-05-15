/**
 * 
 */
package sobrecarga;

/**
 * @descrition Classe criada para demonstrar a utiliza��o do recurso de
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
	 * O que determina a sobrecarga de m�todos s�o assinaturas diferentes, ou seja,
	 * tipo, quantidade e ordem dos par�metros
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

	// Construtor para um Tri�ngulo
	public Figura(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Construtor para um ret�ngulo
	public Figura(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	// M�todo gen�rico que identifica o tipo de figura criada
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

	// m�todos sobrecarregados para exibir os dados das Figuras
	public void exibirFigura(int a) {
		System.out.println("� um ponto de valor: " + a);
	}

	public void exibirFigura(boolean x) {
		System.out.println("� uma linha de coordenadas " + a + " e " + b);
	}

	public void exibirFigura(int a, int b, int c) {
		System.out.println("� um tri�ngulo coordenadas " + a + " e " + b + " e " + c);
	}

	public void exibirFigura(int a, int b, int c, int d) {
		System.out.println("� um ret�ngulo de coordenadas " + a + " e " + b + " e " + c + " e " + d);
	}

}
