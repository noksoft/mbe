package mx.com.nok.mantenimiento.model.dto;

import java.io.Serializable;

public class DetalleManttoDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String idProgramaMtto;
	private String idMttoDetalle; 
	private String idEmpleado;
	private String reparacion;
	private String impedimentos;
	private String   status;
	private String fechaAvance;
	
	
	public String  toString(){
		

		 return  "\n[idProgramaMtto "+ idProgramaMtto +
				"\n idMttoDetalle " + idMttoDetalle +
				"\n idEmpleado " + idEmpleado +
				"\n reparacion " + reparacion +
				"\n impedimentos " + impedimentos +
				"\n status " + status +
				"\n fechaAvance " + fechaAvance + "]";
		
	}


	public String getIdProgramaMtto() {
		return idProgramaMtto;
	}


	public void setIdProgramaMtto(String idProgramaMtto) {
		this.idProgramaMtto = idProgramaMtto;
	}


	public String getIdMttoDetalle() {
		return idMttoDetalle;
	}


	public void setIdMttoDetalle(String idMttoDetalle) {
		this.idMttoDetalle = idMttoDetalle;
	}


	public String getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getReparacion() {
		return reparacion;
	}


	public void setReparacion(String reparacion) {
		this.reparacion = reparacion;
	}


	public String getImpedimentos() {
		return impedimentos;
	}


	public void setImpedimentos(String impedimentos) {
		this.impedimentos = impedimentos;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getFechaAvance() {
		return fechaAvance;
	}


	public void setFechaAvance(String fechaAvance) {
		this.fechaAvance = fechaAvance;
	}

	
	
	
	
	
}
