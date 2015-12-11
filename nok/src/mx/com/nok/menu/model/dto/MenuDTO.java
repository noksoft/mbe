package mx.com.nok.menu.model.dto;

import java.io.Serializable;

public class MenuDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String idMenu;
	private String menu;
	private String nombreCortoMenu;
	private boolean estatus;
	private String filterEstatusMenu="";
	
	
	public String toString(){
		
		return  "\n[idMenu "+ idMenu +
		"\n menu " + menu +
		"\n nombreCortoMenu " + nombreCortoMenu +
		"\n estatus "+ estatus + "]";		
	}
	
	public String getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(String idMenu) {
		this.idMenu = idMenu;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getNombreCortoMenu() {
		return nombreCortoMenu;
	}
	public void setNombreCortoMenu(String nombreCortoMenu) {
		this.nombreCortoMenu = nombreCortoMenu;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	public String getFilterEstatusMenu() {
		return filterEstatusMenu;
	}
	public void setFilterEstatusMenu(String filterEstatusMenu) {
		this.filterEstatusMenu = filterEstatusMenu;
	}

}
