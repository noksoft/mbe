package mx.com.nok.requisicion.model.dto;

import java.io.Serializable;

public class RequisicionDetalleDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String idRequisicionDetalle;
    private String idRequisicion;
    private String idArticulo;
    private String descripcionArticulo;
    private String cantidadRequerida;
    private String cantidadAdquirida;
    private String costoUnidad;
    private String cosTototal;
    private String estatusRequisicionDetalle;
    private Boolean estatus;
    
    public static String REQUISICION = "Requisicion";
	public static String NUEVO = "Nuevo";
	public static String BAJA = "Baja";
	public static String ACTUALIZADO = "Actualizado";
	public static String ADQUISICION = "Adquicion";
	public static String ACTIVA = "Activa";
    
    @Override
	public String toString() {
		return "RequisicionDetalleDTO [idRequisicionDetalle="
				+ idRequisicionDetalle + ", idRequisicion=" + idRequisicion
				+ ", idArticulo=" + idArticulo + ", cantidadRequerida="
				+ cantidadRequerida + ", cantidadAdquirida="
				+ cantidadAdquirida + ", costoUnidad=" + costoUnidad
				+ ", cosTototal=" + cosTototal + ", estatus=" + estatus + "]";
	}
    
	public String getIdRequisicionDetalle() {
		return idRequisicionDetalle;
	}
	public void setIdRequisicionDetalle(String idRequisicionDetalle) {
		this.idRequisicionDetalle = idRequisicionDetalle;
	}
	public String getIdRequisicion() {
		return idRequisicion;
	}
	public void setIdRequisicion(String idRequisicion) {
		this.idRequisicion = idRequisicion;
	}
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}
	
	public String getDescripcionArticulo(){
		return descripcionArticulo;
	}
	public void setDescripcionArticulo(String descripcionArticulo){
		this.descripcionArticulo = descripcionArticulo;
	}
	
	public String getCantidadRequerida() {
		return cantidadRequerida;
	}
	public void setCantidadRequerida(String cantidadRequerida) {
		this.cantidadRequerida = cantidadRequerida;
	}
	public String getCantidadAdquirida() {
		return cantidadAdquirida;
	}
	public void setCantidadAdquirida(String cantidadAdquirida) {
		this.cantidadAdquirida = cantidadAdquirida;
	}
	public String getCostoUnidad() {
		return costoUnidad;
	}
	public void setCostoUnidad(String costoUnidad) {
		this.costoUnidad = costoUnidad;
	}
	public String getCosTototal() {
		return cosTototal;
	}
	public void setCosTototal(String cosTototal) {
		this.cosTototal = cosTototal;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getEstatusRequisicionDetalle() {
		return estatusRequisicionDetalle;
	}

	public void setEstatusRequisicionDetalle(String estatusRequisicionDetalle) {
		this.estatusRequisicionDetalle = estatusRequisicionDetalle;
	}
}
