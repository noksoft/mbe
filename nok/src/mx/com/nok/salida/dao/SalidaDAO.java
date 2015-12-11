package mx.com.nok.salida.dao;

import java.util.List;


import mx.com.nok.salida.model.dto.SalidaAlmacenDTO;


public interface SalidaDAO {
	
	public List<?> infoSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception;
	public SalidaAlmacenDTO insertSalidaAlmacen(SalidaAlmacenDTO dto)throws Exception;
	public SalidaAlmacenDTO updateSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception;
	public boolean deleteSalidaAlmacen(SalidaAlmacenDTO dto) throws Exception;
	
}
