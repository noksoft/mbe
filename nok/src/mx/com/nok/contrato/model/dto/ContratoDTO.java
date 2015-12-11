package mx.com.nok.contrato.model.dto;

import java.io.Serializable;

public class ContratoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String idContrato;
	private String numeroContrato;
	private String descripcion;
	private String fechaAlta;
	private String fechaInicio;
	private String fechaFin;
	private String presupuesto;
	private String idCliente;
	private boolean estatus;
	private String filterEstatus;
	
	public String getFilterEstatus() {
		return filterEstatus;
	}
	public void setFilterEstatus(String filterEstatus) {
		this.filterEstatus = filterEstatus;
	}
	public String getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "ContratoDTO [idContrato=" + idContrato + ", numeroContrato="
				+ numeroContrato + ", descripcion=" + descripcion
				+ ", fechaAlta=" + fechaAlta + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", presupuesto=" + presupuesto
				+ ", idCliente=" + idCliente + ", estatus=" + estatus + "]";
	}

}
