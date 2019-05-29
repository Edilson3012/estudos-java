/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 22:12:44
 *
 * @version 
 *
 */
public class Pudim implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("\n--Pudim --\nLeite Condensado, Leite, ovos, açucar e água");
		System.out.println("Misturar tudo e bater no liquidificador");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 35 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Preço: 25,90");
	}
	
	
}
