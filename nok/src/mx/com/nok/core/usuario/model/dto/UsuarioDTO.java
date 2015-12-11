package mx.com.nok.core.usuario.model.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8172860992240444589L;
	private Boolean status;
	private String  idPerfil;	
	private String 	perfil;		
	private String 	usuario;
	private String  rfcUsuario;//rfcEmpleado
	private String 	ip;
	private String 	pass;
	private String  nombre;	
	
	private String idUsuario;
	private String idEmpleado;
	private String materno;
	private String paterno;
	private String fechaAlta;
	
	
	private String filterEstatusUsuario="";
	
	
	private String errorLogin;
	
	
	public UsuarioDTO datosBasicos (){
		
		
		
		 this.status = null;
		 this.idPerfil = null;	
		/// this.perfil = null;		
		 this.usuario = null;
		 //this.rfcUsuario = null;
		 //this.ip = null;
		 this.pass = null;
		 //this.nombre = null;	
		
		 this.idUsuario = null;
		 this.idEmpleado = null;
		 this.materno = null;
		 this.paterno = null;
		 this.fechaAlta = null;
		 return this;
	}
	
	
		
	public String toString()	{			
			 return "\n [usuario = " + usuario +			 
			 "\n fecha_alta = " + fechaAlta +
			 "\n status = " + status +
			 "\n idPerfil = " + idPerfil +
			 "\n rfcUsuario = " + rfcUsuario +
			 "\n perfil = " + perfil +
			 "\n idUsuario = " + idUsuario +
			 "\n idEmpleado = " + idEmpleado +
			 "\n nombre = " + nombre +			
			 "\n paterno = " + paterno +
			 "\n materno = " + materno +"]";	 
	}
	

		public Boolean getStatus() {
			return status;
		}


		public void setStatus(Boolean status) {
			this.status = status;
		}


		public String getIdPerfil() {
			return idPerfil;
		}


		public void setIdPerfil(String idPerfil) {
			this.idPerfil = idPerfil;
		}


		public String getPerfil() {
			return perfil;
		}


		public void setPerfil(String perfil) {
			this.perfil = perfil;
		}
		public String getUsuario() {
			return usuario;
		}


		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}


		public String getIp() {
			return ip;
		}


		public void setIp(String ip) {
			this.ip = ip;
		}


		public String getPass() {
			return pass;
		}


		public void setPass(String pass) {
			this.pass = pass;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getRfcUsuario() {
			return rfcUsuario;
		}


		public void setRfcUsuario(String rfcUsuario) {
			this.rfcUsuario = rfcUsuario;
		}


		public String getIdUsuario() {
			return idUsuario;
		}


		public void setIdUsuario(String idUsuario) {
			this.idUsuario = idUsuario;
		}


		public String getIdEmpleado() {
			return idEmpleado;
		}


		public void setIdEmpleado(String idEmpleado) {
			this.idEmpleado = idEmpleado;
		}


		public String getMaterno() {
			return materno;
		}


		public void setMaterno(String materno) {
			this.materno = materno;
		}


		public String getPaterno() {
			return paterno;
		}


		public void setPaterno(String paterno) {
			this.paterno = paterno;
		}


		public String getFechaAlta() {
			return fechaAlta;
		}


		public void setFechaAlta(String fechaAlta) {
			this.fechaAlta = fechaAlta;
		}


		


		public String getFilterEstatusUsuario() {
			return filterEstatusUsuario;
		}


		public void setFilterEstatusUsuario(String filterEstatusUsuario) {
			this.filterEstatusUsuario = filterEstatusUsuario;
		}



		public String getErrorLogin() {
			return errorLogin;
		}



		public void setErrorLogin(String errorLogin) {
			this.errorLogin = errorLogin;
		}
}
