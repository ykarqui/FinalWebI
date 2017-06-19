
package ar.edu.iua.persistence;

import java.util.List;


public interface InterfaceDAO <T>{

	public void borrarTodo() throws Exception;
	
	public void guardar(T instance) throws Exception;
	
	public void deleteById(String id) throws Exception;
	
	public List<T> findAll() throws Exception;
	
	public T findById(String id) throws Exception;    
}
