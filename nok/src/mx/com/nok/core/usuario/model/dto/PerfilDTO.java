package mx.com.nok.core.usuario.model.dto;

public class PerfilDTO {
	
	private String idPerfil;	
	private String descripcion;
	private boolean estatus;
	
	private String filterEstatusPerfil="";
	
	
	
	public String toString(){
		
		return "\n [ idPerfil = " + idPerfil  +
				"\n descripcion = " + descripcion +
				"\n estatus = " + estatus + "]";
		
	}

	public String getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(String idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public String getFilterEstatusPerfil() {
		return filterEstatusPerfil;
	}

	public void setFilterEstatusPerfil(String filterEstatusPerfil) {
		this.filterEstatusPerfil = filterEstatusPerfil;
	}
	

}
