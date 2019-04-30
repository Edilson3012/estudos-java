/**
 * 
 */
package estudos;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 30 de abr de 2019 as 13:22:35
 *
 * @version 
 *
 */
public class Principal {
	
	public static void main(String java[]) {
		
		Bebida b = new Bebida(1, "Brahma", 4.50f, 50, true);
		
		
		b.exibirDados();
		
		b.classificarBebida();
		
	}
	
}
