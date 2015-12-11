package mx.com.nok.salida.model.service;

import java.util.List;

import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.salida.model.dto.SalidaAlmacenDTO;

public interface SalidaService {

	public List<?> infoSalidaAlmacen(SalidaAlmacenDTO dto);
	public SalidaAlmacenDTO insertSalidaAlmacen(SalidaAlmacenDTO dto);
	public SalidaAlmacenDTO updateSalidaAlmacen(SalidaAlmacenDTO dto);	
	public boolean deleteSalidaAlmacen(SalidaAlmacenDTO dto);
	
	
	
	public List<?> infoSalidaAlmacenAopSession(SalidaAlmacenDTO dto);
	public SalidaAlmacenDTO insertSalidaAlmacenAopSession(SalidaAlmacenDTO dto);
	public SalidaAlmacenDTO updateSalidaAlmacenAopSession(SalidaAlmacenDTO dto);	
	public boolean deleteSalidaAlmacenAopSession(SalidaAlmacenDTO dto);
}
