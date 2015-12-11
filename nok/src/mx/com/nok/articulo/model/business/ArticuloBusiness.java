package mx.com.nok.articulo.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.articulo.dao.ArticuloDAO;
import mx.com.nok.articulo.model.dto.ArticuloDTO;
import mx.com.nok.articulo.model.dto.MarcaDTO;
import mx.com.nok.articulo.model.dto.SubmarcaDTO;
import mx.com.nok.articulo.model.service.ArticuloService;

public class ArticuloBusiness implements Serializable,ArticuloService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArticuloDAO articuloDAO;
	

	
//---------------------------------MARCAS--------------------------------------------------	
	
	
		
	/**
	 * Obtiene el cat�lago de marcas 
	 */
	public List<?> catMarca(MarcaDTO dto)
	 {
		List <?> list= new ArrayList<MarcaDTO>();
		try {			
			
			list=articuloDAO.infoMarca(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	/**
	 * Inserta una nueva marca en los registros
	 */
	public MarcaDTO insertMarca(MarcaDTO dto) {		
		try {
			return (MarcaDTO)articuloDAO.insertMarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}				
	}
	/**
	 * Actualiza la informaci�n de la marca
	 */
	public MarcaDTO updateMarca(MarcaDTO dto) {
		try {
			return (MarcaDTO)articuloDAO.updateMarca(dto);
		} catch (Exception e) {		
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Borra a la marca de los registros en caso de que no se 
	 * pueda realizar enviara un mensaje de error
	 */
	public boolean deleteMarca(MarcaDTO dto) {
		try {
			return (Boolean)articuloDAO.deleteMarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	
//---------------------------------SUBMARCAS--------------------------------------------------		
	
	/**
	 * Cat�logo de submarca   
	 */
	@Override
	public List<?> catSubmarca(SubmarcaDTO dto) {
		List <?> list= new ArrayList<SubmarcaDTO>();		
		try {					
				list=articuloDAO.infoSubmarca(dto);	
			}			
		 catch (Exception e) {
			e.printStackTrace();
			list=null;
		}	
		return list;
	}
	

	/**
	 * Inserta informaci�n de una nueva submarca
	 */
	public SubmarcaDTO insertSubmarca(SubmarcaDTO dto) {
		try {
			SubmarcaDTO subMarca = null;
			subMarca = (SubmarcaDTO)articuloDAO.insertSubmarca(dto);
			return subMarca;
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Actualiza la informaci�n de la submarca
	 */
	public SubmarcaDTO updateSubmarca(SubmarcaDTO dto) {
		try {
			return (SubmarcaDTO)articuloDAO.updateSubmarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Borra la informaci�n de la submarca
	 */
	public boolean deleteSubmarca(SubmarcaDTO dto) {
		try {
			return (Boolean)articuloDAO.deleteSubmarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * Actualiza el estatus de la marca 
	 */
	public MarcaDTO updateEstatusMarca(MarcaDTO dto) {
		
		try {
			
			return articuloDAO.updateEstatusMarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}	
	
	/**
	 * Actualiza el estatus de la submarca 
	 */
	public SubmarcaDTO updateEstatusSubmarca(SubmarcaDTO dto) {
		
		try {
			return   articuloDAO.updateEstatusSubmarca(dto);
		
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

//----------------------------------ARTICULO---------------------------------------------
	
	
	public List<?>catArticulo(ArticuloDTO dto){
		
		List <?> list= new ArrayList<ArticuloDTO>();		
		try {					
				list=articuloDAO.infoArticulo(dto);
				
			}			
		 catch (Exception e) {
			e.printStackTrace();
			list = null;
		}	
			
		 return list;
	}
	

	/**
	 * Inserta un nuevo articulo a los registros
	 */
	public ArticuloDTO insertArticulo(ArticuloDTO dto) {
		try {
			return (ArticuloDTO)articuloDAO.insertArticulo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	


	/**
	 * Borra registro de art�culos
	 */
		public boolean deleteArticulo(ArticuloDTO dto) {
			try {
				return (Boolean)articuloDAO.deleteArticulo(dto);
			} catch (Exception e) {			
				e.printStackTrace();
				return false;
			}
		}
		
		
	/**
	 * Actualiza la informaci�n del Articulo
	 */
	public ArticuloDTO updateArticulo(ArticuloDTO dto) {
		try {
			return (ArticuloDTO)articuloDAO.updateArticulo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Actualiza el estatus del articulo
	 */
	public ArticuloDTO updateEstatusArticulo(ArticuloDTO dto) {
		try {
			return (ArticuloDTO)articuloDAO.updateEstatusArticulo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			
			return null;
		}
	}
	
	

public List<?>buscaArticulo(ArticuloDTO dto){
		
		List <?> list= new ArrayList<ArticuloDTO>();		
		try {					
				list=articuloDAO.buscaArticulo(dto);
				
			}			
		 catch (Exception e) {
			e.printStackTrace();
			list = null;
		}	
			
		 return list;
	}



	public ArticuloDAO getArticuloDAO() {
		return articuloDAO;
	}

	public void setArticuloDAO(ArticuloDAO articuloDAO) {
		this.articuloDAO = articuloDAO;
	}
	
//-----------------------------------------------------------------------------------------------------------------

	//---------------------------------MARCAS--------------------------------------------------	
	
	/**
	 * Obtiene el cat�lago de marcas 
	 */
	public List<?> catMarcaAopSession(MarcaDTO dto)
	 {
		List <?> list= new ArrayList<MarcaDTO>();
		try {			
			
			list=articuloDAO.infoMarca(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	/**
	 * Inserta una nueva marca en los registros
	 */
	public MarcaDTO insertMarcaAopSession(MarcaDTO dto) {		
		try {
			return (MarcaDTO)articuloDAO.insertMarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}				
	}
	/**
	 * Actualiza la informaci�n de la marca
	 */
	public MarcaDTO updateMarcaAopSession(MarcaDTO dto) {
		try {
			return (MarcaDTO)articuloDAO.updateMarca(dto);
		} catch (Exception e) {		
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Borra a la marca de los registros en caso de que no se 
	 * pueda realizar enviara un mensaje de error
	 */
	public boolean deleteMarcaAopSession(MarcaDTO dto) {
		try {
			return (Boolean)articuloDAO.deleteMarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	
//---------------------------------SUBMARCAS--------------------------------------------------		
	
	/**
	 * Cat�logo de submarca   
	 */
	public List<?> catSubmarcaAopSession(SubmarcaDTO dto){
		List <?> list= new ArrayList<SubmarcaDTO>();		
		try {					
				list=articuloDAO.infoSubmarca(dto);	
			}			
		 catch (Exception e) {
			e.printStackTrace();
			list=null;
		}	
		return list;
	}	
	

	/**
	 * Inserta informaci�n de una nueva submarca
	 */
	public SubmarcaDTO insertSubmarcaAopSession(SubmarcaDTO dto) {
		try {
			return (SubmarcaDTO)articuloDAO.insertSubmarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Actualiza la informaci�n de la submarca
	 */
	public SubmarcaDTO updateSubmarcaAopSession(SubmarcaDTO dto) {
		try {
			return (SubmarcaDTO)articuloDAO.updateSubmarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Borra la informaci�n de la submarca
	 */
	public boolean deleteSubmarcaAopSession(SubmarcaDTO dto) {
		try {
			return (Boolean)articuloDAO.deleteSubmarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Actualiza el estatus de la marca 
	 */
	public MarcaDTO updateEstatusMarcaAopSession(MarcaDTO dto) {
		
		try {
			
			return articuloDAO.updateEstatusMarca(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}	
	
	/**
	 * Actualiza el estatus de la submarca 
	 */
	public SubmarcaDTO updateEstatusSubmarcaAopSession(SubmarcaDTO dto) {
		
		try {
			return   articuloDAO.updateEstatusSubmarca(dto);
		
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

//----------------------------------ARTICULO---------------------------------------------
	
	@Override
	public List<ArticuloDTO> getArticulosByTipocategoria(ArticuloDTO dto) {
		List<ArticuloDTO> list = new ArrayList<ArticuloDTO>();
		try{
			list = articuloDAO.getArticulosByTipocategoria(dto);
		}catch(Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}
	
	public List<?>catArticuloAopSession(ArticuloDTO dto){
		
		List <?> list= new ArrayList<ArticuloDTO>();		
		try {					
				list=articuloDAO.infoArticulo(dto);
				
			}			
		 catch (Exception e) {
			e.printStackTrace();
			list = null;
		}	
			
		 return list;
	}
	

	/**
	 * Inserta un nuevo articulo a los registros
	 */
	public ArticuloDTO insertArticuloAopSession(ArticuloDTO dto) {
		try {
			return (ArticuloDTO)articuloDAO.insertArticulo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	


	/**
	 * Borra registro de art�culos
	 */
		public boolean deleteArticuloAopSession(ArticuloDTO dto) {
			try {
				return (Boolean)articuloDAO.deleteArticulo(dto);
			} catch (Exception e) {			
				e.printStackTrace();
				return false;
			}
		}
		
		
	/**
	 * Actualiza la informaci�n del Articulo
	 */
	public ArticuloDTO updateArticuloAopSession(ArticuloDTO dto) {
		try {
			return (ArticuloDTO)articuloDAO.updateArticulo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Actualiza el estatus del articulo
	 */
	public ArticuloDTO updateEstatusArticuloAopSession(ArticuloDTO dto) {
		try {
			return (ArticuloDTO)articuloDAO.updateEstatusArticulo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			
			return null;
		}
	}
	
	

public List<?>buscaArticuloAopSession(ArticuloDTO dto){
		
		List <?> list= new ArrayList<ArticuloDTO>();		
		try {					
				list=articuloDAO.buscaArticulo(dto);
				
			}			
		 catch (Exception e) {
			e.printStackTrace();
			list = null;
		}	
			
		 return list;
	}


	
}
