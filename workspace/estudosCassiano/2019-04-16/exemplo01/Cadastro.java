/**
 * 
 */
package exemplo01;

/**
 * Classe principal para instanciar os objetos do tipo pessoa
 * @author Edilson Gotardi Murbach
 *
 * @since 16 de abr de 2019 20:00:04
 *
 * @version 
 *
 */
public class Cadastro {
	
	public static void main(String args[]) {
		Pessoa p = new Pessoa("Edilson", 23, 1.75f, 55f);
		p.exibirPessoa();
	}
	
}
