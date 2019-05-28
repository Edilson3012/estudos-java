/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe que implementa TODOS os m�todos da interface Pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 20:54:13
 *
 * @version 
 *
 */
public class Prestigio implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("Chocolate, coco");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 8 minutos");
	}

	/* (non-Javadoc)
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Pre�o: R$ 35,00");
	}
	
}
