/**
 * 
 */
package polimorfismo;

/**
 * @descrition interface criada para demonstrar funcionamento básico do polimorfismo, servindo de padrão ára todo e qualquer tipo de Pizza
 * que for implementar por meio deste padrão, ou seja, desta interface
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 20:27:58
 *
 * @version 
 *
 */
public interface Pizza {
	
	//método genérico e abstrato de como montar uma pizza
	public void montar();
	
	//método de quanto tempo a pizza ficará no forno
	public void assar();
	
	//método oara cobrar o valor adequado de cada pizza
	public void cobrar();
	
}
