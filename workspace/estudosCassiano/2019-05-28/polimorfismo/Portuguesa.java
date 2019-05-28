/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe que implementa a interface PIZZA e todos os seus métodos
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 20:45:52
 *
 * @version 
 *
 */
public class Portuguesa implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("Mussarela, tomate, presunto, ovo, ervilha, palmito e molho de tomate");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 12 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Preço: R$ 42,00");
	}
	
	
	
}
