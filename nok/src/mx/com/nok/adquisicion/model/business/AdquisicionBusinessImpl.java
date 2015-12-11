package mx.com.nok.adquisicion.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.adquisicion.dao.IAdquisicionDAO;
import mx.com.nok.adquisicion.model.dto.AdquisicionDTO;
import mx.com.nok.adquisicion.model.service.IAdquisicionBusiness;

public class AdquisicionBusinessImpl implements IAdquisicionBusiness,
		Serializable {

	private static final long serialVersionUID = 1002039199188245643L;

	private IAdquisicionDAO adquisicionDAO;
	
	@Override
	public List<AdquisicionDTO> getAdquisiciones(AdquisicionDTO adquisicion) {
		List<AdquisicionDTO> listAdquisiciones = new ArrayList<AdquisicionDTO>();
		try{
			listAdquisiciones = adquisicionDAO.getAdquisiciones(adquisicion);
		}catch(Exception e){
			e.printStackTrace();
			listAdquisiciones = null;
		}
		return listAdquisiciones;
	}

	@Override
	public AdquisicionDTO insertAdquisicion(AdquisicionDTO adquisicion) {
		try{
			return (AdquisicionDTO)adquisicionDAO.insertAdquisicion(adquisicion);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AdquisicionDTO updateAdquisicion(AdquisicionDTO adquisicion) {
		try{
			return (AdquisicionDTO)adquisicionDAO.updateAdquisicion(adquisicion);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean deleteAdquisicion(AdquisicionDTO adquisicion) {
		try{
			return (Boolean)adquisicionDAO.deleteAdquisicion(adquisicion);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public IAdquisicionDAO getAdquisicionDAO() {
		return adquisicionDAO;
	}

	public void setAdquisicionDAO(IAdquisicionDAO adquisicionDAO) {
		this.adquisicionDAO = adquisicionDAO;
	}

}
