package mx.com.nok.equipo.model.dto;

import java.io.Serializable;
import java.util.List;
/*
 * author Carlos Zaragoza
 * description Clase Diagnostico.
 * */
public class DiagnosticoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id_t_diagnostico;
	private String id_equipo;
	private String descripcion;
	private String fecha_diagnostico;
	private String fecha_alta;
	private String id_empleado;
	private String numeroeconomico;
	private String rfc_empleado;
	private String nombre_empleado;
	private String paterno;
	private String materno;
	private String tipo_empleado;
	private String telefono;
	private String celular;
	
	private List<DiagnosticoDetalle> detalle;
	
	public String getId_t_diagnostico() {
		return id_t_diagnostico;
	}
	public void setId_t_diagnostico(String id_t_diagnostico) {
		this.id_t_diagnostico = id_t_diagnostico;
	}
	public String getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha_diagnostico() {
		return fecha_diagnostico;
	}
	public void setFecha_diagnostico(String fecha_diagnostico) {
		this.fecha_diagnostico = fecha_diagnostico;
	}
	public String getFecha_alta() {
		return fecha_alta;
	}
	public void setFecha_alta(String fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	public String getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNumeroeconomico() {
		return numeroeconomico;
	}
	public void setNumeroeconomico(String numeroeconomico) {
		this.numeroeconomico = numeroeconomico;
	}
	public String getRfc_empleado() {
		return rfc_empleado;
	}
	public void setRfc_empleado(String rfc_empleado) {
		this.rfc_empleado = rfc_empleado;
	}
	public String getNombre_empleado() {
		return nombre_empleado;
	}
	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getTipo_empleado() {
		return tipo_empleado;
	}
	public void setTipo_empleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public List<DiagnosticoDetalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<DiagnosticoDetalle> detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "DiagnosticoDTO [id_t_diagnostico=" + id_t_diagnostico + ", id_equipo=" + id_equipo + ", descripcion="
				+ descripcion + ", fecha_diagnostico=" + fecha_diagnostico + ", fecha_alta=" + fecha_alta
				+ ", id_empleado=" + id_empleado + ", numeroeconomico=" + numeroeconomico + ", rfc_empleado="
				+ rfc_empleado + ", nombre_empleado=" + nombre_empleado + ", paterno=" + paterno + ", materno="
				+ materno + ", tipo_empleado=" + tipo_empleado + ", telefono=" + telefono + ", celular=" + celular
				+ ", detalle=" + detalle + "]";
	}
	
}
