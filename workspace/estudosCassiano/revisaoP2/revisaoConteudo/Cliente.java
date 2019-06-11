/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe criada demonstrar a funcionalidade de HERENÇA
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 9 de jun de 2019 as 23:34:18
 *
 * Copiem, colem e estudem!
 *
 */
public class Cliente extends Pessoa { //EXTENDS -> Usado quando uma classe herda atributos e métodos de outra. PESSOA -> Nome da classe que está sendo herdada.
	
	String apelido;
	
	public void exibirDados() {
		System.out.println("\n--- DADOS DO CLIENTE ---");
		System.out.println("\nApelido: "+getApelido());
	}
	
	//Método construtor da classe Cliente.
	//Como é uma HERANÇA de Pessoa, o cliente HERDA tudo do pai, que é a classe Pessoa. 
	public Cliente(String adao, float aranha, int kilo, boolean dp, String apelido) {
		//o super() indica que estes parâmetros são da classe mãe que foi herdada
		super(adao, aranha, kilo, dp);
		
		//mesma maneira do constutor da classe que foi herdada. Dá uma olhadinha lá rapidão e sem compromisso ;)
		this.apelido = apelido;
	} 
	
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String qualquer_coisa) {
		this.apelido = qualquer_coisa;
	}
	
}
