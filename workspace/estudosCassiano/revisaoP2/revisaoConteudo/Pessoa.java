/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe que servir� de base para gerar clientes
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 9 de jun de 2019 as 22:36:06
 *
 * Copiem, colem e estudem!
 *
 */
public class Pessoa {
	
	String nome;
	float peso;
	int idade;
	boolean vivo;
	
	//m�t�do sem retorno que apenas vai exibir no console dados sobre a pessoa
	public void exibirDados() {
		System.out.println("\n--- DADOS DA PESSOA ---");
		System.out.println("\nNome: "+getNome());
		System.out.println("\nPeso: "+getPeso());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("\nVivo?: "+isVivo()); // se voc� colocou 'getVivo' no m�todo get, aqui tamb�m ser� get, pois nestes m�todos, voc� est� apenas pegando o que est� salvo.
	}
	
	//M�todo construtor respons�vel por construir o objeto na mem�ria quando criarem a classe que tem o 'main'
	//Os nomes 'adao', 'aranha' s�o para exemplificar que n�o precisa ter o mesmo nome para funcionar. O que importa s�o os tipos (String, float...)
	public Pessoa(String adao, float aranha, int kilo, boolean dp) {
		this.nome = adao;
		this.peso = aranha;
		this.idade = kilo;
		this.vivo = dp;
	}
	
	// M�TODOS ACESSORES
	/*
	 * Os m�todos GETs seguem a seguinte estrutura:
	 * 
	 * 		public - 
	 * 			tipo da visibilidade, mas n�o vamos focar nessa parte, ok?
	 * 		
	 * 		tipo da vari�vel
	 * 			o mesmo tipo que foi declarado l� em cima. Se declarou o nome do tipo STRING, aqui tamb�m ser� uma STRING, certo?
	 * 
	 * 		get 
	 * 			o nome da vari�vel que voc� colocou l� em cima. Lembrando que a primeira letra da vari�vel no GET tem que ser em mai�scula
	 * por conven��o a normatiza��o
	 * 
	 * 		()
	 * 			Todo get � um m�todo. Como saber isso? Justamente pelos parenteses '()'. Ent�o, toda vez que forem criar os m�todos 
	 * acessores/ getters and setters, coloque um parenteses
	 * 
	 * 		return
	 * 			O m�todo get � respons�vel por pegar, por trazer algo para o usu�rio.
	 * 			E vai retornar o que? Vai retornar a vari�vel que foi declarada l� em cima no come�o da classe. Do mesmo jeito que est� l�, olh� l�!!!
	 * 		
	 */
	public String getNome() {
		return nome;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	/*
	 *	Mas Edilson, por qual motivo voc� colocou 'isVivo' e n�o um 'getVivo' como nos demais?
	 *
	 *	Para as vari�veis do tipo boolean que s� retornam apenas 'true' ou 'false', nada mais do que isso.
	 *	Se for true, n�o ser� false, e vice-versa!
	 *
	 *	Ainda n�o entendeu? � meio chatinho mesmo de entender, ent�o vamos l�!!! :D
	 *
	 *	Voc� pode colocar 'getVivo' sem problema nenhum que vai continuar funcionando normalmente!
	 *	
	 *	Se voc� gerou esses m�todos autom�ticos, vai reparar que tamb�m est� isVivo, � o padr�o, n�o somente para java, mas para qualquer outra linguagem.
	 *
	 *
	 *	Voc� est� vivo?
	 *
	 *	
	 *	S� h� uma resposta para isso. Ou voc� est� 'true', ou est� 'false'. 
	 *
	 *	� diferente por exemplo da vari�vel nome, que pode receber 'Jo�o', 'Jos�', 'Maria', e por assim vai...
	 * 
	 */
	public boolean isVivo() {
		return vivo;
	}
	
	/*
	 *	M�TODOS SETs 
	 *		
	 *		public - 
	 * 				tipo da visibilidade, mas n�o vamos focar nessa parte, ok?
	 *	
	 *		void
	 *				Tipo do retorno do m�todo. � usado quando o m�todo n�o tem retorno, apenas executa.
	 *				Um exemplo: Carro de som fazendo propaganda. Ele s� executa algo, tendeu?
	 *		
	 *		set
	 *				o nome da vari�vel que voc� colocou l� em cima. Lembrando que a primeira letra da vari�vel no SET tem que ser em mai�scula
	 * por conven��o a normatiza��o	
	 * 
	 * 		()
	 * 				Todo get � um m�todo. Como saber isso? Justamente pelos parenteses '()'. Ent�o, toda vez que forem criar os m�todos 
	 * acessores/ getters and setters, coloque um parenteses
	 * 		
	 * 		Tipo da vari�vel
	 * 				O mesmo tipo da vari�vel que foi declarada no in�cio da classe.
	 * 				N�o d� pra retornar um cachorro quando voc� pagou com cimento. Tem que ser do mesmo tipo.
	 * 				Se for um cachorro grande, retorna um cachorro grande. Bizzarices apenas para lembrar na hora da prova, ta okei?kkkk
	 *		
	 *		Nome da vari�vel
	 *				L� no in�cio da classe, foi declarado uma vari�vel de um determinado tipo. No m�todo set, tem que passar como par�metro/requisito o mesmo
	 * tipo de vari�vel mas com qualquer nome.
	 * 				No exemplo abaixo, passei o mesmo tipo da vari�vel mas com um nome diferente
	 *		
	 *		this
	 *				Usado para indicar que o vari�vel desta classe Pessoa est� recebendo a vari�vel que est� sendo passada como par�metro.
	 *				Quando a vari�veis s�o de nomes diferentes, n�o h� problemas em colocar ou n�o o this.'nome da vari�vel'
	 *				Quando as vari�veis s�o de nomes iguais, digamos que fica um pouco confuso. E para isso n�o acontecer, coloca-se o this.
	 *		
	 */
	
	public void setNome(String bolsonaro) {
		nome = bolsonaro;
//		this.nome = bolsonaro;
	}
	
	public void setPeso(float java) {
		this.peso = java;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setVivo(boolean lulapreso) {
		this.vivo = lulapreso;
	}	
}
