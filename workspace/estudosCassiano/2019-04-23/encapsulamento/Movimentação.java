/**
 * 
 */
package encapsulamento;

/**
 * @descrition Classe criada para testar a conta corrente do cliente
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 23 de abr de 2019 as 20:24:06
 *
 * @version 
 *
 */
public class Movimentação {
	
	public static void main(String java[]) {
		
		Conta c = new Conta("Bruna", 36275, 25000, "123", true);
		
		c.exibirDadosContaCliente();
		System.out.println("------------------------");
		
//		c.alterarNomeCliente();
//		c.realizarDeposito();
		
//		c.realizarSaque();
		
//		c.trocarSenha();
//		c.exibirDadosContaCliente();
		
		c.validarSenha();
		
		
	}
	
	
}
