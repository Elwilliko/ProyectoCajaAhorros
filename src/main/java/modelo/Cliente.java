package modelo;

public class Cliente extends Persona{
	private int cli_codigo;
	private String cli_contrasena;
	
	public Cliente() {
		
	}
	
	/**
	 * @param cli_codigo
	 * @param cli_contrasena
	 */
	public Cliente(int cli_codigo, String cli_contrasena) {
		super();
		this.cli_codigo = cli_codigo;
		this.cli_contrasena = cli_contrasena;
	}

	/**
	 * @return the cli_codigo
	 */
	public int getCli_codigo() {
		return cli_codigo;
	}

	/**
	 * @param cli_codigo the cli_codigo to set
	 */
	public void setCli_codigo(int cli_codigo) {
		this.cli_codigo = cli_codigo;
	}

	/**
	 * @return the cli_contrasena
	 */
	public String getCli_contrasena() {
		return cli_contrasena;
	}

	/**
	 * @param cli_contrasena the cli_contrasena to set
	 */
	public void setCli_contrasena(String cli_contrasena) {
		this.cli_contrasena = cli_contrasena;
	}

	//toString
	@Override
	public String toString() {
		return "Cliente [cli_codigo=" + cli_codigo + ", cli_contrasena=" + cli_contrasena + "]";
	}
}
