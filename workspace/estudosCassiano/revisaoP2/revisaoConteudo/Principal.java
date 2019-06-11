/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe para testar o comportamento polimórfico do objeto Montadora
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
		
		
		Montadora m = new Montadora(); //Classe que gera o objeto polimórfico
		/*
		 * O objeto Carro, neste primeiro exemplo, será um fusca, pois estou gerando um objeto do tipo Fusca
		 */
		Carro f = new Fusca();
		
		/*
		 * O objeto Carro, neste primeiro exemplo, será um Porsche, pois estou gerando um objeto do tipo porsche
		 */
		Carro p = new Porsche();
		
		//Tanto o fusca, quanto o porsche, são da INTERFACE CARRO, que é um modelo para gerar novos objetos/carros
		
		System.out.println("\n-------------- DADOS DO FUSCA ---------------");
		f.montar();//Aqui, está sendo montado um fusca 
		f.ligar(); //Aqui, o fusca está sendo ligado
		f.tipoBanco(); //Aqui, está exibindo o tipo do banco do fusca
		
		System.out.println("\n-------------- DADOS DO PORSCHE -------------");
		p.montar(); //Este é a maneira que o porsche é montado
		p.ligar();  //O Porsche é ligado de um jeito diferente do Fusca
		p.tipoBanco(); //Como objeto polimórfico, o tipo do banco do Porsche também é diferente do fusca.
	}
	
}
