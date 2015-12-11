package mx.com.nok.menu.dao;

import java.util.List;

import mx.com.nok.menu.model.dto.MenuDTO;




public interface MenuDAO {
	
	public List<?> infoMenu(MenuDTO dto) throws Exception;
	public MenuDTO insertMenu(MenuDTO dto) throws Exception;
	public MenuDTO updateMenu(MenuDTO dto)throws Exception;
	public boolean deleteMenu(MenuDTO dto) throws Exception;
	public MenuDTO updateEstatusMenu(MenuDTO dto)throws Exception;
	 
		

}
