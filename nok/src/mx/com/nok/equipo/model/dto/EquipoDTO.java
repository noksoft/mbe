package mx.com.nok.equipo.model.dto;

import java.io.Serializable;
import java.util.Arrays;

public class EquipoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id_equipo;
	private String nombre;
	private String id_submarca;
	private String submarca;
	private String descripcion;
	private String numeroserie;
	private String tipoadquisicion;
	private String fotoequipo;
	private String fechaadquisicion;
	private String id_marcamotor;
	private String marcamotor;
	private String modelomotor;
	
	//private String modelomotor;
	private String id_marca;
	private String marca;
	private String id_subcategoria;
	private String subcategoria;
	private String id_categoria;
	private String categoria;
	private String id_tipocategoria;
	private String tipocategoria;
	private String numeroeconomico;
	private String factura;
	private String pedimiento;
	private String cambioaceite;
	private String tipomedida;
	private String verificacion;
	private String fechaverificacion;
	private String llanta;
	private String hp;
	private String torque;
	private String peso;
	private String dimensioneslargo;
	private String dimensionesancho;
	private String dimensionesalto;
	private String anioequipo;
	private String capacidad;
	private String numeromotor;
	private String numerochasis;
	private String numerocabina;
	private String kw;
	private String voltaje;
	private String amperes;
	private String capacidadpresion;
	private String pica;
	private String golpesminuto;
	private String anioadquisicion;
	private String filterEstatusEquipo;
	
	private Boolean estatus;
	
	public String getModelomotor() {
		return modelomotor;
	}
	public void setModelomotor(String modelomotor) {
		this.modelomotor = modelomotor;
	}
	
	public String getFilterEstatusEquipo() {
		return filterEstatusEquipo;
	}
	public void setFilterEstatusEquipo(String filterEstatusEquipo) {
		this.filterEstatusEquipo = filterEstatusEquipo;
	}
	
	//Propiedades de la imagen de la foto
	private byte[] contentFoto;
	
	public byte[] getContentFoto() {
		return contentFoto;
	}
	public void setContentFoto(byte[] contentFoto) {
		this.contentFoto = contentFoto;
	}
	public String getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId_submarca() {
		return id_submarca;
	}
	public void setId_submarca(String id_submarca) {
		this.id_submarca = id_submarca;
	}
	public String getSubmarca() {
		return submarca;
	}
	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNumeroserie() {
		return numeroserie;
	}
	public void setNumeroserie(String numeroserie) {
		this.numeroserie = numeroserie;
	}
	public String getTipoadquisicion() {
		return tipoadquisicion;
	}
	public void setTipoadquisicion(String tipoadquisicion) {
		this.tipoadquisicion = tipoadquisicion;
	}
	public String getFotoequipo() {
		return fotoequipo;
	}
	public void setFotoequipo(String fotoequipo) {
		this.fotoequipo = fotoequipo;
	}
	public String getFechaadquisicion() {
		return fechaadquisicion;
	}
	public void setFechaadquisicion(String fechaadquisicion) {
		this.fechaadquisicion = fechaadquisicion;
	}
	public String getId_marcamotor() {
		return id_marcamotor;
	}
	public void setId_marcamotor(String id_marcamotor) {
		this.id_marcamotor = id_marcamotor;
	}
	public String getMarcamotor() {
		return marcamotor;
	}
	public void setMarcamotor(String marcamotor) {
		this.marcamotor = marcamotor;
	}
	public String getId_marca() {
		return id_marca;
	}
	public void setId_marca(String id_marca) {
		this.id_marca = id_marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getId_subcategoria() {
		return id_subcategoria;
	}
	public void setId_subcategoria(String id_subcategoria) {
		this.id_subcategoria = id_subcategoria;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
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
	public String getNumeroeconomico() {
		return numeroeconomico;
	}
	public void setNumeroeconomico(String numeroeconomico) {
		this.numeroeconomico = numeroeconomico;
	}
	public String getFactura() {
		return factura;
	}
	public void setFactura(String factura) {
		this.factura = factura;
	}
	public String getPedimiento() {
		return pedimiento;
	}
	public void setPedimiento(String pedimiento) {
		this.pedimiento = pedimiento;
	}
	public String getCambioaceite() {
		return cambioaceite;
	}
	public void setCambioaceite(String cambioaceite) {
		this.cambioaceite = cambioaceite;
	}
	public String getTipomedida() {
		return tipomedida;
	}
	public void setTipomedida(String tipomedida) {
		this.tipomedida = tipomedida;
	}
	public String getVerificacion() {
		return verificacion;
	}
	public void setVerificacion(String verificacion) {
		this.verificacion = verificacion;
	}
	public String getFechaverificacion() {
		return fechaverificacion;
	}
	public void setFechaverificacion(String fechaverificacion) {
		this.fechaverificacion = fechaverificacion;
	}
	public String getLlanta() {
		return llanta;
	}
	public void setLlanta(String llanta) {
		this.llanta = llanta;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTorque() {
		return torque;
	}
	public void setTorque(String torque) {
		this.torque = torque;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getDimensioneslargo() {
		return dimensioneslargo;
	}
	public void setDimensioneslargo(String dimensioneslargo) {
		this.dimensioneslargo = dimensioneslargo;
	}
	public String getDimensionesancho() {
		return dimensionesancho;
	}
	public void setDimensionesancho(String dimensionesancho) {
		this.dimensionesancho = dimensionesancho;
	}
	public String getDimensionesalto() {
		return dimensionesalto;
	}
	public void setDimensionesalto(String dimensionesalto) {
		this.dimensionesalto = dimensionesalto;
	}
	public String getAnioequipo() {
		return anioequipo;
	}
	public void setAnioequipo(String anioequipo) {
		this.anioequipo = anioequipo;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getNumerochasis() {
		return numerochasis;
	}
	public void setNumerochasis(String numerochasis) {
		this.numerochasis = numerochasis;
	}
	public String getNumerocabina() {
		return numerocabina;
	}
	public void setNumerocabina(String numerocabina) {
		this.numerocabina = numerocabina;
	}
	public String getKw() {
		return kw;
	}
	public void setKw(String kw) {
		this.kw = kw;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}
	public String getAmperes() {
		return amperes;
	}
	public void setAmperes(String amperes) {
		this.amperes = amperes;
	}
	public String getCapacidadpresion() {
		return capacidadpresion;
	}
	public void setCapacidadpresion(String capacidadpresion) {
		this.capacidadpresion = capacidadpresion;
	}
	public String getPica() {
		return pica;
	}
	public void setPica(String pica) {
		this.pica = pica;
	}
	public String getGolpesminuto() {
		return golpesminuto;
	}
	public void setGolpesminuto(String golpesminuto) {
		this.golpesminuto = golpesminuto;
	}
	public String getAnioadquisicion() {
		return anioadquisicion;
	}
	public void setAnioadquisicion(String anioadquisicion) {
		this.anioadquisicion = anioadquisicion;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "EquipoDTO [id_equipo=" + id_equipo + ", nombre=" + nombre
				+ ", id_submarca=" + id_submarca + ", submarca=" + submarca
				+ ", descripcion=" + descripcion + ", numeroserie="
				+ numeroserie + ", tipoadquisicion=" + tipoadquisicion
				+ ", fotoequipo=" + fotoequipo + ", fechaadquisicion="
				+ fechaadquisicion + ", id_marcamotor=" + id_marcamotor
				+ ", marcamotor=" + marcamotor
				+ ", id_marca=" + id_marca + ", marca=" + marca
				+ ", id_subcategoria=" + id_subcategoria + ", subcategoria="
				+ subcategoria + ", id_categoria=" + id_categoria
				+ ", categoria=" + categoria + ", id_tipocategoria="
				+ id_tipocategoria + ", tipocategoria=" + tipocategoria
				+ ", numeroeconomico=" + numeroeconomico + ", factura="
				+ factura + ", pedimiento=" + pedimiento + ", cambioaceite="
				+ cambioaceite + ", tipomedida=" + tipomedida
				+ ", verificacion=" + verificacion + ", fechaverificacion="
				+ fechaverificacion + ", llanta=" + llanta + ", hp=" + hp
				+ ", torque=" + torque + ", peso=" + peso
				+ ", dimensioneslargo=" + dimensioneslargo
				+ ", dimensionesancho=" + dimensionesancho
				+ ", dimensionesalto=" + dimensionesalto + ", anioequipo="
				+ anioequipo + ", capacidad=" + capacidad + ", numeromotor="
				+ numeromotor + ", numerochasis=" + numerochasis
				+ ", numerocabina=" + numerocabina + ", kw=" + kw
				+ ", voltaje=" + voltaje + ", amperes=" + amperes
				+ ", capacidadpresion=" + capacidadpresion + ", pica=" + pica
				+ ", golpesminuto=" + golpesminuto + ", anioadquisicion="
				+ anioadquisicion + ", estatus=" + estatus + ", contentFoto="
				+ Arrays.toString(contentFoto) + "]";
	}
}
