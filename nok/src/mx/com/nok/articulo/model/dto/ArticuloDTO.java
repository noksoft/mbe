package mx.com.nok.articulo.model.dto;

import java.io.Serializable;
import java.util.Date;

public class ArticuloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idArticulo; 
	private String descripcion;
	private String idMarca;
	private String marca;	
	private String idSubmarca; 
	private String submarca;
	private String idsubcategoria;
	private String subcategoria;
	private String idcategoria;
	private String categoria;
	private String nParte;
	private double cantidad; 
	private int stockMin;
	private int stockMax; 
	private double costoUnitario;
	private double costoTotal;
	private String ubicacion; 
	private String unidad;
	private Date fechaAdquisicion;
	private boolean estatus;
	private String idTipocategoria;
	private String nombreTipocategoria;
	private String filterEstatusArticulo="";
	
	public ArticuloDTO(){
		
	}
	
	public ArticuloDTO(String idArticulo){
		this.idArticulo = idArticulo;
	}
	
	public String toString(){
		return  "\n[ idArticulo = " + idArticulo + 
		 "\n descripcion = " + descripcion +
		 "\n idMarca = " + idMarca +
		 "\n marca = " + marca +
		 "\n idSubmarca = " + idSubmarca +
		 "\n submarca = " + submarca +
		 "\n nParte = " + nParte +
		 "\n cantidad = " + cantidad +
		 "\n stockMin = " + stockMin +
		 "\n stockMax = " + stockMax +
		 "\n costoUnitario = " + costoUnitario +
		 "\n costoTotal = " + costoTotal +
		 "\n ubicacion = " + ubicacion +
		 "\n unidad = " + unidad +
		 "\n fechaAdquisicion = " + fechaAdquisicion +
		 "\n estatus  = " + estatus +"]";
				
	}
	
	public String getIdsubcategoria() {
		return idsubcategoria;
	}


	public void setIdsubcategoria(String idsubcategoria) {
		this.idsubcategoria = idsubcategoria;
	}


	public String getSubcategoria() {
		return subcategoria;
	}


	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}


	public String getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIdArticulo() {
		return idArticulo;
	}


	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getIdSubmarca() {
		return idSubmarca;
	}


	public void setIdSubmarca(String idSubmarca) {
		this.idSubmarca = idSubmarca;
	}


	public String getnParte() {
		return nParte;
	}


	public void setnParte(String nParte) {
		this.nParte = nParte;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public int getStockMin() {
		return stockMin;
	}


	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}


	public int getStockMax() {
		return stockMax;
	}


	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
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


	public String getIdMarca() {
		return idMarca;
	}


	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
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


	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}


	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}


	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}


	public boolean getEstatus() {
		return estatus;
	}


	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	
	public String getFilterEstatusArticulo() {
		return filterEstatusArticulo;
	}


	
	public void setFilterEstatusArticulo(String filterEstatusArticulo) {
		this.filterEstatusArticulo = filterEstatusArticulo;
	}

	public String getIdTipocategoria() {
		return idTipocategoria;
	}

	public void setIdTipocategoria(String idTipocategoria) {
		this.idTipocategoria = idTipocategoria;
	}

	public String getNombreTipocategoria() {
		return nombreTipocategoria;
	}

	public void setNombreTipocategoria(String nombreTipocategoria) {
		this.nombreTipocategoria = nombreTipocategoria;
	}
	
	
}
