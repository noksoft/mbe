package mx.com.nok.mantenimiento.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.mantenimiento.dao.MantenimientoDAO;

import mx.com.nok.mantenimiento.model.dto.DetalleManttoDTO;
import mx.com.nok.mantenimiento.model.dto.ProgramaManttoDTO;
import mx.com.nok.mantenimiento.model.service.MantenimientoService;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;


public class MantenimientoBusiness implements   Serializable, MantenimientoService {

	
	private  MantenimientoDAO mantenimientoDAO;
	private static final long serialVersionUID = 1L;
	
		
	public List<?> infoDetalleMantenimiento(DetalleManttoDTO dto) {
		List <?> list= new ArrayList<DetalleManttoDTO>();
		try {			
			
			list=mantenimientoDAO.infoDetalleMantenimiento(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}	
	
	public DetalleManttoDTO insertDetalleMantenimiento(DetalleManttoDTO dto) {
		try {
			return mantenimientoDAO.insertDetalleMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}
	
	public DetalleManttoDTO updateDetalleMantenimiento(DetalleManttoDTO dto) {
		try {
			
			return mantenimientoDAO.updateDetalleMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteDetalleMantenimiento(DetalleManttoDTO dto) {
		try {
			return (Boolean)mantenimientoDAO.deleteDetalleMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	public List<?> infoProgramaMantenimiento(ProgramaManttoDTO dto) {
		List <?> list= new ArrayList<ProgramaManttoDTO>();
		try {			
			
			list=mantenimientoDAO.infoProgramaMantenimiento(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public ProgramaManttoDTO insertProgramaMantenimiento(ProgramaManttoDTO dto) {
		try {
			return mantenimientoDAO.insertProgramaMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}
	
	public ProgramaManttoDTO updateProgramaMantenimiento(ProgramaManttoDTO dto) {
		try {
			return mantenimientoDAO.updateProgramaMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteProgramaMantenimiento(ProgramaManttoDTO dto) {
		try {
			return (Boolean)mantenimientoDAO.deleteProgramaMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	public MantenimientoDAO getMantenimientoDAO() {
		return mantenimientoDAO;
	}

	public void setMantenimientoDAO(MantenimientoDAO mantenimientoDAO) {
		this.mantenimientoDAO = mantenimientoDAO;
	}	
	//-----------------------------------------------------------------------
	
	
	
	public List<?> infoDetalleMantenimientoAopSession(DetalleManttoDTO dto) {
		List <?> list= new ArrayList<DetalleManttoDTO>();
		try {			
			
			list=mantenimientoDAO.infoDetalleMantenimiento(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}	
	
	public DetalleManttoDTO insertDetalleMantenimientoAopSession(DetalleManttoDTO dto) {
		try {
			return mantenimientoDAO.insertDetalleMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}
	
	public DetalleManttoDTO updateDetalleMantenimientoAopSession(DetalleManttoDTO dto) {
		try {
			
			return mantenimientoDAO.updateDetalleMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteDetalleMantenimientoAopSession(DetalleManttoDTO dto) {
		try {
			return (Boolean)mantenimientoDAO.deleteDetalleMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	public List<?> infoProgramaMantenimientoAopSession(ProgramaManttoDTO dto) {
		List <?> list= new ArrayList<ProgramaManttoDTO>();
		try {			
			
			list=mantenimientoDAO.infoProgramaMantenimiento(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public ProgramaManttoDTO insertProgramaMantenimientoAopSession(ProgramaManttoDTO dto) {
		try {
			return mantenimientoDAO.insertProgramaMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}
	
	public ProgramaManttoDTO updateProgramaMantenimientoAopSession(ProgramaManttoDTO dto) {
		try {
			return mantenimientoDAO.updateProgramaMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteProgramaMantenimientoAopSession(ProgramaManttoDTO dto) {
		try {
			return (Boolean)mantenimientoDAO.deleteProgramaMantenimiento(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

}
