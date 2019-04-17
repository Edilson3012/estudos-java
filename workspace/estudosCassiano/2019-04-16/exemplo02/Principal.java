/**
 * 
 */
package exemplo02;

/**
 * @author Edilson Gotardi Murbach
 *
 * @since 16 de abr de 2019 22:03:48
 *
 * @version 
 *
 */
public class Principal {
	
	public static void main(String[] java) {
		
		Aluno aluno = new Aluno("Edilson", 23, 1.90f, 90f, 21048, 9.9f, "ADS");
		System.out.println("--- DADOS DO ALUNO ------");
		aluno.exibirDadosAluno();
		
		System.out.println("----- DADOS DO PROFESSOR ---------");
		
		Professor professor = new Professor("Cassiano", 45, 1.75f, 85f, 2766, "POO", "Especialista em Java", 7500f);
		professor.exibirDadosProfessor();
	}
	
}
