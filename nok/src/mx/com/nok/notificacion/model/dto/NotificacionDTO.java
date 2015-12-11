package mx.com.nok.notificacion.model.dto;

import java.io.Serializable;

public class NotificacionDTO implements Serializable{
	
	
	 private static final long serialVersionUID = 1L;
	 private String idNotificacion; 
	 private String descripcion;
	 private String labelMin;
	 private String idConfig;
	 private String fechaNotificacion ;
	 private int estatusNotificacion;
	 private String idUsuario;
	 
	 
	 
		public String  toString(){
			

			 return  "\n[idNotificacion "+ idNotificacion +
					"\n descripcion " + labelMin +
					"\n labelMin " + labelMin +
					"\n idConfig " + idConfig +
					"\n fechaNotificacion " + fechaNotificacion +
					"\n estatusNotificacion " + estatusNotificacion +
					"\n idUsuario " + idUsuario +
					 "]";
			
		}
	 
	 
	 
	 
	public String getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(String idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLabelMin() {
		return labelMin;
	}
	public void setLabelMin(String labelMin) {
		this.labelMin = labelMin;
	}
	public String getIdConfig() {
		return idConfig;
	}
	public void setIdConfig(String idConfig) {
		this.idConfig = idConfig;
	}
	public String getFechaNotificacion() {
		return fechaNotificacion;
	}
	public void setFechaNotificacion(String fechaNotificacion) {
		this.fechaNotificacion = fechaNotificacion;
	}
	public int getEstatusNotificacion() {
		return estatusNotificacion;
	}
	public void setEstatusNotificacion(int estatusNotificacion) {
		this.estatusNotificacion = estatusNotificacion;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	} 
	
	
	
	
	

}
