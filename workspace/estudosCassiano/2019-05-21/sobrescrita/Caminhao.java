/**
 * 
 */
package sobrescrita;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 21 de mai de 2019 as 20:36:55
 *
 * @version 
 *
 */
public class Caminhao extends Veiculo{
	
	String modelo;
	float peso;
	boolean trucado;
	
	public void exibirDados() {
		System.out.println("É um caminhão do modelo "+getModelo()+""
				+ " de "+getPeso() + ""
				+ " toneladas "+ ""
				+ "do tipo trucado "+(isTrucado()? "Sim": "não"));		
	}
	
	/**
	 * @param placa
	 * @param marca
	 * @param anoFab
	 * @param modelo
	 * @param peso
	 * @param trucado
	 */
	public Caminhao(String placa, String marca, int anoFab, String modelo, float peso, boolean trucado) {
		super(placa, marca, anoFab);
		this.modelo = modelo;
		this.peso = peso;
		this.trucado = trucado;
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
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}
	/**
	 * @return the trucado
	 */
	public boolean isTrucado() {
		return trucado;
	}
	/**
	 * @param trucado the trucado to set
	 */
	public void setTrucado(boolean trucado) {
		this.trucado = trucado;
	}
}
