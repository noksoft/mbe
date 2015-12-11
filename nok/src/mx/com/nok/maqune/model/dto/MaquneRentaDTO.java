package mx.com.nok.maqune.model.dto;

import java.io.Serializable;

public class MaquneRentaDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String folioRenta ;
	private String idProveedor;
	private double costoRenta;
	private double sueldoOperador;
	private String status;
	private String fechaRenta;
	private String fechaRegreso;
	private String idMaqune;
	
	
	
	public String toString(){
		
		 return  "\n[folioRenta "+ folioRenta +
				"\n idProveedor " + idProveedor +
				"\n costoRenta " + costoRenta +
				"\n sueldoOperador " + sueldoOperador +
				"\n status " + status +
				"\n fechaRenta " + fechaRenta +
				"\n fechaRegreso " + fechaRegreso +
				"\n idMaqune " + idMaqune + "]";	
		
		
		
	}
	
	
	public String getFolioRenta() {
		return folioRenta;
	}
	public void setFolioRenta(String folioRenta) {
		this.folioRenta = folioRenta;
	}
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	public double getCostoRenta() {
		return costoRenta;
	}
	public void setCostoRenta(double costoRenta) {
		this.costoRenta = costoRenta;
	}
	public double getSueldoOperador() {
		return sueldoOperador;
	}
	public void setSueldoOperador(double sueldoOperador) {
		this.sueldoOperador = sueldoOperador;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFechaRenta() {
		return fechaRenta;
	}
	public void setFechaRenta(String fechaRenta) {
		this.fechaRenta = fechaRenta;
	}
	public String getFechaRegreso() {
		return fechaRegreso;
	}
	public void setFechaRegreso(String fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}
	public String getIdMaqune() {
		return idMaqune;
	}
	public void setIdMaqune(String idMaqune) {
		this.idMaqune = idMaqune;
	}

}
