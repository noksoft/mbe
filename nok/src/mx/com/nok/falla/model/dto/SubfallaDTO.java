package mx.com.nok.falla.model.dto;

import java.io.Serializable;

public class SubfallaDTO implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	private String idFalla;
	private String falla;
	private String idSubfalla;
	private String subfalla;
	private boolean estatus;
	
	
	private String filterEstatusSubfalla="";
	

	
	public String toString(){
		return "\n[ idFalla = " + idFalla+
				"\n falla = "+ falla+
				"\n idSubfalla = "+ idSubfalla+
				"\n subfalla = " + subfalla+
				"\n estatus = "+estatus+"]";
		
	}



	public String getIdFalla() {
		return idFalla;
	}



	public void setIdFalla(String idFalla) {
		this.idFalla = idFalla;
	}



	public String getFalla() {
		return falla;
	}



	public void setFalla(String falla) {
		this.falla = falla;
	}



	public String getIdSubfalla() {
		return idSubfalla;
	}



	public void setIdSubfalla(String idSubfalla) {
		this.idSubfalla = idSubfalla;
	}



	public String getSubfalla() {
		return subfalla;
	}



	public void setSubfalla(String subfalla) {
		this.subfalla = subfalla;
	}



	public boolean isEstatus() {
		return estatus;
	}



	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}



	public String getFilterEstatusSubfalla() {
		return filterEstatusSubfalla;
	}



	public void setFilterEstatusSubfalla(String filterEstatusSubfalla) {
		this.filterEstatusSubfalla = filterEstatusSubfalla;
	}
}
