package modelo;

import java.util.Date;
import java.util.List;

public class Recibo {
	
	private int rec_id;
	private Date rec_fecha;
	private List<Cuenta>rec_cuenta;
	private Double rec_saldo;
	private List<Empleado> rec_empleado;
	
	public Recibo() {
		
	}
	
	public Recibo(int rec_id, Date rec_fecha, List<Cuenta> rec_cuenta, Double rec_saldo, List<Empleado> rec_empleado) {
		this.rec_id=rec_id;
		this.rec_fecha=rec_fecha;
		this.rec_cuenta=rec_cuenta;
		this.rec_saldo=rec_saldo;
		this.rec_empleado=rec_empleado;
	}

	public int getRec_id() {
		return rec_id;
	}

	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}

	public Date getRec_fecha() {
		return rec_fecha;
	}

	public void setRec_fecha(Date rec_fecha) {
		this.rec_fecha = rec_fecha;
	}

	public List<Cuenta> getRec_cuenta() {
		return rec_cuenta;
	}

	public void setRec_cuenta(List<Cuenta> rec_cuenta) {
		this.rec_cuenta = rec_cuenta;
	}

	public Double getRec_saldo() {
		return rec_saldo;
	}

	public void setRec_saldo(Double rec_saldo) {
		this.rec_saldo = rec_saldo;
	}

	public List<Empleado> getRec_empleado() {
		return rec_empleado;
	}

	public void setRec_empleado(List<Empleado> rec_empleado) {
		this.rec_empleado = rec_empleado;
	}

	@Override
	public String toString() {
		return "Recibo [rec_id=" + rec_id + ", rec_fecha=" + rec_fecha + ", rec_cuenta=" + rec_cuenta + ", rec_saldo="
				+ rec_saldo + "]";
	}
	
	

}
