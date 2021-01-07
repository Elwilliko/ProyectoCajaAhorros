package modelo;

public class Empleado extends Persona {
	
	private int emp_id;
	private String cargo;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empleado [emp_id=" + emp_id + ", cargo=" + cargo + "]";
	}
	
}