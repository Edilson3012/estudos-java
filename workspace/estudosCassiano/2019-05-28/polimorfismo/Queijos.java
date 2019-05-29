/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe que implementa TODOS os métodos da interface Pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 20:56:47
 *
 * @version 
 *
 */
public class Queijos implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("\n-- Pizza de QUEIJOS --\nMussarela, catupiri, chedar, provolone");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 10 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Preço: R$ 39,90");
	}

}
