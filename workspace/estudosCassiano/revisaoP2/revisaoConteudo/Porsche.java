/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe criada para demonstrar a implementação de um classe Carro
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 10 de jun de 2019 as 23:46:10
 *
 * @version 
 *
 */

//É usado 'implements' quando uma classe vai IMPLEMENTAR os métodos (ações) de outra classe.
//Neste exemplo, o Porsche vai implementar as ações de um Carro
public class Porsche implements Carro {

	
	//Como estamos implemntando os métodos da classe Carro, é exibido o '@Override', indicando que este método está sendo reescrito.
	//E também, os mesmos métodos que estão na classe Carro estão aqui.
	//Se você colocar mais um método lá, esta classe ficará com um 'erro', até que você coloque aquele método nesta classe
	@Override
	public void montar() {
		System.out.println("\n--- Montagem de um Porsche --- ");
		System.out.println("Motov Turbinado, 500 cv de potência, 300km é a velocidade máxima");
	}

	@Override
	public void ligar() {
		System.out.println("\n--- Como ligar um Porsche ---");
		System.out.println("Apertar um botão no controle ou apertar um botão no painel central");
	}

	@Override
	public void tipoBanco() {
		System.out.println("\n--- Tipo do Banco ---");
		System.out.println("Bancos em couro legítimo na cor preta");
	}
}
