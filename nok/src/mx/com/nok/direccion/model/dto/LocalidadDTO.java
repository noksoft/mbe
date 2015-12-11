package mx.com.nok.direccion.model.dto;

import java.io.Serializable;

public class LocalidadDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String idLocalidad;
	private String localidad;
	private String idMunicipio;
	private String idEntidad;
	private String municipio;
	private String entidad;
	
	
	
	 public String toString(){	 
		 
		  return "[ idLocalidad = " +idLocalidad +
					"localidad = " + localidad +
					"idMunicipio = " + idMunicipio +
					"municipio = " + municipio +
					
					"entidad = " + entidad +" ]";
	 }
	 
	
	
	public String getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public String getEntidad() {
		return entidad;
	}



	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

}
