package mx.com.nok.tipoempleado.model.dto;

import java.io.Serializable;

public class TipoEmpleadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id_tipo_empleado;
	private String tipo_empleado;
	private Boolean estatus;
	public int getId_tipo_empleado() {
		return id_tipo_empleado;
	}
	public void setId_tipo_empleado(int id_tipo_empleado) {
		this.id_tipo_empleado = id_tipo_empleado;
	}
	public String getTipo_empleado() {
		return tipo_empleado;
	}
	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	
}
