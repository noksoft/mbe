package mx.com.nok.menu.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.menu.dao.MenuDAO;
import mx.com.nok.menu.model.dto.MenuDTO;

import mx.com.nok.menu.model.service.MenuService;

public class MenuBusiness implements Serializable, MenuService {
	
	
	
	private MenuDAO menuDAO;
	private static final long serialVersionUID = 1L;

	
	public List<?> catMenu(MenuDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=menuDAO.infoMenu(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public boolean deleteMenu(MenuDTO dto) {
		try {
			return (Boolean)menuDAO.deleteMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public MenuDTO insertMenu(MenuDTO dto) {
		try {
			return (MenuDTO)menuDAO.insertMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public MenuDTO updateEstatusMenu(MenuDTO dto) {
	try {
			
			return menuDAO.updateEstatusMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public MenuDTO updateMenu(MenuDTO dto) {
		try {
			
			return menuDAO.updateMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public MenuDAO getMenuDAO() {
		return menuDAO;
	}

	public void setMenuDAO(MenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

	//----------------------------------------------------------------
	
	
	public List<?> catMenuAopSession(MenuDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=menuDAO.infoMenu(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public boolean deleteMenuAopSession(MenuDTO dto) {
		try {
			return (Boolean)menuDAO.deleteMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public MenuDTO insertMenuAopSession(MenuDTO dto) {
		try {
			return (MenuDTO)menuDAO.insertMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public MenuDTO updateEstatusMenuAopSession(MenuDTO dto) {
	try {
			
			return menuDAO.updateEstatusMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public MenuDTO updateMenuAopSession(MenuDTO dto) {
		try {
			
			return menuDAO.updateMenu(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

}
