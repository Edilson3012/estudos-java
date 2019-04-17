/**
 * 
 */
package exemplo02;

/**
 * @author Edilson Gotardi Murbach
 *
 * @since 16 de abr de 2019 22:11:38
 *
 * @version 
 *
 */
public class Professor extends Pessoa {
	
	int codigo;
	String disciplina;
	String titulo;
	float salario;
	
	//construtor da classe PROFESSOR
	/**
	 * @param nome
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param codigo
	 * @param disciplina
	 * @param titulo
	 * @param salario
	 */
	public Professor(String nome, int idade, float altura, float peso, int codigo, String disciplina, String titulo,
			float salario) {
		super(nome, idade, altura, peso);
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.titulo = titulo;
		this.salario = salario;
	}
	
	//m�todo para exibir os dados do professor
	public void exibirDadosProfessor() {
		super.exibirPessoa();
		System.out.println("C�digo: "+codigo);
		System.out.println("Disciplina: "+disciplina);
		System.out.println("T�tulo: "+titulo);
		System.out.println("Sal�rio: "+salario);
	}
	
	
	
}
