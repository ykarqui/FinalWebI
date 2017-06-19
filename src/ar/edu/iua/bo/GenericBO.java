package ar.edu.iua.bo;

import ar.edu.iua.persistence.GenericDAO;
import java.util.List;


public class GenericBO<T> implements InterfaceBO<T> {

	GenericDAO<T> gDao = new GenericDAO<T>();

	public List<T> obtenerTodos() throws Exception {
		return gDao.findAll();
	}

	public void guardar(T instance) throws Exception {
		gDao.guardar(instance);
	}

	public void eliminar() throws Exception {
		gDao.borrarTodo();
	}

	public void borrarById(int id) throws Exception {
		// TODO Auto-generated method stub

	}

	public T encontrarById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
