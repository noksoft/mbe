package mx.com.nok.articulo.model.service;

import java.util.List;

import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.articulo.model.dto.MarcaDTO;
import mx.com.nok.articulo.model.dto.SubmarcaDTO;

public interface ArticuloService {

	
	
	
	//Servicios Marca
	public List<?> catMarca(MarcaDTO dto);
	public MarcaDTO insertMarca(MarcaDTO dto);
	public MarcaDTO updateMarca(MarcaDTO dto);
	public boolean deleteMarca(MarcaDTO dto);
	public MarcaDTO updateEstatusMarca(MarcaDTO dto);	
	
	//Servicios Submarca
	public List<?> catSubmarca(SubmarcaDTO dto);	
	public SubmarcaDTO insertSubmarca(SubmarcaDTO dto);
	public SubmarcaDTO updateSubmarca(SubmarcaDTO dto);
	public boolean deleteSubmarca(SubmarcaDTO dto);
	public SubmarcaDTO updateEstatusSubmarca(SubmarcaDTO dto);
	
	//Servicios Articulo
	public List<?> catArticulo(ArticuloDTO dto);	
	public ArticuloDTO insertArticulo(ArticuloDTO dto);
	public ArticuloDTO updateArticulo(ArticuloDTO dto);
	public boolean deleteArticulo(ArticuloDTO dto);
	public ArticuloDTO updateEstatusArticulo(ArticuloDTO dto);
	
	
	public List<?> buscaArticulo(ArticuloDTO dto);	
	
	
	
	//Servicios Marca
	public List<?> catMarcaAopSession(MarcaDTO dto);
	public MarcaDTO insertMarcaAopSession(MarcaDTO dto);
	public MarcaDTO updateMarcaAopSession(MarcaDTO dto);
	public boolean deleteMarcaAopSession(MarcaDTO dto);
	public MarcaDTO updateEstatusMarcaAopSession(MarcaDTO dto);	
	
	//Servicios Submarca
	public List<?> catSubmarcaAopSession(SubmarcaDTO dto);	
	public SubmarcaDTO insertSubmarcaAopSession(SubmarcaDTO dto);
	public SubmarcaDTO updateSubmarcaAopSession(SubmarcaDTO dto);
	public boolean deleteSubmarcaAopSession(SubmarcaDTO dto);
	public SubmarcaDTO updateEstatusSubmarcaAopSession(SubmarcaDTO dto);
	
	//Servicios Articulo
	public List<?> catArticuloAopSession(ArticuloDTO dto);	
	public List<ArticuloDTO> getArticulosByTipocategoria(ArticuloDTO dto);
	public ArticuloDTO insertArticuloAopSession(ArticuloDTO dto);
	public ArticuloDTO updateArticuloAopSession(ArticuloDTO dto);
	public boolean deleteArticuloAopSession(ArticuloDTO dto);
	public ArticuloDTO updateEstatusArticuloAopSession(ArticuloDTO dto);
	
	public List<?> buscaArticuloAopSession(ArticuloDTO dto);	
	
	
	
	

	
	
	
}
