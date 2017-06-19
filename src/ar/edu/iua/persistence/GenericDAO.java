package ar.edu.iua.persistence;

import java.util.ArrayList;
import java.util.List;


public class GenericDAO <T> implements InterfaceDAO <T>{

    List<T> list = new ArrayList<T>();

	public void borrarTodo() throws Exception {
		list.clear();
	}

	public void guardar(T instance) throws Exception {
		list.add(instance);
	}

	public List<T> findAll() throws Exception {

		return list;
	}

	public void deleteById(String id) throws Exception {

	}


	public T findById(String id) throws Exception {

		return null;
	}
    
}
