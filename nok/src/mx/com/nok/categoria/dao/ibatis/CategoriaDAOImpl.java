package mx.com.nok.categoria.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.categoria.dao.CategoriaDAO;
import mx.com.nok.categoria.model.dto.CategoriaDTO;
import mx.com.nok.categoria.model.dto.SubcategoriaDTO;
import mx.com.nok.categoria.model.dto.TipoCategoriaDTO;


public class CategoriaDAOImpl  extends SqlMapClientDaoSupport implements CategoriaDAO{

	@Override
	public boolean deleteCategoria(CategoriaDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteCategoria",dto);
	}

	@Override
	public List<?> infoCategoria(CategoriaDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoCategoria",dto);
	}

	@Override
	public CategoriaDTO insertCategoria(CategoriaDTO dto) throws Exception {
		return (CategoriaDTO)this.getSqlMapClientTemplate().
		queryForObject("insertCategoria",dto);
	}

	@Override
	public CategoriaDTO updateEstatusCategoria(CategoriaDTO dto) throws Exception {
		return (CategoriaDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEstatusCategoria",dto);
	}

	@Override
	public CategoriaDTO updateCategoria(CategoriaDTO dto) throws Exception {
		return (CategoriaDTO)this.getSqlMapClientTemplate().
		queryForObject("updateCategoria",dto);
	}

	@Override
	public List<?> infoSubcategoria(SubcategoriaDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoSubcategoria",dto);
	}

	@Override
	public SubcategoriaDTO insertSubcategoria(SubcategoriaDTO dto) throws Exception {
		return (SubcategoriaDTO)this.getSqlMapClientTemplate().
				queryForObject("insertSubcategoria",dto);
	}

	@Override
	public SubcategoriaDTO updateSubcategoria(SubcategoriaDTO dto) throws Exception {
		return (SubcategoriaDTO)this.getSqlMapClientTemplate().
				queryForObject("updateSubcategoria",dto);
	}

	@Override
	public boolean deleteSubcategoria(SubcategoriaDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteSubcategoria",dto);
	}

	@Override
	public SubcategoriaDTO updateEstatusSubcategoria(SubcategoriaDTO dto) throws Exception {
		return (SubcategoriaDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusSubcategoria",dto);
	}
	
	@Override
	public List<?> infoTipocategoria(TipoCategoriaDTO dto) throws Exception{
		return this.getSqlMapClientTemplate().queryForList("infoTipocategoria", dto);
	}
	
	@Override
	public TipoCategoriaDTO insertTipocategoria(TipoCategoriaDTO dto) throws Exception{
		return (TipoCategoriaDTO)this.getSqlMapClientTemplate().queryForObject("insertTipocategoria", dto);
	}
	
	@Override
	public TipoCategoriaDTO updateTipocategoria(TipoCategoriaDTO dto) throws Exception{
		return (TipoCategoriaDTO)this.getSqlMapClientTemplate().queryForObject("updateTipocategoria", dto);
	}
	
	@Override
	public boolean deleteTipocategoria (TipoCategoriaDTO dto) throws Exception{
		return (Boolean)this.getSqlMapClientTemplate().queryForObject("deleteTipocategoria", dto);
	}
	

}
