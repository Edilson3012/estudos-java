/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe que gera um p�o por meio da interface Pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 21:57:29
 *
 * @version 
 *
 */
public class P�o implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("\n-- P�o --\nFarinha, ovos, sal, a�ucar, leite e fermento");
		System.out.println("Misturar tudo e bater por 30 minutos");
		System.out.println("Deixar a massa descansar por 3 horas");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 40 minutos");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Pre�o: R$ 10,00");
	}
	
}
