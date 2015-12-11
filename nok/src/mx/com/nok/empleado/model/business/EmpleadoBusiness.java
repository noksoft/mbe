package mx.com.nok.empleado.model.business;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import mx.com.nok.core.usuario.dao.PerfilDAO;
import mx.com.nok.core.usuario.dao.UsuarioDAO;
import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.empleado.dao.EmpleadoDAO;
import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.empleado.model.dto.HabilidadDTO;
import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.empleado.model.service.EmpleadoService;
import mx.com.nok.menu.model.dto.MenuDTO;

public class EmpleadoBusiness implements Serializable, EmpleadoService{


	private static final long serialVersionUID = 1L;
	private EmpleadoDAO empleadoDAO;
	private UsuarioDAO usuarioDAO;
	private PerfilDAO perfilDAO;


	@Override
	public List<?> infoEmpleado(EmpleadoDTO dto) {
		List <?> list= new ArrayList<EmpleadoDTO>();
		try {			

			list=empleadoDAO.infoEmpleado(dto);	
		
		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	@Override
	public EmpleadoDTO insertEmpleado(EmpleadoDTO dto) {
		try {
			return (EmpleadoDTO)empleadoDAO.insertEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public EmpleadoDTO updateEmpleado(EmpleadoDTO dto) {
		try {

			return empleadoDAO.updateEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteEmpleado(EmpleadoDTO dto) {
		try {
			return (Boolean)empleadoDAO.deleteEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EmpleadoDTO updateEstatusEmpleado(EmpleadoDTO dto) {
		try {

			return empleadoDAO.updateEstatusEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public List<?> infoUsuario(UsuarioDTO dto) {
		List <?> list= new ArrayList<UsuarioDTO>();
		try {			

			list=usuarioDAO.infoUsuario(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	@Override
	public UsuarioDTO insertUsuario(UsuarioDTO dto) {
		try {
			return usuarioDAO.insertUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public UsuarioDTO updateUsuario(UsuarioDTO dto) {
		try {

			return usuarioDAO.updateUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteUsuario(UsuarioDTO dto) {
		try {
			return (Boolean)usuarioDAO.deleteUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UsuarioDTO updateEstatusUsuario(UsuarioDTO dto) {
		try {

			return usuarioDAO.updateEstatusUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}




	@Override
	public List<?> catPerfil(PerfilDTO dto) {
		List <?> list= new ArrayList<PerfilDTO>();
		try {			

			list=perfilDAO.infoPerfil(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	@Override
	public PerfilDTO insertPerfil(PerfilDTO dto) {
		try {
			return perfilDAO.insertPerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public PerfilDTO updatePerfil(PerfilDTO dto) {
		try {

			return perfilDAO.updatePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deletePerfil(PerfilDTO dto) {
		try {
			return (Boolean)perfilDAO.deletePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public PerfilDTO updateEstatusPerfil(PerfilDTO dto) {
		try {

			return perfilDAO.updateEstatusPerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}



	public List<?> catTipoEmpleado(TipoEmpleadoDTO dto) {
		List <?> list= new ArrayList<TipoEmpleadoDTO>();
		try {			

			list=empleadoDAO.infoTipoEmpleado(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}


	public boolean deleteTipoEmpleado(TipoEmpleadoDTO dto) {
		try {
			return (Boolean)empleadoDAO.deleteTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO dto) {
		try {
			return (TipoEmpleadoDTO)empleadoDAO.insertTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	public TipoEmpleadoDTO updateEstatusTipoEmpleado(TipoEmpleadoDTO dto) {
		try {

			return empleadoDAO.updateEstatusTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO dto) {
		try {

			return empleadoDAO.updateTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}




	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}

	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public PerfilDAO getPerfilDAO() {
		return perfilDAO;
	}

	public void setPerfilDAO(PerfilDAO perfilDAO) {
		this.perfilDAO = perfilDAO;
	}


	//--------------------------------------------------------------------


	@Override
	public List<?> infoEmpleadoAopSession(EmpleadoDTO dto) {
		List <?> list= new ArrayList<EmpleadoDTO>();
		try {			

			list=empleadoDAO.infoEmpleado(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	@Override
	public EmpleadoDTO insertEmpleadoAopSession(EmpleadoDTO dto) {
		try {
			return (EmpleadoDTO)empleadoDAO.insertEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public EmpleadoDTO updateEmpleadoAopSession(EmpleadoDTO dto) {
		try {

			return empleadoDAO.updateEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteEmpleadoAopSession(EmpleadoDTO dto) {
		try {
			return (Boolean)empleadoDAO.deleteEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EmpleadoDTO updateEstatusEmpleadoAopSession(EmpleadoDTO dto) {
		try {

			return empleadoDAO.updateEstatusEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public List<?> infoUsuarioAopSession(UsuarioDTO dto) {
		List <?> list= new ArrayList<UsuarioDTO>();
		try {			

			list=usuarioDAO.infoUsuario(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	@Override
	public UsuarioDTO insertUsuarioAopSession(UsuarioDTO dto) {
		try {
			return usuarioDAO.insertUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public UsuarioDTO updateUsuarioAopSession(UsuarioDTO dto) {
		try {

			return usuarioDAO.updateUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteUsuarioAopSession(UsuarioDTO dto) {
		try {
			return (Boolean)usuarioDAO.deleteUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UsuarioDTO updateEstatusUsuarioAopSession(UsuarioDTO dto) {
		try {

			return usuarioDAO.updateEstatusUsuario(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}




	@Override
	public List<?> catPerfilAopSession(PerfilDTO dto) {
		List <?> list= new ArrayList<PerfilDTO>();
		try {			

			list=perfilDAO.infoPerfil(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	@Override
	public PerfilDTO insertPerfilAopSession(PerfilDTO dto) {
		try {
			return perfilDAO.insertPerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	@Override
	public PerfilDTO updatePerfilAopSession(PerfilDTO dto) {
		try {

			return perfilDAO.updatePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deletePerfilAopSession(PerfilDTO dto) {
		try {
			return (Boolean)perfilDAO.deletePerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public PerfilDTO updateEstatusPerfilAopSession(PerfilDTO dto) {
		try {

			return perfilDAO.updateEstatusPerfil(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}



	public List<?> catTipoEmpleadoAopSession(TipoEmpleadoDTO dto) {
		List <?> list= new ArrayList<TipoEmpleadoDTO>();
		try {			

			list=empleadoDAO.infoTipoEmpleado(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}


	public boolean deleteTipoEmpleadoAopSession(TipoEmpleadoDTO dto) {
		try {
			return (Boolean)empleadoDAO.deleteTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	public TipoEmpleadoDTO insertTipoEmpleadoAopSession(TipoEmpleadoDTO dto) {
		try {
			return (TipoEmpleadoDTO)empleadoDAO.insertTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}


	public TipoEmpleadoDTO updateEstatusTipoEmpleadoAopSession(TipoEmpleadoDTO dto) {
		try {

			return empleadoDAO.updateEstatusTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public TipoEmpleadoDTO updateTipoEmpleadoAopSession(TipoEmpleadoDTO dto) {
		try {

			return empleadoDAO.updateTipoEmpleado(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public List<?> catHabilidadAopSession(HabilidadDTO dto) {
		List <?> list= new ArrayList<HabilidadDTO>();
		try {			

			list=empleadoDAO.infoHabilidad(dto);	


		} catch (Exception e) {			
			e.printStackTrace();
			list=null;
		}

		return list;
	}

	public HabilidadDTO insertHabilidadAopSession(HabilidadDTO dto) {
		try {
			return (HabilidadDTO)empleadoDAO.insertHabilidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	public HabilidadDTO updateHabilidadAopSession(HabilidadDTO dto) {
		try {
			return (HabilidadDTO)empleadoDAO.updateHabilidad(dto);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteHabilidadAopSession(HabilidadDTO dto) {
		try {
			return (Boolean)empleadoDAO.deleteHabilidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	public HabilidadDTO updateEstatusHabilidadAopSession(HabilidadDTO dto){
		try {

			return empleadoDAO.updateEstatusHabilidad(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

}
