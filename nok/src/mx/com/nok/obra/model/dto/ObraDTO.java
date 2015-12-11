package mx.com.nok.obra.model.dto;

import java.io.Serializable;

public class ObraDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	private String idObra; 
	private String claveObra;
	private String nombre; 
	private String lat;
	private String lng;
	private String idEmpleado;
	private String nombreEmpleado;




	private double presupuestoEstimado;
	private String contrato;
	private String status; 
	private String fechaInicio;
	private String fechaTermina;
	private String idEntidad;
	private String idMunicipio;
	private String idLocalidad;
	private int jornadaLaboral;
	private String descripcion;
	private String tipoJornada;



	public String getTipoJornada() {
		return tipoJornada;
	}



	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getJornadaLaboral() {
		return jornadaLaboral;
	}



	public void setJornadaLaboral(int jornadaLaboral) {
		this.jornadaLaboral = jornadaLaboral;
	}



	public String  toString(){


		return  "\n[idObra "+ idObra +
				"\n claveObra " + claveObra +
				"\n nombre " + nombre +
				"\n lat " + lat +
				"\n lng " + lng +
				"\n idEmpleado " + idEmpleado +
				"\n presupuestoEstimado " + presupuestoEstimado +
				"\n contrato " + contrato +
				"\n status " + status +
				"\n fechaInicio " + fechaInicio +
				"\n fechaTermina " + fechaTermina+ "]";

	}



	public String getIdObra() {
		return idObra;
	}



	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}



	public String getClaveObra() {
		return claveObra;
	}



	public void setClaveObra(String claveObra) {
		this.claveObra = claveObra;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getLat() {
		return lat;
	}



	public void setLat(String lat) {
		this.lat = lat;
	}



	public String getLng() {
		return lng;
	}



	public void setLng(String lng) {
		this.lng = lng;
	}



	public String getIdEmpleado() {
		return idEmpleado;
	}



	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}



	public double getPresupuestoEstimado() {
		return presupuestoEstimado;
	}



	public void setPresupuestoEstimado(double presupuestoEstimado) {
		this.presupuestoEstimado = presupuestoEstimado;
	}



	public String getContrato() {
		return contrato;
	}



	public void setContrato(String contrato) {
		this.contrato = contrato;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public String getFechaTermina() {
		return fechaTermina;
	}



	public void setFechaTermina(String fechaTermina) {
		this.fechaTermina = fechaTermina;
	}
	public String getIdEntidad() {
		return idEntidad;
	}



	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}



	public String getIdMunicipio() {
		return idMunicipio;
	}



	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}



	public String getIdLocalidad() {
		return idLocalidad;
	}



	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}



	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

}
