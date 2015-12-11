package mx.com.nok.empleado.model.dto;

import java.io.Serializable;

public class HabilidadDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idHabilidad;
	private String habilidad;
	private String idEmpleado;
	private String descripcion;
	private boolean status;
	private String filterEstatusFalla="";
	
	
	public String getFilterEstatusFalla() {
		return filterEstatusFalla;
	}

	public void setFilterEstatusFalla(String filterEstatusFalla) {
		this.filterEstatusFalla = filterEstatusFalla;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getIdHabilidad() {
		return idHabilidad;
	}

	public void setIdHabilidad(String idHabilidad) {
		this.idHabilidad = idHabilidad;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	public String toString(){
		return "[\n" + "idHabilidad " + idHabilidad + "\n habilidad " + 
	habilidad + "\n idEmpleado " + idEmpleado + "\n descripcion " +descripcion;  
	}
	
	
}
