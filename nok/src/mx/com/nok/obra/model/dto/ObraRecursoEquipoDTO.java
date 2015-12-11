package mx.com.nok.obra.model.dto;

import java.io.Serializable;

public class ObraRecursoEquipoDTO implements Serializable{
	
	
	 private static final long serialVersionUID = 1L;
	 private String idObra;
	 private String idEquipo;
	 private String fechaAsignacion;
	 
	 
	 public String  toString(){
			

		 return  "\n[idObra "+ idObra +
				"\n idEquipo " + idEquipo +
				"\n fechaAsignacion " + fechaAsignacion 
				+ "]";
		
	}
	 
	public String getIdObra() {
		return idObra;
	}
	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}
	public String getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(String idMaqune) {
		this.idEquipo = idMaqune;
	}
	public String getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(String fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	} 

}
