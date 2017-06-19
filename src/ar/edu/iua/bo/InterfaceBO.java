package ar.edu.iua.bo;

import java.util.List;


public interface InterfaceBO <T>{
	
	public List<T> obtenerTodos() throws Exception;
	public void guardar(T instance) throws Exception;
	public void eliminar() throws Exception;
	public void borrarById(int id) throws Exception;
	public T encontrarById(int id) throws Exception;
	
}
