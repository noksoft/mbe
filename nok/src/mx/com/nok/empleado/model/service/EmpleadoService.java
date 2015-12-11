package mx.com.nok.empleado.model.service;

import java.util.List;


import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.empleado.model.dto.HabilidadDTO;
import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.menu.model.dto.MenuDTO;

public interface EmpleadoService {
	

	
	public List<?> infoEmpleado(EmpleadoDTO dto);
	public EmpleadoDTO insertEmpleado(EmpleadoDTO dto);
	public EmpleadoDTO updateEmpleado(EmpleadoDTO dto);
	public boolean deleteEmpleado(EmpleadoDTO dto);
	public EmpleadoDTO updateEstatusEmpleado(EmpleadoDTO dto);	
	
	public List<?> infoUsuario(UsuarioDTO dto);
	public UsuarioDTO insertUsuario(UsuarioDTO dto);
	public UsuarioDTO updateUsuario(UsuarioDTO dto);
	public boolean deleteUsuario(UsuarioDTO dto);
	public UsuarioDTO updateEstatusUsuario(UsuarioDTO dto);
	
	
	public List<?> catPerfil(PerfilDTO dto);
	public PerfilDTO insertPerfil(PerfilDTO dto);
	public PerfilDTO updatePerfil(PerfilDTO dto);
	public boolean deletePerfil(PerfilDTO dto);
	public PerfilDTO updateEstatusPerfil(PerfilDTO dto);	
	
	
	public List<?> catTipoEmpleado(TipoEmpleadoDTO dto);
	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO dto);
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO dto);
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO dto);
	public TipoEmpleadoDTO updateEstatusTipoEmpleado(TipoEmpleadoDTO dto);	
	
	
//-----
	
	
	public List<?> infoEmpleadoAopSession(EmpleadoDTO dto);
	public EmpleadoDTO insertEmpleadoAopSession(EmpleadoDTO dto);
	public EmpleadoDTO updateEmpleadoAopSession(EmpleadoDTO dto);
	public boolean deleteEmpleadoAopSession(EmpleadoDTO dto);
	public EmpleadoDTO updateEstatusEmpleadoAopSession(EmpleadoDTO dto);	
	
	public List<?> infoUsuarioAopSession(UsuarioDTO dto);
	public UsuarioDTO insertUsuarioAopSession(UsuarioDTO dto);
	public UsuarioDTO updateUsuarioAopSession(UsuarioDTO dto);
	public boolean deleteUsuarioAopSession(UsuarioDTO dto);
	public UsuarioDTO updateEstatusUsuarioAopSession(UsuarioDTO dto);
	
	
	public List<?> catPerfilAopSession(PerfilDTO dto);
	public PerfilDTO insertPerfilAopSession(PerfilDTO dto);
	public PerfilDTO updatePerfilAopSession(PerfilDTO dto);
	public boolean deletePerfilAopSession(PerfilDTO dto);
	public PerfilDTO updateEstatusPerfilAopSession(PerfilDTO dto);	
	
	
	public List<?> catTipoEmpleadoAopSession(TipoEmpleadoDTO dto);
	public TipoEmpleadoDTO insertTipoEmpleadoAopSession(TipoEmpleadoDTO dto);
	public TipoEmpleadoDTO updateTipoEmpleadoAopSession(TipoEmpleadoDTO dto);
	public boolean deleteTipoEmpleadoAopSession(TipoEmpleadoDTO dto);
	public TipoEmpleadoDTO updateEstatusTipoEmpleadoAopSession(TipoEmpleadoDTO dto);	
	
	public List<?> catHabilidadAopSession(HabilidadDTO dto);
	public HabilidadDTO insertHabilidadAopSession(HabilidadDTO dto);
	public HabilidadDTO updateHabilidadAopSession(HabilidadDTO dto);
	public boolean deleteHabilidadAopSession(HabilidadDTO dto);
	public HabilidadDTO updateEstatusHabilidadAopSession(HabilidadDTO dto);	
	
	


}
