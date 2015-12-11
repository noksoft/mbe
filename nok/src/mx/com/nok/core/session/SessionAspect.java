
package mx.com.nok.core.session;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.servlet.http.HttpSession;

import mx.com.nok.core.bitacora.dao.BitacoraDAO;
import mx.com.nok.core.bitacora.model.dto.BitacoraDTO;
import mx.com.nok.core.excepcion.SessionException;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import flex.messaging.FlexContext;

@Aspect
@Component
public class SessionAspect {
	private static Logger log = Logger.getLogger(SessionAspect.class);
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	private Properties props;
	 private BitacoraDAO bitacoraDAO;
	




	@Before("execution(* *.*AopSession(..))")
	public void validaSession(JoinPoint jp){
		UsuarioDTO objUsr = null;
		try{
			//Metodo llamado
			String methodName = jp.getSignature().getName();
			//System.out.println("Nombre del metodo llamado : "+methodName);
			//Argumentos
			String argList = "";
			for(int i = 0 ; i < jp.getArgs().length; i++){
				argList += jp.getArgs()[i] + ",";
			}
			System.out.println("::::Validando session[{" + format.format(Calendar.getInstance().getTime()) + "}{" + methodName + "}{" + argList + "}]");
			log.debug("::::Validando session[{" + format.format(Calendar.getInstance().getTime()) + "}{" + methodName + "}{" + argList + "}]");
			
			  			
			//validamos session
		    HttpSession session = FlexContext.getHttpRequest().getSession(false);
			objUsr = session.getAttribute("usrNok")!=null?(UsuarioDTO)session.getAttribute("usrNok"):null;
			
			if( objUsr == null) {
				
				System.out.println("no hay session ");
				log.info("no hay session");			
				throw new SessionException("SESSION");				
        	}
		}catch(Exception e ){
			e.printStackTrace();
			System.out.println("no hay session catch ");
			log.info("no hay session");
			throw new SessionException("SESSION");
		}
	}	
	
	
	
	@After("execution(* *.*AopSession(..))")
	public void bitacoraSession(JoinPoint jp){
		UsuarioDTO objUsr = null;
		try{
			//Metodo llamado
			String methodName = jp.getSignature().getName();
			//System.out.println("Nombre del metodo Despues llamado : "+methodName);
			//Argumentos
			String argList = "";
			for(int i = 0 ; i < jp.getArgs().length; i++){
				argList += jp.getArgs()[i] + ",";
			}
			//System.out.println("::::Validando session[{" + format.format(Calendar.getInstance().getTime()) + "}{" + methodName + "}{" + argList + "}]");
			log.info("::::Validando session[{" + format.format(Calendar.getInstance().getTime()) + "}{" + methodName + "}{args : " + argList + "}]");
			//validamos session
		    HttpSession session = FlexContext.getHttpRequest().getSession(false);
			objUsr = session.getAttribute("usrNok")!=null?(UsuarioDTO)session.getAttribute("usrNok"):null;
			
			if( objUsr == null) {
				
				System.out.println("no hay session ");
				log.info("no hay session");			
				throw new SessionException("SESSION");				
        	}			
			else{				
				 BitacoraDTO dto =new BitacoraDTO();			   
				 dto.setDescripcion(props.getProperty(methodName));
				 dto.setIdEmpleado("2");
				 dto.setIp(objUsr.getIp());
				 dto.setIdEmpleado(objUsr.getIdEmpleado());
				 bitacoraDAO.insertMovimiento(dto);
			}
			
			
		}catch(Exception e ){
			System.out.println("no hay session catch ");
			log.info("no hay session");
			throw new SessionException("SESSION");
		}
	}



	public Properties getProps() {
		return props;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public BitacoraDAO getBitacoraDAO() {
		return bitacoraDAO;
	}

	public void setBitacoraDAO(BitacoraDAO bitacoraDAO) {
		this.bitacoraDAO = bitacoraDAO;
	}	
	
	
	
}