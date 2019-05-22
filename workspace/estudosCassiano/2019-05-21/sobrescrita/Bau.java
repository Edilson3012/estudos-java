/**
 * 
 */
package sobrescrita;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 21 de mai de 2019 as 21:36:33
 *
 * @version 
 *
 */
public class Bau extends Caminhao{
	
	int capacidade;
	boolean refrigerado;

	public void exibirDados() {
		System.out.println("É um caminhão de "+getCapacidade() +" litros de de capacidade "
				+ "do modelo "+getModelo()+ " Refrigerado? "+(isRefrigerado()?"Sim":"Não"));
	}
	
	
	/**
	 * @param placa
	 * @param marca
	 * @param anoFab
	 * @param modelo
	 * @param peso
	 * @param trucado
	 * @param capacidade
	 * @param refrigerado
	 */
	public Bau(String placa, String marca, int anoFab, String modelo, float peso, boolean trucado, int capacidade,
			boolean refrigerado) {
		super(placa, marca, anoFab, modelo, peso, trucado);
		this.capacidade = capacidade;
		this.refrigerado = refrigerado;
	}
	/**
	 * @return the capacidade
	 */
	public int getCapacidade() {
		return capacidade;
	}
	/**
	 * @param capacidade the capacidade to set
	 */
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	/**
	 * @return the refrigerado
	 */
	public boolean isRefrigerado() {
		return refrigerado;
	}
	/**
	 * @param refrigerado the refrigerado to set
	 */
	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}
}
