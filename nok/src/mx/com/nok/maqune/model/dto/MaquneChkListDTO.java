package mx.com.nok.maqune.model.dto;

import java.io.Serializable;

public class MaquneChkListDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String idMaqune;
	private boolean tCirculacion;
	private boolean verificacion;
	private boolean factura;
	private boolean tenencia;
	private boolean tituloPedimentos;
	private boolean permisoTrailer;
	private int cambioAceite ;
	private String combustible;
	private String tipoMedida;
	private String fechaVerificacion ;
	private String fechaTenencia ;
	
	public String  toString (){
		 return  "\n[idMaqune "+ idMaqune +
			"\n tCirculacion " + tCirculacion +
			"\n verificacion " + verificacion +
			"\n factura " + factura +
			"\n tenencia " + tenencia +
			"\n tituloPedimentos " + tituloPedimentos +
			"\n permisoTrailer " + permisoTrailer +
			"\n cambioAceite " + cambioAceite +
			"\n combustible " + combustible +
			"\n tipoMedida " + tipoMedida +
			"\n fechaVerificacion " + fechaVerificacion +
			"\n fechaTenencia " + fechaTenencia + "]";	
		
	}	
	
	
	public String getIdMaqune() {
		return idMaqune;
	}
	public void setIdMaqune(String idMaqune) {
		this.idMaqune = idMaqune;
	}
	public boolean istCirculacion() {
		return tCirculacion;
	}
	public void settCirculacion(boolean tCirculacion) {
		this.tCirculacion = tCirculacion;
	}
	public boolean isVerificacion() {
		return verificacion;
	}
	public void setVerificacion(boolean verificacion) {
		this.verificacion = verificacion;
	}
	public boolean isFactura() {
		return factura;
	}
	public void setFactura(boolean factura) {
		this.factura = factura;
	}
	public boolean isTenencia() {
		return tenencia;
	}
	public void setTenencia(boolean tenencia) {
		this.tenencia = tenencia;
	}
	public boolean isTituloPedimentos() {
		return tituloPedimentos;
	}
	public void setTituloPedimentos(boolean tituloPedimentos) {
		this.tituloPedimentos = tituloPedimentos;
	}
	public boolean isPermisoTrailer() {
		return permisoTrailer;
	}
	public void setPermisoTrailer(boolean permisoTrailer) {
		this.permisoTrailer = permisoTrailer;
	}
	public int getCambioAceite() {
		return cambioAceite;
	}
	public void setCambioAceite(int cambioAceite) {
		this.cambioAceite = cambioAceite;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getTipoMedida() {
		return tipoMedida;
	}
	public void setTipoMedida(String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}
	public String getFechaVerificacion() {
		return fechaVerificacion;
	}
	public void setFechaVerificacion(String fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}
	public String getFechaTenencia() {
		return fechaTenencia;
	}
	public void setFechaTenencia(String fechaTenencia) {
		this.fechaTenencia = fechaTenencia;
	}

}
