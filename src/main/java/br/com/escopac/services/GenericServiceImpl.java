package br.com.escopac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.escopac.repository.GenericRepository;

@Service
public class GenericServiceImpl<T> implements GenericService<T> {
	
	@Autowired
	private GenericRepository<T> repository;

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public T findById(Integer id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public long count() {
		return repository.count();
	}
}
