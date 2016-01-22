package mx.com.nok.fallaEquipo.model.dto;

import java.io.Serializable;

public class FallaEquipoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String id_tfallas;
	private int tipo_falla;
	private String id_empleado;
	private String id_subfalla;
	private String descripcion;
	private int prioridad;
	private String observaciones;
	private String estatus;
	private String fecha_registro;
	private String id_equipo;
	private String id_obra;
	private String nombreequipo;
    private String descripcionequipo;
    private String tipoadquisicion;
    private String numeroserie;
    private String id_tipocategoria;
    private String tipocategoria;
    private String id_categoria;
    private String categoria;
    private String numeroeconomico;
    private String clave_obra;
    private String nombreobra;
    private String descripcionobra;
    private String falla;
    private String subfalla;
    private String fechaInicio;
    private String fechaFin;
    private String estatusProceso;
	
	
	public String getId_tfallas() {
		return id_tfallas;
	}
	public void setId_tfallas(String id_tfallas) {
		this.id_tfallas = id_tfallas;
	}
	public int getTipo_falla() {
		return tipo_falla;
	}
	public void setTipo_falla(int tipo_falla) {
		this.tipo_falla = tipo_falla;
	}
	public String getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getId_subfalla() {
		return id_subfalla;
	}
	public void setId_subfalla(String id_subfalla) {
		this.id_subfalla = id_subfalla;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getId_obra() {
		return id_obra;
	}
	public void setId_obra(String id_obra) {
		this.id_obra = id_obra;
	}

	public String getNombreequipo() {
		return nombreequipo;
	}

	public void setNombreequipo(String nombreequipo) {
		this.nombreequipo = nombreequipo;
	}

	public String getDescripcionequipo() {
		return descripcionequipo;
	}

	public void setDescripcionequipo(String descripcionequipo) {
		this.descripcionequipo = descripcionequipo;
	}

	public String getTipoadquisicion() {
		return tipoadquisicion;
	}

	public void setTipoadquisicion(String tipoadquisicion) {
		this.tipoadquisicion = tipoadquisicion;
	}

	public String getNumeroserie() {
		return numeroserie;
	}

	public void setNumeroserie(String numeroserie) {
		this.numeroserie = numeroserie;
	}

	public String getId_tipocategoria() {
		return id_tipocategoria;
	}

	public void setId_tipocategoria(String id_tipocategoria) {
		this.id_tipocategoria = id_tipocategoria;
	}

	public String getTipocategoria() {
		return tipocategoria;
	}

	public void setTipocategoria(String tipocategoria) {
		this.tipocategoria = tipocategoria;
	}

	public String getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(String id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNumeroeconomico() {
		return numeroeconomico;
	}

	public void setNumeroeconomico(String numeroeconomico) {
		this.numeroeconomico = numeroeconomico;
	}

	public String getClave_obra() {
		return clave_obra;
	}

	public void setClave_obra(String clave_obra) {
		this.clave_obra = clave_obra;
	}

	public String getNombreobra() {
		return nombreobra;
	}

	public void setNombreobra(String nombreobra) {
		this.nombreobra = nombreobra;
	}

	public String getDescripcionobra() {
		return descripcionobra;
	}

	public void setDescripcionobra(String descripcionobra) {
		this.descripcionobra = descripcionobra;
	}

	public String getFalla() {
		return falla;
	}

	public void setFalla(String falla) {
		this.falla = falla;
	}

	public String getSubfalla() {
		return subfalla;
	}

	public void setSubfalla(String subfalla) {
		this.subfalla = subfalla;
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
	public String getEstatusProceso() {
		return estatusProceso;
	}
	public void setEstatusProceso(String estatusProceso) {
		this.estatusProceso = estatusProceso;
	}
	@Override
	public String toString() {
		return "FallaEquipoDTO [id_tfallas=" + id_tfallas + ", tipo_falla=" + tipo_falla + ", id_empleado="
				+ id_empleado + ", id_subfalla=" + id_subfalla + ", descripcion=" + descripcion + ", prioridad="
				+ prioridad + ", observaciones=" + observaciones + ", estatus=" + estatus + ", fecha_registro="
				+ fecha_registro + ", id_equipo=" + id_equipo + ", id_obra=" + id_obra + ", nombreequipo="
				+ nombreequipo + ", descripcionequipo=" + descripcionequipo + ", tipoadquisicion=" + tipoadquisicion
				+ ", numeroserie=" + numeroserie + ", id_tipocategoria=" + id_tipocategoria + ", tipocategoria="
				+ tipocategoria + ", id_categoria=" + id_categoria + ", categoria=" + categoria + ", numeroeconomico="
				+ numeroeconomico + ", clave_obra=" + clave_obra + ", nombreobra=" + nombreobra + ", descripcionobra="
				+ descripcionobra + ", falla=" + falla + ", subfalla=" + subfalla + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", estatusProceso=" + estatusProceso + "]";
	}

}
