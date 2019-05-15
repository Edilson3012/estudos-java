/**
 * 
 */
package sobrecarga;

/**
 * @descrition Classe criada para instanciar objetos do tipo Figura
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 14 de mai de 2019 as 21:58:59
 *
 * @version 
 *
 */
public class Desenho {
	
	public static void main(String php[]) {
		
		Figura ponto = new Figura(1, 2, 3, 4);
//		Figura linha = new Figura(10, 20);
		
		
		ponto.exibirFigura();
//		linha.exibirFigura();
		
	}
	
	
	
}
