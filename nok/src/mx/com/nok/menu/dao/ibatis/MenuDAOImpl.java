package mx.com.nok.menu.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


import mx.com.nok.menu.dao.MenuDAO;
import mx.com.nok.menu.model.dto.MenuDTO;


public class MenuDAOImpl extends SqlMapClientDaoSupport implements MenuDAO {

	
	public boolean deleteMenu(MenuDTO dto) throws Exception {
		
		return (Boolean)this.getSqlMapClientTemplate().
			queryForObject("deleteMenu",dto);
	}

	
	public List<?> infoMenu(MenuDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoMenu",dto);
	}

	
	public MenuDTO insertMenu(MenuDTO dto) throws Exception {
		return (MenuDTO)this.getSqlMapClientTemplate().
		queryForObject("insertMenu",dto);
	}

	
	public MenuDTO updateEstatusMenu(MenuDTO dto) throws Exception {
		return (MenuDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEstatusMenu",dto);
	}

	
	public MenuDTO updateMenu(MenuDTO dto) throws Exception {
		 return (MenuDTO)this.getSqlMapClientTemplate().
			queryForObject("updateMenu",dto);
	}


}
