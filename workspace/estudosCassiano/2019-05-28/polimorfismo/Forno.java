/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe que gera o objeto polimórfico Forno que prepara todo e qualquer tipo de pizza
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 21:41:21
 *
 * @version 
 *
 */
public class Forno {
	
	public void preparar(Pizza pizza) {
		pizza.montar();
		pizza.assar();
		pizza.cobrar();
	}
	
}
