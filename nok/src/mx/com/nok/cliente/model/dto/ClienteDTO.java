package mx.com.nok.cliente.model.dto;

import java.io.Serializable;
import java.util.Date;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idCliente;
	private String rfc;
	private String razonSocial;
	private String direccion;
	private String cp;
	private String idMunicipio;
	private String municipio;
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	private String idEntidad;
	private String entidad;
	private String idLocalidad;
	private String localidad;
	private String telefono;
	private String correo;
	private String www;
	private String contactoNombre;
	private Date fechaAlta;
	private Boolean estatus;
	private String filterEstatus;
	
	@Override
	public String toString() {
		return "ClienteDTO [idCliente=" + idCliente + ", rfc=" + rfc
				+ ", razonSocial=" + razonSocial + ", direccion=" + direccion
				+ ", cp=" + cp + ", idMunicipio=" + idMunicipio
				+ ", idEntidad=" + idEntidad + ", idLocalidad=" + idLocalidad
				+ ", telefono=" + telefono + ", correo=" + correo + ", www="
				+ www + ", contactoNombre=" + contactoNombre + ", fechaAlta="
				+ fechaAlta + ", estatus=" + estatus + ", filterEstatus="
				+ filterEstatus + "]";
	}
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getWww() {
		return www;
	}
	public void setWww(String www) {
		this.www = www;
	}
	public String getContactoNombre() {
		return contactoNombre;
	}
	public void setContactoNombre(String contactoNombre) {
		this.contactoNombre = contactoNombre;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	public String getFilterEstatus() {
		return filterEstatus;
	}
	public void setFilterEstatus(String filterEstatus) {
		this.filterEstatus = filterEstatus;
	}
}
