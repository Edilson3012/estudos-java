/**
 * 
 */
package exemplo02;

/**
 * Classe que herda atributos e métodos de Pessoa
 * @author Edilson Gotardi Murbach
 *
 * @since 16 de abr de 2019 21:50:59
 *
 * @version 
 *
 */
public class Aluno extends Pessoa {
	
	int ra;
	float nota;
	String curso;
	
	/**
	 * @param nome
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param ra
	 * @param nota
	 * @param curso
	 */
	//construtor de Aluno
	public Aluno(String nome, int idade, float altura, float peso, int ra, float nota, String curso) {
		super(nome, idade, altura, peso);
		this.ra = ra;
		this.nota = nota;
		this.curso = curso;
	}
	
	//método para exibir dados de um aluno
	public void exibirDadosAluno() {
		super.exibirPessoa();
		System.out.println("RA: "+ra);
		System.out.println("Nota: "+nota);
		System.out.println("Curso: "+curso);
	}
	
	
}
