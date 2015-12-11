package mx.com.nok.solicitud.model.dto;

import java.io.Serializable;

public class SolicitudDTO implements Serializable{
	
	private static final long serialVersionUID = -2419981830406787482L;
	
	private String id_solicitud;
	private String id_falla;
	private String nombre_solicitud;
	private String id_articulo;
	private String id_prooveedor;
	private String id_empleado_requisicion;
	private String id_empleado_adquisicion;
	private String fecha_requisicion;
	private String fecha_adquisicion;
	private String forma_pago;
	private String cuenta_bancaria;
	private String cantidad;
	private String costo_unidad;
	private String costo_total;
	private String tiempo_entrega;
	private String observaciones; 
	private String estatus_proceso;
	private String descripcion;
	private String marca;
	private String submarca;
	private String subcategoria;
	private String rfc_requisicion;
	private String nombre_requisicion;
	private String paterno_requisicion;
	private String materno_requisicion;
	private String rfc_adquisicion;
	private String nombre_adquisicion;
	private String paterno_adquisicion;
	private String materno_adquisicion;
	private String tipo_falla;
	private String descripcion_falla;
	private String nombreequipo;
	private String subfalla;
	private String prioridad;
	private String observaciones_falla;
	private String type_insert;
	private Boolean estatus;
	
	@Override
	public String toString() {
		return "SolicitudDTO [id_solicitud=" + id_solicitud + ", id_falla=" + id_falla + ", id_articulo=" + id_articulo
				+ ", id_prooveedor=" + id_prooveedor + ", id_empleado_requisicion=" + id_empleado_requisicion
				+ ", id_empleado_adquisicion=" + id_empleado_adquisicion + ", fecha_requisicion=" + fecha_requisicion
				+ ", fecha_adquisicion=" + fecha_adquisicion + ", forma_pago=" + forma_pago + ", cuenta_bancaria="
				+ cuenta_bancaria + ", cantidad=" + cantidad + ", costo_unidad=" + costo_unidad + ", costo_total="
				+ costo_total + ", tiempo_entrega=" + tiempo_entrega + ", observaciones=" + observaciones
				+ ", estatus_proceso=" + estatus_proceso + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", submarca=" + submarca + ", subcategoria=" + subcategoria + ", rfc_requisicion=" + rfc_requisicion
				+ ", nombre_requisicion=" + nombre_requisicion + ", paterno_requisicion=" + paterno_requisicion
				+ ", materno_requisicion=" + materno_requisicion + ", rfc_adquisicion=" + rfc_adquisicion
				+ ", nombre_adquisicion=" + nombre_adquisicion + ", paterno_adquisicion=" + paterno_adquisicion
				+ ", materno_adquisicion=" + materno_adquisicion + ", tipo_falla=" + tipo_falla + ", descripcion_falla="
				+ descripcion_falla + ", nombreequipo=" + nombreequipo + ", subfalla=" + subfalla + ", prioridad="
				+ prioridad + ", observaciones_falla=" + observaciones_falla + ", estatus=" + estatus + "]";
	}
	
	public String getId_solicitud() {
		return id_solicitud;
	}
	public void setId_solicitud(String id_solicitud) {
		this.id_solicitud = id_solicitud;
	}
	public String getId_falla() {
		return id_falla;
	}
	public void setId_falla(String id_falla) {
		this.id_falla = id_falla;
	}
	public String getId_articulo() {
		return id_articulo;
	}
	public void setId_articulo(String id_articulo) {
		this.id_articulo = id_articulo;
	}
	public String getId_prooveedor() {
		return id_prooveedor;
	}
	public void setId_prooveedor(String id_prooveedor) {
		this.id_prooveedor = id_prooveedor;
	}
	public String getId_empleado_requisicion() {
		return id_empleado_requisicion;
	}
	public void setId_empleado_requisicion(String id_empleado_requisicion) {
		this.id_empleado_requisicion = id_empleado_requisicion;
	}
	public String getId_empleado_adquisicion() {
		return id_empleado_adquisicion;
	}
	public void setId_empleado_adquisicion(String id_empleado_adquisicion) {
		this.id_empleado_adquisicion = id_empleado_adquisicion;
	}
	public String getFecha_requisicion() {
		return fecha_requisicion;
	}
	public void setFecha_requisicion(String fecha_requisicion) {
		this.fecha_requisicion = fecha_requisicion;
	}
	public String getFecha_adquisicion() {
		return fecha_adquisicion;
	}
	public void setFecha_adquisicion(String fecha_adquisicion) {
		this.fecha_adquisicion = fecha_adquisicion;
	}
	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	public String getCuenta_bancaria() {
		return cuenta_bancaria;
	}
	public void setCuenta_bancaria(String cuenta_bancaria) {
		this.cuenta_bancaria = cuenta_bancaria;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getCosto_unidad() {
		return costo_unidad;
	}
	public void setCosto_unidad(String costo_unidad) {
		this.costo_unidad = costo_unidad;
	}
	public String getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(String costo_total) {
		this.costo_total = costo_total;
	}
	public String getTiempo_entrega() {
		return tiempo_entrega;
	}
	public void setTiempo_entrega(String tiempo_entrega) {
		this.tiempo_entrega = tiempo_entrega;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getEstatus_proceso() {
		return estatus_proceso;
	}
	public void setEstatus_proceso(String estatus_proceso) {
		this.estatus_proceso = estatus_proceso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSubmarca() {
		return submarca;
	}
	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	public String getRfc_requisicion() {
		return rfc_requisicion;
	}
	public void setRfc_requisicion(String rfc_requisicion) {
		this.rfc_requisicion = rfc_requisicion;
	}
	public String getNombre_requisicion() {
		return nombre_requisicion;
	}
	public void setNombre_requisicion(String nombre_requisicion) {
		this.nombre_requisicion = nombre_requisicion;
	}
	public String getPaterno_requisicion() {
		return paterno_requisicion;
	}
	public void setPaterno_requisicion(String paterno_requisicion) {
		this.paterno_requisicion = paterno_requisicion;
	}
	public String getMaterno_requisicion() {
		return materno_requisicion;
	}
	public void setMaterno_requisicion(String materno_requisicion) {
		this.materno_requisicion = materno_requisicion;
	}
	public String getRfc_adquisicion() {
		return rfc_adquisicion;
	}
	public void setRfc_adquisicion(String rfc_adquisicion) {
		this.rfc_adquisicion = rfc_adquisicion;
	}
	public String getNombre_adquisicion() {
		return nombre_adquisicion;
	}
	public void setNombre_adquisicion(String nombre_adquisicion) {
		this.nombre_adquisicion = nombre_adquisicion;
	}
	public String getPaterno_adquisicion() {
		return paterno_adquisicion;
	}
	public void setPaterno_adquisicion(String paterno_adquisicion) {
		this.paterno_adquisicion = paterno_adquisicion;
	}
	public String getMaterno_adquisicion() {
		return materno_adquisicion;
	}
	public void setMaterno_adquisicion(String materno_adquisicion) {
		this.materno_adquisicion = materno_adquisicion;
	}
	public String getTipo_falla() {
		return tipo_falla;
	}
	public void setTipo_falla(String tipo_falla) {
		this.tipo_falla = tipo_falla;
	}
	public String getDescripcion_falla() {
		return descripcion_falla;
	}
	public void setDescripcion_falla(String descripcion_falla) {
		this.descripcion_falla = descripcion_falla;
	}
	public String getNombreequipo() {
		return nombreequipo;
	}
	public void setNombreequipo(String nombreequipo) {
		this.nombreequipo = nombreequipo;
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
	public String getObservaciones_falla() {
		return observaciones_falla;
	}
	public void setObservaciones_falla(String observaciones_falla) {
		this.observaciones_falla = observaciones_falla;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getType_insert() {
		return type_insert;
	}

	public void setType_insert(String type_insert) {
		this.type_insert = type_insert;
	}

	public String getNombre_solicitud() {
		return nombre_solicitud;
	}

	public void setNombre_solicitud(String nombre_solicitud) {
		this.nombre_solicitud = nombre_solicitud;
	}
}
