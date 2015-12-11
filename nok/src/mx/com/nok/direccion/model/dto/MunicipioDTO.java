package mx.com.nok.direccion.model.dto;

import java.io.Serializable;

public class MunicipioDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	 private String idMunicipio;
	 private String municipio;
	 private String idEntidad;
	 private String entidad;
	 
	 
	 public String toString(){	 
		 
		  return "[ idMunicipio = " +idMunicipio +
					"municipio = " + municipio +
					"idEntidad = " + idEntidad +
					"entidad = " + entidad +" ]";
	 }
	 
	 
	public String getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
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
	 
	 

}
