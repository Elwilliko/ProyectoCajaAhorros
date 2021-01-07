package modelo;

import java.util.List;

public class PlanCuentas {
	
	private int plan_id;
	private List<Cuenta> listCuenta;
	
	public PlanCuentas() {
		
	}
	
	public PlanCuentas(int plan_id,List<Cuenta> listCuenta) {
		this.plan_id=plan_id;
		this.listCuenta=listCuenta;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public List<Cuenta> getListCuenta() {
		return listCuenta;
	}

	public void setListCuenta(List<Cuenta> listCuenta) {
		this.listCuenta = listCuenta;
	}

	@Override
	public String toString() {
		return "PlanCuentas [plan_id=" + plan_id + ", listCuenta=" + listCuenta + "]";
	}
	
	

}
