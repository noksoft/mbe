package mx.com.nok.empleado.model.dto;

import java.io.Serializable;
import java.util.Date;

public class EmpleadoDTO implements Serializable{	
	
	
	
	private static final long serialVersionUID = 1L;
	private String idEmpleado;
	private String rfcEmpleado;
	private String nombre; 
	private String paterno;
	private String materno;
	private String telefono;
	private String celular;
	private String idLocalidad;
	private String localidad;
	private String idMunicipio;
	private String municipio;
	private String idEntidad;
	private String entidad;
	private String cp;
	private String numInterior;
	private String numExterior;
	private String idTipoEmpleado;
	private String tipoEmpleado;
	private Date fechaAlta;
	private String domicilio;
	private String colonia;
	private boolean estatus;	
	private String filterEstatusEmpleado="";
	private boolean esusuario;
	 


	public boolean isEsusuario() {
		return esusuario;
	}


	public void setEsusuario(boolean esusuario) {
		this.esusuario = esusuario;
	}


	private String password;
	 private String idPerfil;


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getIdPerfil() {
		return idPerfil;
	}


	public void setIdPerfil(String idPerfil) {
		this.idPerfil = idPerfil;
	}


	public String toString(){
		 return 	"[\n" +" idEmpleado " + idEmpleado +
		 "\n rfcEmpleado = " + rfcEmpleado +
		 "\n nombre = " + nombre +
		 "\n paterno = " + paterno +
		 "\n materno = " + materno +
		 "\n telefono = " + telefono +
		 "\n celular = " + celular +
		 "\n idLocalidad = " + idLocalidad +
		 "\n localidad = " + localidad +
		 "\n idMunicipio = " + idMunicipio +
		 "\n nunicipio = " + municipio +
		 "\n idEntidad = "+  idEntidad +
		 "\n entidad = "+  entidad +
		 "\n cp = " + cp +
		 "\n numInterior = " + numInterior +
		 "\n numExterior = " + numExterior +
		 "\n idTipoEmpleado = " + idTipoEmpleado +
		 "\n tipoEmpleado = " + tipoEmpleado +
		 "\n domicilio = " + domicilio +
		 "\n colonia = " + colonia +
		 "\n estatus = " + estatus + "]";		 
	 }


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public String getRfcEmpleado() {
		return rfcEmpleado;
	}


	public void setRfcEmpleado(String rfcEmpleado) {
		this.rfcEmpleado = rfcEmpleado;
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


	public String getIdLocalidad() {
		return idLocalidad;
	}


	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
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


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}


	public String getNumInterior() {
		return numInterior;
	}


	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}


	public String getNumExterior() {
		return numExterior;
	}


	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}


	public String getIdTipoEmpleado() {
		return idTipoEmpleado;
	}


	public void setIdTipoEmpleado(String idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getColonia() {
		return colonia;
	}


	public void setColonia(String colonia) {
		this.colonia = colonia;
	}


	public boolean getEstatus() {
		return estatus;
	}


	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


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


	public String getTipoEmpleado() {
		return tipoEmpleado;
	}


	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}


	public String getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getFilterEstatusEmpleado() {
		return filterEstatusEmpleado;
	}


	public void setFilterEstatusEmpleado(String filterEstatusEmpleado) {
		this.filterEstatusEmpleado = filterEstatusEmpleado;
	}



}
