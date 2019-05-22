/**
 * 
 */
package sobrescrita;

/**
 * @descrition Classe criada para instanciar objetos do tipo Veiculo
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 21 de mai de 2019 as 20:31:25
 *
 * @version 
 *
 */
public class Concessionaria {
	
	public static void main(String ipisulon[]) {
		Veiculo v = new Veiculo("BSN-4908", "Honda", 1999);
		v.exibirDados();
		
		System.out.println("-----------------------------\n\n");
		
		Carro c = new Carro("HRR-4060", "GM", 2016, "Turbo", 98750f);
		c.exibirDados();
		
		
	}
	
}
