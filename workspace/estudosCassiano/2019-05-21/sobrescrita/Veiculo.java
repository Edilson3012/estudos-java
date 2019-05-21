/**
 * 
 */
package sobrescrita;

/**
 * @descrition Classe criada para demonstrar o recurso da sobrescrita
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 21 de mai de 2019 as 20:18:06
 *
 * @version 
 *
 */
public class Veiculo {
	
	String placa;
	String marca;
	int anoFab;
	
	//método para exibir os dados dos Veículos
	public void exibirDados() {
		System.out.println("Placa: "+getPlaca());
		System.out.println("Marca: "+getMarca());
		System.out.println("Ano de Fabricação: "+getAnoFab());
	}
	
	
	/**
	 * @param placa
	 * @param marca
	 * @param anoFab
	 */
	public Veiculo(String placa, String marca, int anoFab) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.anoFab = anoFab;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the anoFab
	 */
	public int getAnoFab() {
		return anoFab;
	}

	/**
	 * @param anoFab the anoFab to set
	 */
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	
}
