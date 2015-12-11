package mx.com.nok.adquisicion.model.dto;

import java.io.Serializable;
import java.util.Date;

public class AdquisicionDTO implements Serializable {
	
	private static final long serialVersionUID = 6910039747682949353L;
	
	private String idAdquisicion;
	private String folioReq;
	private String idArticulo;
	private String folioFactura;
	private double cantidad;
	private double costoUnitario;
	private double costoTotal;
	private Date fechaAdquisicion;
	private Boolean estatus;
	private String filterEstatus;
	
	@Override
	public String toString() {
		return "AdquisicionDTO [idAdquisicion=" + idAdquisicion + ", folioReq="
				+ folioReq + ", idArticulo=" + idArticulo + ", folioFactura="
				+ folioFactura + ", cantidad=" + cantidad + ", costoUnitario="
				+ costoUnitario + ", costoTotal=" + costoTotal
				+ ", fechaAdquisicion=" + fechaAdquisicion + ", estatus="
				+ estatus + "]";
	}
	
	public String getIdAdquisicion() {
		return idAdquisicion;
	}
	public void setIdAdquisicion(String idAdquisicion) {
		this.idAdquisicion = idAdquisicion;
	}
	public String getFolioReq() {
		return folioReq;
	}
	public void setFolioReq(String folioReq) {
		this.folioReq = folioReq;
	}
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getFolioFactura() {
		return folioFactura;
	}
	public void setFolioFactura(String folioFactura) {
		this.folioFactura = folioFactura;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	public double getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}
	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getFilterEstatus() {
		return filterEstatus;
	}

	public void setFilterEstatus(String filterEstatus) {
		this.filterEstatus = filterEstatus;
	}
	
}
