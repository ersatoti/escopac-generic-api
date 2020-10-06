package br.com.escopac.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.escopac.model.Auditable;
import br.com.escopac.services.GenericService;

public class GenericController<T extends Auditable> {
	
	@Autowired
	private GenericService<T> service;
	
	@GetMapping
	public List<T> list() {
		return service.findAll();
	}
	
	@PostMapping
	public T create(@RequestBody T entity) {
		return service.save(entity);
	}
	
	@PutMapping(value = "{id}")
	public T update(@PathVariable(value = "id") Integer id, @RequestBody T entity) {
		return service.save(entity);
	}
	
	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable(value = "id") Integer id) {
		service.deleteById(id);
	}
	
	@GetMapping(value = "{id}")
	public T get(@PathVariable(value = "id") Integer id) {
		return service.findById(id);
	}
}
