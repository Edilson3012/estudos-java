/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 10 de jun de 2019 as 23:55:53
 *
 * @version 
 *
 */
//� usado 'implements' quando uma classe vai IMPLEMENTAR os m�todos (a��es) de outra classe.
//Neste exemplo, o Fusca vai implementar as a��es de um Carro
public class Fusca implements Carro {

	//Para facilitar o entendimento, coloquei alguns exemplos diferenciados haha
	@Override
	public void montar() {
		System.out.println("\n --- Montagem do Fusca ---");
		System.out.println("Um alicate e um peda�o de arame resolve");
	}

	@Override
	public void ligar() {
		System.out.println("\n--- Como ligar um Fusca ---");
		System.out.println("S� no tranco pra ligar");
	}

	@Override
	public void tipoBanco() {
		System.out.println("\n--- Tipo do Banco ---");
		System.out.println("Se tiver o banco do motorista � muito kkkk");
	}
}
