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
	
	//As a�oes para realizar a montagem do Carro (objeto polim�rfico, que para montar, depende de pe�as e tudo mais)
	//De acordo com cada 'pe�a', ser� montado um carro diferente.
	public void montagem(Carro car) {
		car.montar();
		car.ligar();
		car.tipoBanco();
	}
	
}
