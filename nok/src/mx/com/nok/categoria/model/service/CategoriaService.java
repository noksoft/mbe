package mx.com.nok.categoria.model.service;

import java.util.List;

import mx.com.nok.categoria.model.dto.CategoriaDTO;
import mx.com.nok.categoria.model.dto.SubcategoriaDTO;
import mx.com.nok.categoria.model.dto.TipoCategoriaDTO;

 

public interface CategoriaService {

	
	public List<?> catCategoriaAopSession(CategoriaDTO dto);
	public CategoriaDTO insertCategoriaAopSession(CategoriaDTO dto);
	public CategoriaDTO updateCategoriaAopSession(CategoriaDTO dto);
	public boolean deleteCategoriaAopSession(CategoriaDTO dto);
	public CategoriaDTO updateEstatusCategoriaAopSession(CategoriaDTO dto);	
	
	public List<?> catSubcategoriaAopSession(SubcategoriaDTO dto);
	public SubcategoriaDTO insertSubcategoriaAopSession(SubcategoriaDTO dto);
	public SubcategoriaDTO updateSubcategoriaAopSession(SubcategoriaDTO dto);
	public boolean deleteSubcategoriaAopSession(SubcategoriaDTO dto);
	public SubcategoriaDTO updateEstatusSubcategoriaAopSession(SubcategoriaDTO dto);	
	
	
	//Secci��n para los tipos de categor��as
	public List<?> infoTipocategoriaAopSession(TipoCategoriaDTO dto);
	public TipoCategoriaDTO insertTipocategoriaAopSession(TipoCategoriaDTO dto);
	public TipoCategoriaDTO updateTipocategoriaAopSession(TipoCategoriaDTO dto);
	public boolean deleteTipocategoriaAopSession(TipoCategoriaDTO dto);
	
	
	public List<?> catCategoria(CategoriaDTO dto);
	public CategoriaDTO insertCategoria(CategoriaDTO dto);
	public CategoriaDTO updateCategoria(CategoriaDTO dto);
	public boolean deleteCategoria(CategoriaDTO dto);
	public CategoriaDTO updateEstatusCategoria(CategoriaDTO dto);
	
	public List<?> catSubcategoria(SubcategoriaDTO dto);
	public SubcategoriaDTO insertSubcategoria(SubcategoriaDTO dto);
	public SubcategoriaDTO updateSubcategoria(SubcategoriaDTO dto);
	public boolean deleteSubcategoria(SubcategoriaDTO dto);
	public SubcategoriaDTO updateEstatusSubcategoria(SubcategoriaDTO dto);
	
	public List<?> infoTipocategoria(TipoCategoriaDTO dto);
	public TipoCategoriaDTO insertTipocategoria(TipoCategoriaDTO dto);
	public TipoCategoriaDTO updateTipocategoria(TipoCategoriaDTO dto);
	public boolean deleteTipocategoria(TipoCategoriaDTO dto);
	
}
