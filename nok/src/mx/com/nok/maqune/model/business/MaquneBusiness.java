package mx.com.nok.maqune.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import mx.com.nok.maqune.dao.MaquneDAO;
import mx.com.nok.maqune.model.dto.MaquneChkListDTO;
import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.dto.MaquneEmpleadoDTO;
import mx.com.nok.maqune.model.dto.MaquneRentaDTO;
import mx.com.nok.maqune.model.service.MaquneService;
import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.utils.FileUtils;

public class MaquneBusiness implements  Serializable, MaquneService{

	
	
	
	private MaquneDAO maquneDAO;
	private static final long serialVersionUID = 1L;
		
	public  List<?> infoMaquneAopSession(MaquneDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=maquneDAO.infoMaqune(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	private void cargarImagenes (MaquneDTO dto){
		
		if(dto.getNameFoto().length() > 0){
			FileUtils.uploadFile(dto.getNameFoto(), dto.getContentFoto(), 1);
		}
		if(dto.getNameFactura().length() > 0){
			FileUtils.uploadFile(dto.getNameFactura(), dto.getContentFactura(), 2);
		}
		if(dto.getNamePedimento().length() > 0){
			FileUtils.uploadFile(dto.getNamePedimento(), dto.getContentPedimento(), 3);
		}
		
	}
	
	public List<?> insertMaquneAopSession(MaquneDTO dto) {
		List <?> list = new ArrayList<>();
		try {
			
			cargarImagenes(dto);			
			
			list = maquneDAO.insertMaqune(dto);			
		} catch (Exception e) {			
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	
	public MaquneDTO updateMaquneAopSession(MaquneDTO dto) {
		try {
			
			return maquneDAO.updateMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteMaquneAopSession(MaquneDTO dto) {
		try {
			return (Boolean)maquneDAO.deleteMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	public  List<?> infoMaquneRentaAopSession(MaquneRentaDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=maquneDAO.infoMaquneRenta(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	
	public MaquneRentaDTO insertMaquneRentaAopSession(MaquneRentaDTO dto) {
		try {
			return maquneDAO.insertMaquneRenta(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	
	public MaquneRentaDTO updateMaquneRentaAopSession(MaquneRentaDTO dto) {
		try {
			
			return maquneDAO.updateMaquneRenta(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteMaquneRentaAopSession(MaquneRentaDTO dto) {
		try {
			return (Boolean)maquneDAO.deleteMaquneRenta(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	public  List<?> infoMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=maquneDAO.infoMaquneEmpleado(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	
	public MaquneEmpleadoDTO insertMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto) {
		try {
			return maquneDAO.insertMaquneEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	
	public MaquneEmpleadoDTO updateMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto) {
		try {
			
			return maquneDAO.updateMaquneEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteMaquneEmpleadoAopSession(MaquneEmpleadoDTO dto) {
		try {
			return (Boolean)maquneDAO.deleteMaquneEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public  List<?> infoMaquneChkListAopSession(MaquneChkListDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list=maquneDAO.infoMaquneChkList(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	
	public MaquneChkListDTO insertMaquneChkListAopSession(MaquneChkListDTO dto) {
		try {
			return maquneDAO.insertMaquneChkList(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	
	public MaquneChkListDTO updateMaquneChkListAopSession(MaquneChkListDTO dto) {
		try {
			
			return maquneDAO.updateMaquneChkList(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteMaquneChkListAopSession(MaquneChkListDTO dto) {
		try {
			return (Boolean)maquneDAO.deleteMaquneChkList(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public MaquneDTO updateEstatusMaquneAopSession(MaquneDTO dto) {
		try {			
			return maquneDAO.updateEstatusMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}	
	
	
	public MaquneDAO getMaquneDAO() {
		return maquneDAO;
	}


	public void setMaquneDAO(MaquneDAO maquneDAO) {
		this.maquneDAO = maquneDAO;
	}

}
