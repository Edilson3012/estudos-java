/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe criada para demonstrar a implementa��o de um classe Carro
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 10 de jun de 2019 as 23:46:10
 *
 * @version 
 *
 */

//� usado 'implements' quando uma classe vai IMPLEMENTAR os m�todos (a��es) de outra classe.
//Neste exemplo, o Porsche vai implementar as a��es de um Carro
public class Porsche implements Carro {

	
	//Como estamos implemntando os m�todos da classe Carro, � exibido o '@Override', indicando que este m�todo est� sendo reescrito.
	//E tamb�m, os mesmos m�todos que est�o na classe Carro est�o aqui.
	//Se voc� colocar mais um m�todo l�, esta classe ficar� com um 'erro', at� que voc� coloque aquele m�todo nesta classe
	@Override
	public void montar() {
		System.out.println("\n--- Montagem de um Porsche --- ");
		System.out.println("Motov Turbinado, 500 cv de pot�ncia, 300km � a velocidade m�xima");
	}

	@Override
	public void ligar() {
		System.out.println("\n--- Como ligar um Porsche ---");
		System.out.println("Apertar um bot�o no controle ou apertar um bot�o no painel central");
	}

	@Override
	public void tipoBanco() {
		System.out.println("\n--- Tipo do Banco ---");
		System.out.println("Bancos em couro leg�timo na cor preta");
	}
}
