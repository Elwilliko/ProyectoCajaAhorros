package modelo;

import java.sql.Date;
import java.util.List;

public class LibroDiario {
	
	private int lib_id;
	private Date lib_fecha;
	private List<PlanCuentas> listPlan;
	
	public LibroDiario() {
		
	}
	public LibroDiario(int lib_id,Date lib_fecha,List<PlanCuentas>listaPan) {
		this.lib_id=lib_id;
		this.lib_fecha=lib_fecha;
		this.listPlan=listPlan;
	}
	public int getLib_id() {
		return lib_id;
	}
	public void setLib_id(int lib_id) {
		this.lib_id = lib_id;
	}
	public Date getLib_fecha() {
		return lib_fecha;
	}
	public void setLib_fecha(Date lib_fecha) {
		this.lib_fecha = lib_fecha;
	}
	public List<PlanCuentas> getListPlan() {
		return listPlan;
	}
	public void setListPlan(List<PlanCuentas> listPlan) {
		this.listPlan = listPlan;
	}
	@Override
	public String toString() {
		return "LibroDiario [lib_id=" + lib_id + ", lib_fecha=" + lib_fecha + ", listPlan=" + listPlan + "]";
	}
	
}
