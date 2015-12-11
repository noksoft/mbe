package mx.com.nok.resguardo.model.dto;

public class ResguardoDTO {
	
	private String idResguardo;
	private String idEmpleado;
	private String materno;
	private String paterno;
	private String idArticulo;
	private String descripcion;
	private String fechaAsignacion;
	private String comentario;
	private String razonDevolucion;
	private String fechaDevolucion;		
	
	@Override
	public String toString() {
		return "Resguardo [comentario=" + comentario + ", descripcion="
				+ descripcion + ", fechaAsignacion=" + fechaAsignacion
				+ ", fechaDevolucion=" + fechaDevolucion + ", idEmpleado="
				+ idEmpleado + ", idResguardo=" + idResguardo
				+ ", idArticulo=" + idArticulo + ", materno=" + materno
				+ ", paterno=" + paterno + ", razonDevolucion="
				+ razonDevolucion + "]";
	}
	public String getIdResguardo() {
		return idResguardo;
	}
	public void setIdResguardo(String idResguardo) {
		this.idResguardo = idResguardo;
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
	public String getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignacion(String fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getRazonDevolucion() {
		return razonDevolucion;
	}
	public void setRazonDevolucion(String razonDevolucion) {
		this.razonDevolucion = razonDevolucion;
	}
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	

	

}
