package modelo;

public class Cliente extends Persona{
	private int codigo;
	private String contraseña;
	
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", contraseña=" + contraseña + "]";
	}

}
