/**
 * 
 */
package polimorfismo;

/**
 * @descrition Classe para testar o comportamento polimórfico do objeto Forno
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 28 de mai de 2019 as 21:46:05
 *
 * @version 
 *
 */
public class DiskPizza {
	
	public static void main(String pizzaria[]) {
		
		Forno forno = new Forno();
		Pizza c = new Calabresa();
		Pizza p = new Portuguesa();
		Pizza pres = new Prestigio();
		Pizza q = new Queijos();
		Pizza s = new Strogonoff();
		
		//Duas maneiras diferentes de gerar um objeto
		Pizza pao = new Pão();
		Pão pão = new Pão();
		
		Leitoa l = new Leitoa();
		Pizza leitoa = new Leitoa();
		
		Pizza b = new Bolo();
		Pizza pudim = new Pudim();
		
		forno.preparar(c);
		forno.preparar(p);
		forno.preparar(pres);
		forno.preparar(q);
		forno.preparar(s);
		
		forno.preparar(pao);
		forno.preparar(pão);
		
		forno.preparar(l);
		forno.preparar(leitoa);
		
		forno.preparar(b);
		forno.preparar(pudim);
	}
}
