package mx.com.nok.menu.model.service;

import java.util.List;

import mx.com.nok.articulo.model.dto.MarcaDTO;
import mx.com.nok.articulo.model.dto.SubmarcaDTO;
import mx.com.nok.menu.model.dto.MenuDTO;

public interface MenuService {

	
	
	public List<?> catMenu(MenuDTO dto);
	public MenuDTO insertMenu(MenuDTO dto);
	public MenuDTO updateMenu(MenuDTO dto);
	public boolean deleteMenu(MenuDTO dto);
	public MenuDTO updateEstatusMenu(MenuDTO dto);	
	
	

	public List<?> catMenuAopSession(MenuDTO dto);
	public MenuDTO insertMenuAopSession(MenuDTO dto);
	public MenuDTO updateMenuAopSession(MenuDTO dto);
	public boolean deleteMenuAopSession(MenuDTO dto);
	public MenuDTO updateEstatusMenuAopSession(MenuDTO dto);	
	

}
