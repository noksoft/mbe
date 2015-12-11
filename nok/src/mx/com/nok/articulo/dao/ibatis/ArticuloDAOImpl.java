package mx.com.nok.articulo.dao.ibatis;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.articulo.dao.ArticuloDAO;
import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.articulo.model.dto.MarcaDTO;
import mx.com.nok.articulo.model.dto.SubmarcaDTO;

public class ArticuloDAOImpl extends SqlMapClientDaoSupport implements ArticuloDAO,Serializable{
	
	
	private static final long serialVersionUID = 1L;


	public List<?> infoMarca(MarcaDTO dto) throws Exception {	
		
		return this.getSqlMapClientTemplate().
				queryForList("infoMarca",dto);
	}
	
	public MarcaDTO insertMarca(MarcaDTO dto) throws Exception {
		 return (MarcaDTO)this.getSqlMapClientTemplate().
			queryForObject("insertMarca",dto);
	}
	
	public MarcaDTO updateMarca(MarcaDTO dto) throws Exception {
		 return (MarcaDTO)this.getSqlMapClientTemplate().
					queryForObject("updateMarca",dto);
	}
	
	public boolean deleteMarca(MarcaDTO dto) throws Exception{
		 return (Boolean)this.getSqlMapClientTemplate().
					queryForObject("deleteMarca",dto);
	}

	
	public MarcaDTO updateEstatusMarca(MarcaDTO dto) throws Exception {
		return (MarcaDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEstatusMarca",dto);
	}

	
	public List<?> infoSubmarca(SubmarcaDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoSubmarca",dto);
	}

	
	public SubmarcaDTO insertSubmarca(SubmarcaDTO dto) throws Exception {
		 return (SubmarcaDTO)this.getSqlMapClientTemplate().
					queryForObject("insertSubmarca",dto);
	}

	
	public SubmarcaDTO updateSubmarca(SubmarcaDTO dto) throws Exception {
		 return (SubmarcaDTO)this.getSqlMapClientTemplate().
					queryForObject("updateSubmarca",dto);
	}

	
	public boolean deleteSubmarca(SubmarcaDTO dto) throws Exception {
		 return (Boolean)this.getSqlMapClientTemplate().
					queryForObject("deleteSubmarca",dto);
	}

	
	public SubmarcaDTO updateEstatusSubmarca(SubmarcaDTO dto) throws Exception {
		 return (SubmarcaDTO)this.getSqlMapClientTemplate().
		 			queryForObject("updateEstatusSubmarca",dto);
	}


	public boolean deleteArticulo(ArticuloDTO dto) throws Exception {
		
		return (Boolean)this.getSqlMapClientTemplate().
			queryForObject("deleteArticulo",dto);
	}

	
	public List<?> infoArticulo(ArticuloDTO dto) throws Exception {
			return this.getSqlMapClientTemplate().
			queryForList("infoArticulo",dto);
	}
	
	/**
	 * Busca los Art�culos de acuerdo al tipo de categor�as
	 * @param ArticuloDTO
	 * @return List<ArticulosDTO> Lista de Articulos encontrados
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ArticuloDTO> getArticulosByTipocategoria(ArticuloDTO dto)
			throws Exception {
		return this.getSqlMapClientTemplate().queryForList("getArticulosByTipocategoria", dto);
	}
	
	public ArticuloDTO insertArticulo(ArticuloDTO dto) throws Exception {
		 return (ArticuloDTO)this.getSqlMapClientTemplate().
			queryForObject("insertArticulo",dto);
	}

	@Override
	public ArticuloDTO updateArticulo(ArticuloDTO dto) throws Exception {
		 return (ArticuloDTO)this.getSqlMapClientTemplate().
			queryForObject("updateArticulo",dto);
	}

	@Override
	public ArticuloDTO updateEstatusArticulo(ArticuloDTO dto) throws Exception {
		 return (ArticuloDTO)this.getSqlMapClientTemplate().
			queryForObject("updateArticulo",dto);
	}
	
	
	public List<?> buscaArticulo(ArticuloDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("buscaArticulo",dto);
	}

	@Override
	public ArticuloDTO findArticuloById(ArticuloDTO dto) throws Exception {
		return (ArticuloDTO)this.getSqlMapClientTemplate().queryForObject("buscaArticulo", dto);
	}

	@Override
	public void updateCantidadArticulo(ArticuloDTO dto) throws Exception {
		this.getSqlMapClientTemplate().
		queryForObject("updateCantidadArticulo",dto);
	}

	

}
