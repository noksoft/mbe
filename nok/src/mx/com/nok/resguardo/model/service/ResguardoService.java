package mx.com.nok.resguardo.model.service;

import java.util.List;

import mx.com.nok.resguardo.model.dto.ResguardoDTO;

public interface ResguardoService {
	
	public ResguardoDTO insertResguardoAopSession(ResguardoDTO dto);
	public List<?>getInfoResguardoAopSession(ResguardoDTO dto);
	public ResguardoDTO devolucionResguardoAopSession(ResguardoDTO dto);
	public List<?>getArticuloSinResguardoAopSession();
	
	
	
	

}
