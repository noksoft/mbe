package mx.com.nok.direccion.model.dto;

import java.io.Serializable;

public class EntidadDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String idEntidad;
	 private String entidad;
	 private String sigla;
	 
	 
	 public String toString(){	 
		 
		  return "[ idEntidad = " +idEntidad +
					"entidad = " + entidad +
					"sigla = " + sigla +" ]";
	 }
	 
	 
	public String getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	 
	 
	 

}
