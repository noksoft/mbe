package mx.com.nok.obra.model.dto;

import java.io.Serializable;

public class ObraRecursoPersonaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String idObra;
	public String getIdObra() {
		return idObra;
	}
	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(String fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	private String idEmpleado;
	private String fechaAsignacion;
}
