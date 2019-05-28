/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe do tipo Pizza que implementa TODOS os métodos da interface Pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 20:40:20
 *
 * @version 
 *
 */
public class Calabresa implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("Calabresa, molo de tomate, cebola, azeitonas e orégano");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 15 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Preço: R$ 35,00");
	}
	
	
}
