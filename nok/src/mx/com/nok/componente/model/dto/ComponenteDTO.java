package mx.com.nok.componente.model.dto;

import java.io.Serializable;

public class ComponenteDTO implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	private String idComponente;
	private String descripcion;
	private String idMenu;
	private String menu;
	private String componente;
	private String nombreSubmenu;
	private String nombreCortoComponente;	
	private boolean estatus;
	private String filterEstatusComponente="";
	
	
	
	
	
	
	
	public String toString(){
		
	return "\n[ idComponente = " + idComponente +
	 "\n descripcion = " + descripcion +
	 "\n idMenu = " + idMenu +
	 "\n menu = " + menu +
	 "\n componente = " + componente +
	 "\n nombreSubmenu = " + nombreSubmenu +
	 "\n nombreCortoComponente = " + nombreCortoComponente +
	 "\n estatus = " + estatus+" ]";
		
	}

	public String getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(String idMenu) {
		this.idMenu = idMenu;
	}

	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	public String getNombreSubmenu() {
		return nombreSubmenu;
	}

	public void setNombreSubmenu(String nombreSubmenu) {
		this.nombreSubmenu = nombreSubmenu;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public String getNombreCortoComponente() {
		return nombreCortoComponente;
	}

	public void setNombreCortoComponente(String nombreCortoComponente) {
		this.nombreCortoComponente = nombreCortoComponente;
	}

	/**
	 * @return the menu
	 */
	public String getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(String menu) {
		this.menu = menu;
	}

	/**
	 * @return the filterEstatusComponente
	 */
	public String getFilterEstatusComponente() {
		return filterEstatusComponente;
	}

	/**
	 * @param filterEstatusComponente the filterEstatusComponente to set
	 */
	public void setFilterEstatusComponente(String filterEstatusComponente) {
		this.filterEstatusComponente = filterEstatusComponente;
	}

	

	
	

}
