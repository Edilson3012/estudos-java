/**
 * 
 */
package sobrecarga;

import javax.swing.JOptionPane;

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

	Integer a, b, c, d, e;

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

	// Construtor para um pentagono
	public Figura(int a, int b, int c, int d, int e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	//Construtor para gerar uma figura a partir de GUIs
	public Figura() {
		String msg = "";
		int opc;
		
		msg = "Escolha sua op��o: "
				+ "\n1 - Ponto"
				+ "\n2 - Linha"
				+ "\n3 - Tri�ngulo"
				+ "\n4 - Ret�ngulo"
				+ "\n5 - Pent�gono"
				+ "\n0 - Sair";
		
		opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
		
		
		switch (opc) {
			
			case 1: 
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
				break;
			
			case 2:
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
				break;
			
			case 3:
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
				c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
				break;
				
			case 4:
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
				c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
				d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D: "));
				break;
				
			case 5:
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
				b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
				c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
				d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D: "));
				e = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de E: "));
				break;				
				
			case 0:
				JOptionPane.showMessageDialog(null, "Sistema ser� encerrado...");
				System.exit(0);
				
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!\nTente novamente!");
				break;
		}
	}
	
	// M�todo gen�rico que identifica o tipo de figura criada
	public void exibirFigura() {
		
		if((a == null) && (b == null) && (c == null) && (d == null)) {
			JOptionPane.showMessageDialog(null, "A figura n�o foi construida!");
		} else if ((a != null) && (b == null) && (c == null) && (d == null)) {
			exibirFigura(a);
		} else if ((a != null) && (b != null) && (c == null) && (d == null) && (e == null)) {
			exibirFigura(true);
		} else if ((a != null) && (b != null) && (c != null) && (d == null) && (e == null)) {
			exibirFigura(a, b, c);
		} else if ((a != null) && (b != null) && (c != null) && (d != null) && (e == null)  ) {
			exibirFigura(a, b, c, d);
		} else {
			exibirFigura(a, b, c, d, e);
		}
	}

	// m�todos sobrecarregados para exibir os dados das Figuras
	public void exibirFigura(int a) {
		JOptionPane.showMessageDialog(null, "� um ponto de valor: " + a, "Ponto", 0);
		JOptionPane.showMessageDialog(null, "� um ponto de valor: " + a, "Ponto", 1);
		JOptionPane.showMessageDialog(null, "� um ponto de valor: " + a, "Ponto", 2);
		JOptionPane.showMessageDialog(null, "� um ponto de valor: " + a, "Ponto", 3);
	}

	public void exibirFigura(boolean x) {
		JOptionPane.showMessageDialog(null, "� uma linha de coordenadas " + a + " e " + b);
	}

	public void exibirFigura(int a, int b, int c) {
		JOptionPane.showMessageDialog(null, "� um tri�ngulo coordenadas " + a + " e " + b + " e " + c);
	}

	public void exibirFigura(int a, int b, int c, int d) {
		JOptionPane.showMessageDialog(null, "� um ret�ngulo de coordenadas " + a + " e " + b + " e " + c + " e " + d);
	}

	public void exibirFigura(int a, int b, int c, int d, int e) {
		JOptionPane.showMessageDialog(null,	"� um ret�ngulo de coordenadas " + a + " e " + b + " e " + c + " e " + d + " e " + e);
	}

}
