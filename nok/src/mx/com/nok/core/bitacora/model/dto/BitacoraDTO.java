package mx.com.nok.core.bitacora.model.dto;

import java.io.Serializable;

public class BitacoraDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String idMovimiento;
	private String descripcion;
	private String idEmpleado;
	private String fechaMovimiento;	
	private String ip;
	
	
public String toString(){
		
		return "\n [ idMovimiento = " + idMovimiento  +
				"\n descripcion = " + descripcion +
				"\n idEmpleado = " + idEmpleado +
				"\n ip = " + ip +  
				"\n fechaMovimiento = " + fechaMovimiento +      "]";
		
	}	


	public String getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(String idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(String fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
	
}
