package mx.com.nok.proveedor.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import mx.com.nok.proveedor.dao.ProveedorDAO;
import mx.com.nok.proveedor.model.dto.ProveedorDTO;
import mx.com.nok.proveedor.model.service.ProveedorService;

public class ProveedorBusiness implements Serializable,ProveedorService {

	
	
	private ProveedorDAO proveedorDAO;
	private static final long serialVersionUID = 1L;
	
	@Override
	public List<?> catProveedor(ProveedorDTO dto) {
		List <?> list= new ArrayList<ProveedorDTO>();
		try {			
			
			list=proveedorDAO.infoProveedor(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	@Override
	public ProveedorDTO insertProveedor(ProveedorDTO dto) {
		try {
			return proveedorDAO.insertProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public ProveedorDTO updateProveedor(ProveedorDTO dto) {
try {
			
			return proveedorDAO.updateProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteProveedor(ProveedorDTO dto) {
		try {
			return (Boolean)proveedorDAO.deleteProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ProveedorDTO updateEstatusProveedor(ProveedorDTO dto) {
try {
			
			return proveedorDAO.updateEstatusProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public ProveedorDAO getProveedorDAO() {
		return proveedorDAO;
	}

	public void setProveedorDAO(ProveedorDAO proveedorDAO) {
		this.proveedorDAO = proveedorDAO;
	}
	
	//-----------------------------------------------------------
	
	
	@Override
	public List<?> catProveedorAopSession(ProveedorDTO dto) {
		List <?> list= new ArrayList<ProveedorDTO>();
		try {			
			
			list=proveedorDAO.infoProveedor(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	@Override
	public ProveedorDTO insertProveedorAopSession(ProveedorDTO dto) {
		try {
			return proveedorDAO.insertProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public ProveedorDTO updateProveedorAopSession(ProveedorDTO dto) {
try {
			
			return proveedorDAO.updateProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteProveedorAopSession(ProveedorDTO dto) {
		try {
			return (Boolean)proveedorDAO.deleteProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ProveedorDTO updateEstatusProveedorAopSession(ProveedorDTO dto) {
try {
			
			return proveedorDAO.updateEstatusProveedor(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

}
