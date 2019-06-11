/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition interface criada para demonstrar funcionamento b�sico do polimorfismo, servindo de padr�o �ra todo e qualquer tipo de Carro
 * que for implementar por meio deste padr�o, ou seja, desta interface
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 9 de jun de 2019 as 23:44:28
 *
 * @version 
 *
 */
public interface Carro {
	
	//m�todo gen�rico e abastrato de como montar um carro
	public void montar();
	
	//m�todo gen�rico e abstrato de como ligar um carro
	public void ligar();
	
	//m�todo gen�rico e abastrato de qual tipo � o banco do carro
	public void tipoBanco();
	
}
