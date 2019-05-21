/**
 * 
 */
package sobrescrita;

/**
 * @descrition Classe criada para herdar atributos e m�todos da super classe VE�CULO
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 21 de mai de 2019 as 20:22:58
 *
 * @version 
 *
 */
public class Carro extends Veiculo{

	String modelo;
	float valor;
	
	/**
	 * @param placa
	 * @param marca
	 * @param anoFab
	 * @param modelo
	 * @param valor
	 */
	public Carro(String placa, String marca, int anoFab, String modelo, float valor) {
		super(placa, marca, anoFab);
		this.modelo = modelo;
		this.valor = valor;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("� um carro do modelo "+getModelo() + " do ano "+ getAnoFab()+" que custa R$ "+getValor());
	}
	

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
