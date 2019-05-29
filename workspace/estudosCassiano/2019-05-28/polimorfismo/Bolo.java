/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe criada gerar um bolo através da interface Pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 22:08:35
 *
 * @version 
 *
 */
public class Bolo implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("\n-- Bolo --\nFarinha de trigo, cenoura, chocolate");
		System.out.println("Misturar tudo e bater por 5 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 30 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Preço: 19,90");
	}

}
