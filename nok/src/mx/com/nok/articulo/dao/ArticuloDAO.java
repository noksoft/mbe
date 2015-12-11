package mx.com.nok.articulo.dao;

import java.util.List;

import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.articulo.model.dto.MarcaDTO;
import mx.com.nok.articulo.model.dto.SubmarcaDTO;

public interface ArticuloDAO{
	  
	
	public List<?> infoMarca(MarcaDTO dto) throws Exception;
	public List<ArticuloDTO> getArticulosByTipocategoria(ArticuloDTO dto)throws Exception;
	public MarcaDTO insertMarca(MarcaDTO dto) throws Exception;
	public MarcaDTO updateMarca(MarcaDTO dto)throws Exception;
	public boolean deleteMarca(MarcaDTO dto) throws Exception;
	public MarcaDTO updateEstatusMarca(MarcaDTO dto)throws Exception;
	 
	public List<?> infoSubmarca(SubmarcaDTO dto) throws Exception;	
	public SubmarcaDTO insertSubmarca(SubmarcaDTO dto)throws Exception;
	public SubmarcaDTO updateSubmarca(SubmarcaDTO dto) throws Exception;
	public boolean deleteSubmarca(SubmarcaDTO dto) throws Exception;
	public SubmarcaDTO updateEstatusSubmarca(SubmarcaDTO dto)throws Exception;	
	
	public List<?> infoArticulo(ArticuloDTO dto) throws Exception;	
	public ArticuloDTO insertArticulo(ArticuloDTO dto)throws Exception;
	public ArticuloDTO updateArticulo(ArticuloDTO dto) throws Exception;
	public boolean deleteArticulo(ArticuloDTO dto) throws Exception;
	public ArticuloDTO updateEstatusArticulo(ArticuloDTO dto)throws Exception;
	
	
	public List<?> buscaArticulo(ArticuloDTO dto)  throws Exception;
	public ArticuloDTO findArticuloById(ArticuloDTO dto) throws Exception;
	public void updateCantidadArticulo(ArticuloDTO dto) throws Exception;

}
