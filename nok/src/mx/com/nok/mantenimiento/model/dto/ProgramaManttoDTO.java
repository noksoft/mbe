package mx.com.nok.mantenimiento.model.dto;

import java.io.Serializable;

public class ProgramaManttoDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String idPrograma; 
	private String idTfalla;
	private String observaciones;
	private String idEmpleado;
	private String fechaProgramado;
	private String fechaTerminado;
	private String fechaRegistro;
	
	
	public String  toString(){
		

		 return  "\n[idPrograma "+ idPrograma +
				"\n idTfalla " + idTfalla +
				"\n observaciones " + observaciones +
				"\n idEmpleado " + idEmpleado +
				"\n fechaProgramado " + fechaProgramado +
				"\n fechaTerminado " + fechaTerminado +
				"\n fechaTerminado " + fechaTerminado +
				"\n fechaRegistro " + fechaRegistro + "]";
		
	}


	public String getIdPrograma() {
		return idPrograma;
	}


	public void setIdPrograma(String idPrograma) {
		this.idPrograma = idPrograma;
	}


	public String getIdTfalla() {
		return idTfalla;
	}


	public void setIdTfalla(String idTfalla) {
		this.idTfalla = idTfalla;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getFechaProgramado() {
		return fechaProgramado;
	}


	public void setFechaProgramado(String fechaProgramado) {
		this.fechaProgramado = fechaProgramado;
	}


	public String getFechaTerminado() {
		return fechaTerminado;
	}


	public void setFechaTerminado(String fechaTerminado) {
		this.fechaTerminado = fechaTerminado;
	}


	public String getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}
