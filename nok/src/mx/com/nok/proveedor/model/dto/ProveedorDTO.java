package mx.com.nok.proveedor.model.dto;

import java.io.Serializable;

public class ProveedorDTO implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	private String idProveedor;
	private String rfcProveedor;
	private String razonSocial;
	private String nombreContacto;
	private String telefonoEmpresa;
	private String celularEmpleado;
	private String www;
	private String correo;
	private String idLocalidad;
	private String localidad;
	private String idMunicipio;
	private String municipio;
	private String idEntidad;
	private String entidad;
	private String nombreComercial;
	private boolean estatus;
	private String filterEstatusProveedor="";
	
	public String toString(){
		
		return "[" +
		"\n idProveedor = " + idProveedor +
		"\n rfcProveedor  = " + rfcProveedor +
		"\n razonSocial  = " + razonSocial +
		"\n nombreContacto  = " + nombreContacto +
		"\n telefonoEmpresa  = " + telefonoEmpresa +
		"\n celularEmpleado  = " + celularEmpleado +
		"\n www  = " + www +
		"\n correo  = " + correo +
		"\n idLocalidad  = " + idLocalidad +
		"\n localidad  = " + localidad +
		"\n idMunicipio  = " + idMunicipio +
		"\n municipio  = " + municipio +
		"\n idEntidad  = " + idEntidad +
		"\n entidad  = " + entidad +
		"\n nombreComercial  = " + nombreComercial +
		"\n estatus  = " + estatus + "]";
		
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getRfcProveedor() {
		return rfcProveedor;
	}

	public void setRfcProveedor(String rfcProveedor) {
		this.rfcProveedor = rfcProveedor;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}

	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}

	public String getCelularEmpleado() {
		return celularEmpleado;
	}

	public void setCelularEmpleado(String celularEmpleado) {
		this.celularEmpleado = celularEmpleado;
	}

	public String getwww() {
		return www;
	}

	public void setwww(String www) {
		this.www = www;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public String getFilterEstatusProveedor() {
		return filterEstatusProveedor;
	}

	public void setFilterEstatusProveedor(String filterEstatusProveedor) {
		this.filterEstatusProveedor = filterEstatusProveedor;
	}
	
    
  
}
