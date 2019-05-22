/**
 * 
 */
package sobrescrita;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 21 de mai de 2019 as 21:45:19
 *
 * @version 
 *
 */
public class Tanque extends Caminhao {
	
	int litros;
	boolean perigosa;
	boolean bitrem;
	
	public void exibirDados() {
		System.out.println("Tanque de "+getLitros()+ " litros de capacidade."
				+ "Carga Perigosa? "+(isPerigosa()?"Sim":"Não")
				+ "Bi-trem? "+(isBitrem()?"Sim":"Não"));
	}
	
	/**
	 * @param placa
	 * @param marca
	 * @param anoFab
	 * @param modelo
	 * @param peso
	 * @param trucado
	 * @param litros
	 * @param perigosa
	 * @param bitrem
	 */
	public Tanque(String placa, String marca, int anoFab, String modelo, float peso, boolean trucado, int litros,
			boolean perigosa, boolean bitrem) {
		super(placa, marca, anoFab, modelo, peso, trucado);
		this.litros = litros;
		this.perigosa = perigosa;
		this.bitrem = bitrem;
	}
	
	/**
	 * @return the litros
	 */
	public int getLitros() {
		return litros;
	}
	/**
	 * @param litros the litros to set
	 */
	public void setLitros(int litros) {
		this.litros = litros;
	}
	/**
	 * @return the perigosa
	 */
	public boolean isPerigosa() {
		return perigosa;
	}
	/**
	 * @param perigosa the perigosa to set
	 */
	public void setPerigosa(boolean perigosa) {
		this.perigosa = perigosa;
	}
	/**
	 * @return the bitrem
	 */
	public boolean isBitrem() {
		return bitrem;
	}
	/**
	 * @param bitrem the bitrem to set
	 */
	public void setBitrem(boolean bitrem) {
		this.bitrem = bitrem;
	}
}
