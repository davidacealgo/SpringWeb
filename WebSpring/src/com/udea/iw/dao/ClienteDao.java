/**
 * 
 */
package com.udea.iw.dao;
import java.util.List;
import com.udea.iw.dto.Cliente;
import com.udea.iw.exception.Exceptions;
/**
 * @author davida.acevedo
 * Versión 2.0
 */
public interface ClienteDao {
	//Entrega la lista completa de ciudades de la base de datos ordenada por su fecha de creación
	/*@return
	 @throws	
	 */
	public List<Cliente> obtener() throws Exceptions;
	
	
	public void guardar(Cliente cliente) throws Exceptions;
		
	
}
