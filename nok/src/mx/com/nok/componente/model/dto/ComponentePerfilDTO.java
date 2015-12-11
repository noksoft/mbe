package mx.com.nok.componente.model.dto;

import java.io.Serializable;

public class ComponentePerfilDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String idComponente;
	private String idPerfil;
	private String fechaPermiso;
	
	
	public String toString(){
		
		return "\n[ idComponente = " + idComponente +		
		 "\n idPerfil = " + idPerfil+
		 "\n fechaPermiso = " + fechaPermiso+" ]";
			
		}
	
	public String getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
	
	public String getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(String idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getFechaPermiso() {
		return fechaPermiso;
	}

	public void setFechaPermiso(String fechaPermiso) {
		this.fechaPermiso = fechaPermiso;
	}

}
