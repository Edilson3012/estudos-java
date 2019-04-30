/**
 * 
 */
package estudos;

import javax.swing.JOptionPane;

/**
 * @descrition Classe criada para ...
 *
 * @author Edilson Gotardi Murbach
 *
 * @since Classe criada no dia 30 de abr de 2019 as 12:54:03
 *
 * @version 
 *
 */
public class Bebida {
	
	private Integer codigo;
	private String descricao;
	private float preco;
	private Integer teorAlcool;
	private boolean conhecida;
	
	/**
	 * @param codigo
	 * @param descricao
	 * @param preco
	 * @param teorAlcool
	 * @param conhecida
	 */
	public Bebida(Integer codigo, String descricao, float preco, Integer teorAlcool, boolean conhecida) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.teorAlcool = teorAlcool;
		this.conhecida = conhecida;
	}

	public void exibirDados() {
		System.out.println(" ----- EXIBIR DADOS ----- ");
		System.out.println("C�digo: "+getCodigo());
		System.out.println("Descri��o: "+getDescricao());
		System.out.println("Pre�o: "+getPreco());
		System.out.println("Teor Alc�olico: "+getTeorAlcool());
		System.out.println("Conhecida: "+isConhecida());
	}
	
	public void classificarBebida() {
		
		JOptionPane.showMessageDialog(null, "---- "
				+ "Classifica��o da bebida! ---- "
				+ "\n1 - Natural"
				+ "\n2 - Alcoolica"
				+ "\n3 - Perigosa"
				+ "\n4 - Impr�pria"
				+ "\n5 - N�o bebida");
		
		Integer teor = Integer.parseInt(JOptionPane.showInputDialog("Informe o teor alc�olico da bebida: "));
		
		if (teor < 2 ) {
			JOptionPane.showMessageDialog(null, "Bebida Natural");
		} else if (teor < 30) {
			JOptionPane.showMessageDialog(null, "Bebida Alcoolica");
		} else if (teor < 50) {
			JOptionPane.showMessageDialog(null, "Bebida Perigosa");
		} else if (teor < 60) {
			JOptionPane.showMessageDialog(null, "Bebida Impr�pria");
		} else {
			JOptionPane.showMessageDialog(null, "N�o bebida");
		}
		exibirDados();
	}

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the preco
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * @param preco the preco to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

	/**
	 * @return the teorAlcool
	 */
	public float getTeorAlcool() {
		return teorAlcool;
	}

	/**
	 * @param teorAlcool the teorAlcool to set
	 */
	public void setTeorAlcool(Integer teorAlcool) {
		this.teorAlcool = teorAlcool;
	}

	/**
	 * @return the conhecida
	 */
	public boolean isConhecida() {
		return conhecida;
	}

	/**
	 * @param conhecida the conhecida to set
	 */
	public void setConhecida(boolean conhecida) {
		this.conhecida = conhecida;
	}
	
}
