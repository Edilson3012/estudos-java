/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe que gera o objeto do tipo Leitoa que implementa a interface Pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 22:01:52
 *
 * @version 
 *
 */
public class Leitoa implements Pizza {

	/* 
	 * @see polimorfismo.Pizza#montar()
	 */
	@Override
	public void montar() {
		System.out.println("\n-- Leitoa --\nVinagre, sal, alho, vinho, limão, pimenta");
		System.out.println("Mistura tudo e deixe marejar por 5 horas");
	}

	/* 
	 * @see polimorfismo.Pizza#assar()
	 */
	@Override
	public void assar() {
		System.out.println("Tempo de forno: 5 horas");
		System.out.println("Finalizar com uma maçã na boca");
	}

	/* 
	 * @see polimorfismo.Pizza#cobrar()
	 */
	@Override
	public void cobrar() {
		System.out.println("Preço: R$ 150,00");
	}
	
	
	
}
