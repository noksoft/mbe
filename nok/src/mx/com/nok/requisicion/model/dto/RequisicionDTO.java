package mx.com.nok.requisicion.model.dto;

import java.io.Serializable;
import java.util.List;

public class RequisicionDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String folioReq;
	private String idEmpleadoRequisicion;
	private String idEmpleadoAdquisicion;
	private String idFalla;
	private String observacionRequisicion;
	private String observacionAdquisicion;
	private String estatusProceso;
	private String fechaRequisicion;
	private String fechaAdquisicion;
	private String rfcRequisicion;
	private String nombreRequisicion;
	private String paternoRequisicion;
	private String maternoRequisicion;
	private String rfcAdquisicion;
	private String nombreAdquisicion;
	private String paternoAdquisicion;
	private String maternoAdquisicion;
	private String tipoFalla;
	private String descripcion;
	private String nombreEquipo;
	private String subfalla;
	private String prioridad;
	private List<RequisicionDetalleDTO> listRequisicionDetalle;
	
	@Override
	public String toString() {
		return "RequisicionDTO [folioReq=" + folioReq
				+ ", idEmpleadoRequisicion=" + idEmpleadoRequisicion
				+ ", idEmpleadoAdquisicion=" + idEmpleadoAdquisicion
				+ ", idFalla=" + idFalla + ", observacionRequisicion="
				+ observacionRequisicion + ", observacionAdquisicion="
				+ observacionAdquisicion + ", estatusProceso=" + estatusProceso
				+ ", fechaRequisicion=" + fechaRequisicion
				+ ", fechaAdquisicion=" + fechaAdquisicion
				+ ", rfcRequisicion=" + rfcRequisicion + ", nombreRequisicion="
				+ nombreRequisicion + ", paternoRequisicion="
				+ paternoRequisicion + ", maternoRequisicion="
				+ maternoRequisicion + ", rfcAdquisicion=" + rfcAdquisicion
				+ ", nombreAdquisicion=" + nombreAdquisicion
				+ ", paternoAdquisicion=" + paternoAdquisicion
				+ ", maternoAdquisicion=" + maternoAdquisicion + ", tipoFalla="
				+ tipoFalla + ", descripcion=" + descripcion
				+ ", nombreEquipo=" + nombreEquipo + ", subfalla=" + subfalla
				+ ", prioridad=" + prioridad + "]";
	}
	
	public String getFolioReq() {
		return folioReq;
	}
	public void setFolioReq(String folioReq) {
		this.folioReq = folioReq;
	}
	public String getIdEmpleadoRequisicion() {
		return idEmpleadoRequisicion;
	}
	public void setIdEmpleadoRequisicion(String idEmpleadoRequisicion) {
		this.idEmpleadoRequisicion = idEmpleadoRequisicion;
	}
	public String getIdEmpleadoAdquisicion() {
		return idEmpleadoAdquisicion;
	}
	public void setIdEmpleadoAdquisicion(String idEmpleadoAdquisicion) {
		this.idEmpleadoAdquisicion = idEmpleadoAdquisicion;
	}
	public String getIdFalla() {
		return idFalla;
	}
	public void setIdFalla(String idFalla) {
		this.idFalla = idFalla;
	}
	public String getObservacionRequisicion() {
		return observacionRequisicion;
	}
	public void setObservacionRequisicion(String observacionRequisicion) {
		this.observacionRequisicion = observacionRequisicion;
	}
	public String getObservacionAdquisicion() {
		return observacionAdquisicion;
	}
	public void setObservacionAdquisicion(String observacionAdquisicion) {
		this.observacionAdquisicion = observacionAdquisicion;
	}
	public String getEstatusProceso() {
		return estatusProceso;
	}
	public void setEstatusProceso(String estatusProceso) {
		this.estatusProceso = estatusProceso;
	}
	public String getFechaRequisicion() {
		return fechaRequisicion;
	}
	public void setFechaRequisicion(String fechaRequisicion) {
		this.fechaRequisicion = fechaRequisicion;
	}
	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(String fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
	public String getRfcRequisicion() {
		return rfcRequisicion;
	}
	public void setRfcRequisicion(String rfcRequisicion) {
		this.rfcRequisicion = rfcRequisicion;
	}
	public String getNombreRequisicion() {
		return nombreRequisicion;
	}
	public void setNombreRequisicion(String nombreRequisicion) {
		this.nombreRequisicion = nombreRequisicion;
	}
	public String getPaternoRequisicion() {
		return paternoRequisicion;
	}
	public void setPaternoRequisicion(String paternoRequisicion) {
		this.paternoRequisicion = paternoRequisicion;
	}
	public String getMaternoRequisicion() {
		return maternoRequisicion;
	}
	public void setMaternoRequisicion(String maternoRequisicion) {
		this.maternoRequisicion = maternoRequisicion;
	}
	public String getRfcAdquisicion() {
		return rfcAdquisicion;
	}
	public void setRfcAdquisicion(String rfcAdquisicion) {
		this.rfcAdquisicion = rfcAdquisicion;
	}
	public String getNombreAdquisicion() {
		return nombreAdquisicion;
	}
	public void setNombreAdquisicion(String nombreAdquisicion) {
		this.nombreAdquisicion = nombreAdquisicion;
	}
	public String getPaternoAdquisicion() {
		return paternoAdquisicion;
	}
	public void setPaternoAdquisicion(String paternoAdquisicion) {
		this.paternoAdquisicion = paternoAdquisicion;
	}
	public String getMaternoAdquisicion() {
		return maternoAdquisicion;
	}
	public void setMaternoAdquisicion(String maternoAdquisicion) {
		this.maternoAdquisicion = maternoAdquisicion;
	}
	public String getTipoFalla() {
		return tipoFalla;
	}
	public void setTipoFalla(String tipoFalla) {
		this.tipoFalla = tipoFalla;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getSubfalla() {
		return subfalla;
	}
	public void setSubfalla(String subfalla) {
		this.subfalla = subfalla;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public List<RequisicionDetalleDTO> getListRequisicionDetalle() {
		return listRequisicionDetalle;
	}

	public void setListRequisicionDetalle(
			List<RequisicionDetalleDTO> listRequisicionDetalle) {
		this.listRequisicionDetalle = listRequisicionDetalle;
	}
}
