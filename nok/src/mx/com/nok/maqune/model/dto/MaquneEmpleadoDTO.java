package mx.com.nok.maqune.model.dto;

import java.io.Serializable;

public class MaquneEmpleadoDTO implements Serializable{

	 private static final long serialVersionUID = 1L;
	 private String idEmpleado;
	 private String fechaAlta;
	 private String idMaqune;
	  
	 public String toString(){
		 
		 return  "\n[idEmpleado "+ idEmpleado +
				"\n fechaAlta " + fechaAlta +
				"\n idMaqune " + idMaqune + "]";
		 }
	 
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getIdMaqune() {
		return idMaqune;
	}
	public void setIdMaqune(String idMaqune) {
		this.idMaqune = idMaqune;
	}
}
