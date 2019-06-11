/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe criada para gerar um objeto aplicando o polimorfismo
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 11 de jun de 2019 as 00:00:19
 *
 * @version 
 *
 */
public class Montadora {
	
	//As açoes para realizar a montagem do Carro (objeto polimórfico, que para montar, depende de peças e tudo mais)
	//De acordo com cada 'peça', será montado um carro diferente.
	public void montagem(Carro car) {
		car.montar();
		car.ligar();
		car.tipoBanco();
	}
	
}
