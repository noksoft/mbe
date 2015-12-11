package mx.com.nok.resguardo.dao;

import java.util.List;

import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.resguardo.model.dto.ResguardoDTO;

public interface ResguardoDAO {
	
	
	public ResguardoDTO insertResguardo(ResguardoDTO dto);
	public List<ResguardoDTO>getInfoResguardo(ResguardoDTO dto);
	public ResguardoDTO devolucionResguardo(ResguardoDTO dto);
	public List<ArticuloDTO>getArticuloSinResguardo();

}
