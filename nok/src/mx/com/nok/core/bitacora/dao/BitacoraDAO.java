package mx.com.nok.core.bitacora.dao;

import java.util.List;

import mx.com.nok.core.bitacora.model.dto.BitacoraDTO;


public interface BitacoraDAO {	
	
	public void insertMovimiento(BitacoraDTO dto) throws Exception;

}
