/**
 * 
 */
package excecao;

import javax.swing.JOptionPane;

/**
 * @descrition Classe criada para demonstrar a utiliza��o do tratamento de
 *             exce��o feito com try..catch...throws
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 14 de mai de 2019 as 19:46:59
 *
 * @version
 *
 */
public class Divisao {

	public static void main(String x[]) {

		int a, b, div;
		String n1, n2;
		a = b = div = 0;

		while (true) {

			n1 = JOptionPane.showInputDialog("Digite o valor de A");
			n2 = JOptionPane.showInputDialog("Digite o valor de B");

			try {

				a = Integer.parseInt(n1);
				b = Integer.parseInt(n2);

				div = dividir(a, b);
				JOptionPane.showMessageDialog(null, "Resultado: " + div);

			} catch (ArithmeticException exc) {
				JOptionPane.showMessageDialog(null, "N�o existe divis�o por ZERO!");
			} catch (NumberFormatException exc) {
				JOptionPane.showMessageDialog(null, "N�o � permitido letras!");
			} catch (Exception exc) {
				JOptionPane.showMessageDialog(null, "Erro: " + exc.toString());
			}
		}
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 * @throws DivisaoExcessao
	 */
	private static int dividir(int a, int b) throws DivisaoExcessao {

		if (a > 100) {
			throw new DivisaoExcessao();
		}

		if (b < 0) {
			throw new DivisaoExcessao(1);
		}

		return 0;
	}

	// Excess�o � algo que ocorre quando o sistema n�o est� preparado para validar.
	// Se n�o validar, a excess�o vira um ERRO

}
