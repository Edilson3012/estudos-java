/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe para testar o comportamento polim�rfico do objeto Montadora
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 11 de jun de 2019 as 00:03:30
 *
 * @version 
 *
 */
public class Principal {
	
	public static void main(String Polimorfismo[]) {
		
		Cliente c = new Cliente("Jair Bolsonaro", 17f, 78, false, "Mito");
		c.exibirDados();
		
		
		Montadora m = new Montadora(); //Classe que gera o objeto polim�rfico
		/*
		 * O objeto Carro, neste primeiro exemplo, ser� um fusca, pois estou gerando um objeto do tipo Fusca
		 */
		Carro f = new Fusca();
		
		/*
		 * O objeto Carro, neste primeiro exemplo, ser� um Porsche, pois estou gerando um objeto do tipo porsche
		 */
		Carro p = new Porsche();
		
		//Tanto o fusca, quanto o porsche, s�o da INTERFACE CARRO, que � um modelo para gerar novos objetos/carros
		
		System.out.println("\n-------------- DADOS DO FUSCA ---------------");
		f.montar();//Aqui, est� sendo montado um fusca 
		f.ligar(); //Aqui, o fusca est� sendo ligado
		f.tipoBanco(); //Aqui, est� exibindo o tipo do banco do fusca
		
		System.out.println("\n-------------- DADOS DO PORSCHE -------------");
		p.montar(); //Este � a maneira que o porsche � montado
		p.ligar();  //O Porsche � ligado de um jeito diferente do Fusca
		p.tipoBanco(); //Como objeto polim�rfico, o tipo do banco do Porsche tamb�m � diferente do fusca.
	}
	
}
