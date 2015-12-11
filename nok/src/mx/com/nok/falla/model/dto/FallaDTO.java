package mx.com.nok.falla.model.dto;

import java.io.Serializable;

public class FallaDTO implements Serializable{
	
	
	
	
	private static final long serialVersionUID = 1L;
	private String idFalla;
	private String falla;
	private boolean estatus;
	private String filterEstatusFalla="";
	
	public String toString(){
		
		return "\n[  idFalla = " + idFalla +
		"\n falla = "+ falla +
		"\n estatus = "+ estatus + "]";		
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
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	public String getFilterEstatusFalla() {
		return filterEstatusFalla;
	}
	public void setFilterEstatusFalla(String filterEstatusFalla) {
		this.filterEstatusFalla = filterEstatusFalla;
	}
	

}
