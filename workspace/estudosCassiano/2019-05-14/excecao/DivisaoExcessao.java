/**
 * 
 */
package excecao;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 14 de mai de 2019 as 20:30:47
 *
 * @version 
 *
 */
public class DivisaoExcessao extends Exception {
	
	
	public DivisaoExcessao() {
		super("O A não pode ser maior que 100");
	}

	/**
	 * @param i
	 */
	public DivisaoExcessao(int i) {
		super("O B não pode ser negativo");
	}

}
