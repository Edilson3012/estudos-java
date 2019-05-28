/**
 * 
 */
package polimorfismo;

/**
 * @descrition interface criada para demonstrar funcionamento b�sico do polimorfismo, servindo de padr�o �ra todo e qualquer tipo de Pizza
 * que for implementar por meio deste padr�o, ou seja, desta interface
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 20:27:58
 *
 * @version 
 *
 */
public interface Pizza {
	
	//m�todo gen�rico e abstrato de como montar uma pizza
	public void montar();
	
	//m�todo de quanto tempo a pizza ficar� no forno
	public void assar();
	
	//m�todo oara cobrar o valor adequado de cada pizza
	public void cobrar();
	
}
