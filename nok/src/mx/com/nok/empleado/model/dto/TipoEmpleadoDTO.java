package mx.com.nok.empleado.model.dto;

import java.io.Serializable;

public class TipoEmpleadoDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String idTipoEmpleado;
	private String tipoEmpleado;
	private boolean estatus;
	private String filterEstatusTipoEmpleado="true";
	
	
	public String toString (){
		return 	"[\n" +" idTipoEmpleado " + idTipoEmpleado +
		 "\n tipoEmpleado = " + tipoEmpleado +
		 "\n estatus = " + estatus + "]";
		
		
	}


	public String getIdTipoEmpleado() {
		return idTipoEmpleado;
	}


	public void setIdTipoEmpleado(String idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}


	public String getTipoEmpleado() {
		return tipoEmpleado;
	}


	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}


	public boolean isEstatus() {
		return estatus;
	}


	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}


	public String getFilterEstatusTipoEmpleado() {
		return filterEstatusTipoEmpleado;
	}


	public void setFilterEstatusTipoEmpleado(String filterEstatusTipoEmpleado) {
		this.filterEstatusTipoEmpleado = filterEstatusTipoEmpleado;
	}
	


}
