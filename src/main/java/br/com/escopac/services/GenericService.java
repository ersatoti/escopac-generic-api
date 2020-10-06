package br.com.escopac.services;

import java.util.List;

public interface GenericService<T> {   
	
	List<T> findAll();
	T save(T entity);
	T findById(Integer id);
	void delete(T entity);
	void deleteById(Integer id);
	long count();
	
}