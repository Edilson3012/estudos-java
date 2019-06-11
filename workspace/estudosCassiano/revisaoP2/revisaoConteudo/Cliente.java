/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe criada demonstrar a funcionalidade de HEREN�A
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 9 de jun de 2019 as 23:34:18
 *
 * Copiem, colem e estudem!
 *
 */
public class Cliente extends Pessoa { //EXTENDS -> Usado quando uma classe herda atributos e m�todos de outra. PESSOA -> Nome da classe que est� sendo herdada.
	
	String apelido;
	
	public void exibirDados() {
		System.out.println("\n--- DADOS DO CLIENTE ---");
		System.out.println("\nApelido: "+getApelido());
	}
	
	//M�todo construtor da classe Cliente.
	//Como � uma HERAN�A de Pessoa, o cliente HERDA tudo do pai, que � a classe Pessoa. 
	public Cliente(String adao, float aranha, int kilo, boolean dp, String apelido) {
		//o super() indica que estes par�metros s�o da classe m�e que foi herdada
		super(adao, aranha, kilo, dp);
		
		//mesma maneira do constutor da classe que foi herdada. D� uma olhadinha l� rapid�o e sem compromisso ;)
		this.apelido = apelido;
	} 
	
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String qualquer_coisa) {
		this.apelido = qualquer_coisa;
	}
	
}
