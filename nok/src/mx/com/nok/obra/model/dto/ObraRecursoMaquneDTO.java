package mx.com.nok.obra.model.dto;

import java.io.Serializable;

public class ObraRecursoMaquneDTO implements Serializable{
	
	
	 private static final long serialVersionUID = 1L;
	 private String idObra;
	 private String idMaqune;
	 private String fechaAsignacion;
	 
	 
	 public String  toString(){
			

		 return  "\n[idObra "+ idObra +
				"\n idMaqune " + idMaqune +
				"\n fechaAsignacion " + fechaAsignacion 
				+ "]";
		
	}
	 
	public String getIdObra() {
		return idObra;
	}
	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}
	public String getIdMaqune() {
		return idMaqune;
	}
	public void setIdMaqune(String idMaqune) {
		this.idMaqune = idMaqune;
	}
	public String getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(String fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	} 

}
