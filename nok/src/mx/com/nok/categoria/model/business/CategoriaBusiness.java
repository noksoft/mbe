package mx.com.nok.categoria.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sun.rmi.rmid.ExecPermission;

import mx.com.nok.categoria.model.dto.CategoriaDTO;
import mx.com.nok.categoria.model.service.CategoriaService;
import mx.com.nok.categoria.dao.CategoriaDAO;
import mx.com.nok.categoria.model.dto.CategoriaDTO;
import mx.com.nok.categoria.model.dto.SubcategoriaDTO;
import mx.com.nok.categoria.model.dto.TipoCategoriaDTO;
import mx.com.nok.categoria.model.service.CategoriaService;


public class CategoriaBusiness implements Serializable,CategoriaService {


	private static final long serialVersionUID = 1L;
	
	private CategoriaDAO categoriaDAO;

	
	public List<?> catCategoriaAopSession(CategoriaDTO dto) {
		List <?> list= new ArrayList<CategoriaDTO>();
		try {			
			
			list=categoriaDAO.infoCategoria(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	public boolean deleteCategoriaAopSession(CategoriaDTO dto) {
		try {
			return (Boolean)categoriaDAO.deleteCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public CategoriaDTO insertCategoriaAopSession(CategoriaDTO dto) {
		try {
			return categoriaDAO.insertCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public CategoriaDTO updateEstatusCategoriaAopSession(CategoriaDTO dto) {
	try {
			
			return categoriaDAO.updateEstatusCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CategoriaDTO updateCategoriaAopSession(CategoriaDTO dto) {
		try {
			
			return categoriaDAO.updateCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	/******************		Categorias sin AopSession	*****************/
	public List<?> catCategoria(CategoriaDTO dto) {
		List <?> list= new ArrayList<CategoriaDTO>();
		try {			
			System.out.println("dto: " + dto);
			list=categoriaDAO.infoCategoria(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	public boolean deleteCategoria(CategoriaDTO dto) {
		try {
			return (Boolean)categoriaDAO.deleteCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	public CategoriaDTO insertCategoria(CategoriaDTO dto) {
		try {
			return categoriaDAO.insertCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public CategoriaDTO updateEstatusCategoria(CategoriaDTO dto) {
	try {
			
			return categoriaDAO.updateEstatusCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CategoriaDTO updateCategoria(CategoriaDTO dto) {
		try {
			
			return categoriaDAO.updateCategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	public CategoriaDAO getCategoriaDAO() {
		return categoriaDAO;
	}

	public void setCategoriaDAO(CategoriaDAO categoriaDAO) {
		this.categoriaDAO = categoriaDAO;
	}


	@Override
	public List<?> catSubcategoriaAopSession(SubcategoriaDTO dto) {
		List <?> list= new ArrayList<SubcategoriaDTO>();
		try {			
			
			list=categoriaDAO.infoSubcategoria(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	@Override
	public SubcategoriaDTO insertSubcategoriaAopSession(SubcategoriaDTO dto) {
		try {
			return categoriaDAO.insertSubcategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}


	@Override
	public SubcategoriaDTO updateSubcategoriaAopSession(SubcategoriaDTO dto) {
	try {
				
				return categoriaDAO.updateSubcategoria(dto);
			} catch (Exception e) {			
				e.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean deleteSubcategoriaAopSession(SubcategoriaDTO dto) {
		try {
			return (Boolean)categoriaDAO.deleteSubcategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public SubcategoriaDTO updateEstatusSubcategoriaAopSession(SubcategoriaDTO dto) {
		try {
			
			return categoriaDAO.updateEstatusSubcategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**********************	Subcategorias sin AopSession	*************************/
	@Override
	public List<?> catSubcategoria(SubcategoriaDTO dto) {
		List <?> list= new ArrayList<SubcategoriaDTO>();
		try {			
			
			list=categoriaDAO.infoSubcategoria(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}


	@Override
	public SubcategoriaDTO insertSubcategoria(SubcategoriaDTO dto) {
		try {
			return categoriaDAO.insertSubcategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}


	@Override
	public SubcategoriaDTO updateSubcategoria(SubcategoriaDTO dto) {
	try {
				
				return categoriaDAO.updateSubcategoria(dto);
			} catch (Exception e) {			
				e.printStackTrace();
				return null;
			}
	}


	@Override
	public boolean deleteSubcategoria(SubcategoriaDTO dto) {
		try {
			return (Boolean)categoriaDAO.deleteSubcategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public SubcategoriaDTO updateEstatusSubcategoria(SubcategoriaDTO dto) {
		try {
			
			return categoriaDAO.updateEstatusSubcategoria(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public List<?> infoTipocategoria(TipoCategoriaDTO dto){
		List <?> list= new ArrayList<TipoCategoriaDTO>();
		try {			
			
			list=categoriaDAO.infoTipocategoria(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	@Override
	public List<?> infoTipocategoriaAopSession(TipoCategoriaDTO dto){
		List <?> list= new ArrayList<TipoCategoriaDTO>();
		try {			
			
			list=categoriaDAO.infoTipocategoria(dto);	
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	@Override
	public TipoCategoriaDTO insertTipocategoria(TipoCategoriaDTO dto){
		try{
			return categoriaDAO.insertTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public TipoCategoriaDTO insertTipocategoriaAopSession(TipoCategoriaDTO dto){
		try{
			return categoriaDAO.insertTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public TipoCategoriaDTO updateTipocategoria(TipoCategoriaDTO dto){
		try{
			return categoriaDAO.updateTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public TipoCategoriaDTO updateTipocategoriaAopSession(TipoCategoriaDTO dto){
		try{
			return categoriaDAO.updateTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean deleteTipocategoria(TipoCategoriaDTO dto){
		try{
			return categoriaDAO.deleteTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean deleteTipocategoriaAopSession(TipoCategoriaDTO dto){
		try{
			return categoriaDAO.deleteTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
