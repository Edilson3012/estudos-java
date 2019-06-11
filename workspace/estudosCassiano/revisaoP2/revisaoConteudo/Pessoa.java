/**
 * 
 */
package revisaoConteudo;

/**
 * @descrition Classe que servirá de base para gerar clientes
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
	
	//métódo sem retorno que apenas vai exibir no console dados sobre a pessoa
	public void exibirDados() {
		System.out.println("\n--- DADOS DA PESSOA ---");
		System.out.println("\nNome: "+getNome());
		System.out.println("\nPeso: "+getPeso());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("\nVivo?: "+isVivo()); // se você colocou 'getVivo' no método get, aqui também será get, pois nestes métodos, você está apenas pegando o que está salvo.
	}
	
	//Método construtor responsável por construir o objeto na memória quando criarem a classe que tem o 'main'
	//Os nomes 'adao', 'aranha' são para exemplificar que não precisa ter o mesmo nome para funcionar. O que importa são os tipos (String, float...)
	public Pessoa(String adao, float aranha, int kilo, boolean dp) {
		this.nome = adao;
		this.peso = aranha;
		this.idade = kilo;
		this.vivo = dp;
	}
	
	// MÉTODOS ACESSORES
	/*
	 * Os métodos GETs seguem a seguinte estrutura:
	 * 
	 * 		public - 
	 * 			tipo da visibilidade, mas não vamos focar nessa parte, ok?
	 * 		
	 * 		tipo da variável
	 * 			o mesmo tipo que foi declarado lá em cima. Se declarou o nome do tipo STRING, aqui também será uma STRING, certo?
	 * 
	 * 		get 
	 * 			o nome da variável que você colocou lá em cima. Lembrando que a primeira letra da variável no GET tem que ser em maiúscula
	 * por convenção a normatização
	 * 
	 * 		()
	 * 			Todo get é um método. Como saber isso? Justamente pelos parenteses '()'. Então, toda vez que forem criar os métodos 
	 * acessores/ getters and setters, coloque um parenteses
	 * 
	 * 		return
	 * 			O método get é responsável por pegar, por trazer algo para o usuário.
	 * 			E vai retornar o que? Vai retornar a variável que foi declarada lá em cima no começo da classe. Do mesmo jeito que está lá, olhá lá!!!
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
	 *	Mas Edilson, por qual motivo você colocou 'isVivo' e não um 'getVivo' como nos demais?
	 *
	 *	Para as variáveis do tipo boolean que só retornam apenas 'true' ou 'false', nada mais do que isso.
	 *	Se for true, não será false, e vice-versa!
	 *
	 *	Ainda não entendeu? É meio chatinho mesmo de entender, então vamos lá!!! :D
	 *
	 *	Você pode colocar 'getVivo' sem problema nenhum que vai continuar funcionando normalmente!
	 *	
	 *	Se você gerou esses métodos automáticos, vai reparar que também está isVivo, é o padrão, não somente para java, mas para qualquer outra linguagem.
	 *
	 *
	 *	Você está vivo?
	 *
	 *	
	 *	Só há uma resposta para isso. Ou você está 'true', ou está 'false'. 
	 *
	 *	É diferente por exemplo da variável nome, que pode receber 'João', 'José', 'Maria', e por assim vai...
	 * 
	 */
	public boolean isVivo() {
		return vivo;
	}
	
	/*
	 *	MÉTODOS SETs 
	 *		
	 *		public - 
	 * 				tipo da visibilidade, mas não vamos focar nessa parte, ok?
	 *	
	 *		void
	 *				Tipo do retorno do método. É usado quando o método não tem retorno, apenas executa.
	 *				Um exemplo: Carro de som fazendo propaganda. Ele só executa algo, tendeu?
	 *		
	 *		set
	 *				o nome da variável que você colocou lá em cima. Lembrando que a primeira letra da variável no SET tem que ser em maiúscula
	 * por convenção a normatização	
	 * 
	 * 		()
	 * 				Todo get é um método. Como saber isso? Justamente pelos parenteses '()'. Então, toda vez que forem criar os métodos 
	 * acessores/ getters and setters, coloque um parenteses
	 * 		
	 * 		Tipo da variável
	 * 				O mesmo tipo da variável que foi declarada no início da classe.
	 * 				Não dá pra retornar um cachorro quando você pagou com cimento. Tem que ser do mesmo tipo.
	 * 				Se for um cachorro grande, retorna um cachorro grande. Bizzarices apenas para lembrar na hora da prova, ta okei?kkkk
	 *		
	 *		Nome da variável
	 *				Lá no início da classe, foi declarado uma variável de um determinado tipo. No método set, tem que passar como parâmetro/requisito o mesmo
	 * tipo de variável mas com qualquer nome.
	 * 				No exemplo abaixo, passei o mesmo tipo da variável mas com um nome diferente
	 *		
	 *		this
	 *				Usado para indicar que o variável desta classe Pessoa está recebendo a variável que está sendo passada como parâmetro.
	 *				Quando a variáveis são de nomes diferentes, não há problemas em colocar ou não o this.'nome da variável'
	 *				Quando as variáveis são de nomes iguais, digamos que fica um pouco confuso. E para isso não acontecer, coloca-se o this.
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
