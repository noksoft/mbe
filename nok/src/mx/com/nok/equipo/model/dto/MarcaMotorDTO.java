package mx.com.nok.equipo.model.dto;

import java.io.Serializable;

public class MarcaMotorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String idMarcaMotor;
	private String marcaMotor;
	private String filterEstatusMarcaMotor;
	private boolean estatus;		
	
	public String getIdMarcaMotor() {
		return idMarcaMotor;
	}
	public void setIdMarcaMotor(String idMarcaMotor) {
		this.idMarcaMotor = idMarcaMotor;
	}
	public String getMarcaMotor() {
		return marcaMotor;
	}
	public void setMarcaMotor(String marcaMotor) {
		this.marcaMotor = marcaMotor;
	}

	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	public String getFilterEstatusMarcaMotor() {
		return filterEstatusMarcaMotor;
	}
	public void setFilterEstatusMarcaMotor(String filterEstatusMarcaMotor) {
		this.filterEstatusMarcaMotor = filterEstatusMarcaMotor;
	}	
	
}
