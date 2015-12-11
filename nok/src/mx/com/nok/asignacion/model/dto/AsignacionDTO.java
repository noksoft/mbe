package mx.com.nok.asignacion.model.dto;

import java.io.Serializable;

public class AsignacionDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String idAsignacionObra;
	private String tipoAsignacion;
    private String idObra;
    private String fechaAsignacion;
	private String nombreObra;
    private String descripcionObra;
    private String idEmpleado;
    private String nombre;
    private String paterno;
    private String materno;
    private String nombreCompleto;
    private String idEquipo;
    private String numeroeconomico;
    private String descripcion;
    private String tipocategoria;
    private String categoria;
    private String subcategoria;
    private String estatus;
    private String habilidades;
    private String typeQuery;
    private String estatusEquipo;
    private String typeInsert;
    
    public String getIdAsignacionObra() {
		return idAsignacionObra;
	}
	public void setIdAsignacionObra(String idAsignacionObra) {
		this.idAsignacionObra = idAsignacionObra;
	}
	
	public String getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(String fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
    
	public String getEstatusEquipo() {
		return estatusEquipo;
	}
	public void setEstatusEquipo(String estatusEquipo) {
		this.estatusEquipo = estatusEquipo;
	}
	public String getTipoAsignacion() {
		return tipoAsignacion;
	}
	public void setTipoAsignacion(String tipoAsignacion) {
		this.tipoAsignacion = tipoAsignacion;
	}
	public String getIdObra() {
		return idObra;
	}
	public void setIdObra(String idObra) {
		this.idObra = idObra;
	}
	public String getNombreObra() {
		return nombreObra;
	}
	public void setNombreObra(String nombreObra) {
		this.nombreObra = nombreObra;
	}
	public String getDescripcionObra() {
		return descripcionObra;
	}
	public void setDescripcionObra(String descripcionObra) {
		this.descripcionObra = descripcionObra;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNumeroeconomico() {
		return numeroeconomico;
	}
	public void setNumeroeconomico(String numeroeconomico) {
		this.numeroeconomico = numeroeconomico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipocategoria() {
		return tipocategoria;
	}
	public void setTipocategoria(String tipocategoria) {
		this.tipocategoria = tipocategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	public String getTypeQuery() {
		return typeQuery;
	}
	public void setTypeQuery(String typeQuery) {
		this.typeQuery = typeQuery;
	}
	@Override
	public String toString() {
		return "AsignacionDTO [tipoAsignacion=" + tipoAsignacion + ", idObra=" + idObra + ", nombreObra=" + nombreObra
				+ ", descripcionObra=" + descripcionObra + ", idEmpleado=" + idEmpleado + ", nombre=" + nombre
				+ ", paterno=" + paterno + ", materno=" + materno + ", nombreCompleto=" + nombreCompleto + ", idEquipo="
				+ idEquipo + ", numeroeconomico=" + numeroeconomico + ", descripcion=" + descripcion
				+ ", tipocategoria=" + tipocategoria + ", categoria=" + categoria + ", subcategoria=" + subcategoria
				+ ", estatus=" + estatus + ", habilidades=" + habilidades + ", typeQuery=" + typeQuery + "]";
	}
	public String getTypeInsert() {
		return typeInsert;
	}
	public void setTypeInsert(String typeInsert) {
		this.typeInsert = typeInsert;
	}
    
}
