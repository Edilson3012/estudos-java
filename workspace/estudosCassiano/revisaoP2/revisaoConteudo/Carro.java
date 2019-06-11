/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition interface criada para demonstrar funcionamento básico do polimorfismo, servindo de padrão ára todo e qualquer tipo de Carro
 * que for implementar por meio deste padrão, ou seja, desta interface
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 9 de jun de 2019 as 23:44:28
 *
 * @version 
 *
 */
public interface Carro {
	
	//método genérico e abastrato de como montar um carro
	public void montar();
	
	//método genérico e abstrato de como ligar um carro
	public void ligar();
	
	//método genérico e abastrato de qual tipo é o banco do carro
	public void tipoBanco();
	
}
