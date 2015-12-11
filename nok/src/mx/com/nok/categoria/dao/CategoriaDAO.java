package mx.com.nok.categoria.dao;

import java.util.List;

import mx.com.nok.categoria.model.dto.CategoriaDTO;
import mx.com.nok.categoria.model.dto.SubcategoriaDTO;
import mx.com.nok.categoria.model.dto.TipoCategoriaDTO;


public interface CategoriaDAO {
	
	
	public List<?> infoCategoria(CategoriaDTO dto) throws Exception;
	public CategoriaDTO insertCategoria(CategoriaDTO dto) throws Exception;
	public CategoriaDTO updateCategoria(CategoriaDTO dto)throws Exception;
	public boolean deleteCategoria(CategoriaDTO dto) throws Exception;
	public CategoriaDTO updateEstatusCategoria(CategoriaDTO dto)throws Exception;
	
	public List<?> infoSubcategoria(SubcategoriaDTO dto) throws Exception;
	public SubcategoriaDTO insertSubcategoria(SubcategoriaDTO dto) throws Exception;
	public SubcategoriaDTO updateSubcategoria(SubcategoriaDTO dto)throws Exception;
	public boolean deleteSubcategoria(SubcategoriaDTO dto) throws Exception;
	public SubcategoriaDTO updateEstatusSubcategoria(SubcategoriaDTO dto)throws Exception;
	
	public List<?> infoTipocategoria(TipoCategoriaDTO dto) throws Exception;
	public TipoCategoriaDTO insertTipocategoria(TipoCategoriaDTO dto) throws Exception;
	public TipoCategoriaDTO updateTipocategoria(TipoCategoriaDTO dto) throws Exception;
	public boolean deleteTipocategoria (TipoCategoriaDTO dto) throws Exception;

}
