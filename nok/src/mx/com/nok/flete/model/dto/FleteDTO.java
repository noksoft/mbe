package mx.com.nok.flete.model.dto;

import java.io.Serializable;

public class FleteDTO implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	private String idFlete;
	private String origen;
	private String origenLat;
	private String origenLng;
	private String destino;
	private String destinoLat;
	private String destinoLng;
	private String idEmpleadoOperador;
	private String carga;
	private String fechaSalida;
	private String fechaLlegada;
	private String status;
	private String observaciones;
	private String idMaqune;
	
	

	public String  toString(){
		

		 return  "\n[idFlete "+ idFlete +
				"\n origen " + origen +
				"\n origenLat " + origenLat +
				"\n origenLng " + origenLng +
				"\n destino " + destino +				
				"\n destinoLat " + destinoLat +
				"\n destinoLng " + destinoLng +
				"\n idEmpleadoOperador " + idEmpleadoOperador +
				"\n carga " + carga +
				"\n fechaSalida " + fechaSalida +
				"\n fechaLlegada " + fechaLlegada+
				"\n status " + status+
				"\n observaciones " + observaciones+
				"\n idMaqune " + idMaqune+"]";
		
	}



	public String getIdFlete() {
		return idFlete;
	}



	public void setIdFlete(String idFlete) {
		this.idFlete = idFlete;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getOrigenLat() {
		return origenLat;
	}



	public void setOrigenLat(String origenLat) {
		this.origenLat = origenLat;
	}



	public String getOrigenLng() {
		return origenLng;
	}



	public void setOrigenLng(String origenLng) {
		this.origenLng = origenLng;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public String getDestinoLat() {
		return destinoLat;
	}



	public void setDestinoLat(String destinoLat) {
		this.destinoLat = destinoLat;
	}



	public String getDestinoLng() {
		return destinoLng;
	}



	public void setDestinoLng(String destinoLng) {
		this.destinoLng = destinoLng;
	}



	public String getIdEmpleadoOperador() {
		return idEmpleadoOperador;
	}



	public void setIdEmpleadoOperador(String idEmpleadoOperador) {
		this.idEmpleadoOperador = idEmpleadoOperador;
	}



	public String getCarga() {
		return carga;
	}



	public void setCarga(String carga) {
		this.carga = carga;
	}



	public String getFechaSalida() {
		return fechaSalida;
	}



	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}



	public String getFechaLlegada() {
		return fechaLlegada;
	}



	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public String getIdMaqune() {
		return idMaqune;
	}



	public void setIdMaqune(String idMaqune) {
		this.idMaqune = idMaqune;
	}




}
