package mx.com.nok.salida.model.dto;

public class SalidaDTO {
	
	
	 private String folioSalida;
	 private String idArticulo;
	 private String  idPrograma;
	 private String fechaSalida;
	 private Integer cantidad;
	 
	 
		public String  toString(){
			

			 return  "\n[folioSalida "+ folioSalida +
					"\n idArticulo " + idArticulo +
					"\n idPrograma " + idPrograma +
					"\n fechaSalida " + fechaSalida +
					"\n cantidad " + cantidad + "]";
			
		}


		public String getFolioSalida() {
			return folioSalida;
		}


		public void setFolioSalida(String folioSalida) {
			this.folioSalida = folioSalida;
		}


		public String getIdArticulo() {
			return idArticulo;
		}


		public void setIdArticulo(String idArticulo) {
			this.idArticulo = idArticulo;
		}


		public String getIdPrograma() {
			return idPrograma;
		}


		public void setIdPrograma(String idPrograma) {
			this.idPrograma = idPrograma;
		}


		public String getFechaSalida() {
			return fechaSalida;
		}


		public void setFechaSalida(String fechaSalida) {
			this.fechaSalida = fechaSalida;
		}


		public Integer getCantidad() {
			return cantidad;
		}


		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}

}
