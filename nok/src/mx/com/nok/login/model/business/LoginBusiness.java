package mx.com.nok.login.model.business;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import flex.messaging.FlexContext;
import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.login.dao.LoginDAO;
import mx.com.nok.login.model.service.LoginService;

public class LoginBusiness implements LoginService{
	
	
	private LoginDAO loginDAO;
	private Logger log = Logger.getLogger(this.getClass());

	
	
	
	public UsuarioDTO logIn(UsuarioDTO dtoTmp) {
		
		log.debug(":::: Validando Usuario");
		UsuarioDTO usuarioNok = null;
		try {
		boolean flag=loginDAO.logUsr(dtoTmp);
		System.out.println("flag: " + flag);
		if(flag){	
			usuarioNok = loginDAO.getInfoUsuario(dtoTmp);
			log.debug(":::: Acceso permitido usuario valido");
			return usuarioNok;
			}				
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Ocurrio un error al momento de loguear al " +
					"usuario : "+ dtoTmp.getUsuario());
			dtoTmp.setErrorLogin(e.getCause().getMessage());
		}
		return dtoTmp;		
	}
	
	/**
	 * Obtiene solo la informaci���n basica del usuario
	 * que se loguo exitosamente para ser presentada en el front de FLEX,
	 * por seguridad se anula la informaci���n sensitiva 
	 * 
	 */
	public UsuarioDTO infoUsuario(){
		
		UsuarioDTO dto = new UsuarioDTO ();
		dto=(UsuarioDTO)FlexContext.getHttpRequest().
		getSession().getAttribute("usrNok");		
		dto=dto.datosBasicos();		
		return dto;
	}
	
	
	/**
	 * Cambia el password del usuario
	 */
	public UsuarioDTO updateUserAopSession (UsuarioDTO _user){
		UsuarioDTO _userUpdate = new UsuarioDTO();
		try{
			_userUpdate = loginDAO.updateUser(_user);
		}catch(Exception e){
			e.printStackTrace();
			_userUpdate = null;
		}
		return _userUpdate;
	}
	
	/**
	 * Funci��n que regresa los perfiles
	 */
	public List<?> getInfoPerfilesAopSession(PerfilDTO _perfilDTO){
		List<?> list = new ArrayList<PerfilDTO>();
		try{
			list = loginDAO.getPerfiles(_perfilDTO);
		}catch(Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}
	
	

	public boolean logOut() {
		boolean flg=false;
		UsuarioDTO dtoTmp = (UsuarioDTO)FlexContext.getHttpRequest().
							 getSession().getAttribute("usrNok");		
		
		if(dtoTmp.getStatus()){// si el usuario tiene un status true como usuario valido en la session			
			dtoTmp.setStatus(false); //asignamos al dto Temporal el status de falso para que aplique el deslogueo
			
			try {
				System.out.println("Into logOut");
				 flg=loginDAO.logUsr(dtoTmp);
				 System.out.println("logOut flg: " + flg);
				if (flg){
					FlexContext.getHttpRequest().getSession().invalidate();//Matamos la session 
					log.debug("El usuario se ha deslogueado exitosamente");					
				}				
			} catch (Exception e) {
				flg=false;
				log.debug("Ocurrio un error en el deslogueo favor de validar");
				e.printStackTrace();
				
			}
		}
		else{
			log.debug("No existe session inicializada para el usuario : "+dtoTmp.getUsuario());
			
		}			
		return flg;
	}

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}
	
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public String saludoAopSession(String usuario) {
		System.out.println("!!!!! Bienvenido al sistema Nok  !!!!!!! "+ usuario);
			return "!!!!! Bienvenido al sistema Nok "+ usuario;
	}	
	public String saludo(String usuario) {
		System.out.println("!!!!! Bienvenido al sistema Nok "+ usuario+ " NOoooo es una entrada correcta!!!!");
		return "!!!!! Bienvenido al sistema Nok "+ usuario+ " NOoooo es una entrada correcta!!!!";
	}
	

}
