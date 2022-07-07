package com.springonetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.springonetomany.entities.category;
import com.springonetomany.entities.product;
import com.springonetomany.repository.categoryRepo;
import com.springonetomany.repository.productRepo;

@Service
public class productService {

	@Autowired
	private productRepo pr;
	
	
	
	//department-@onetomany//cat
	//employee             //pro
	public product addorupdate(product p)
	{
		
		return pr.save(p);
	}
	
	public boolean delete(int id)
	{
		pr.deleteById(id);
		return true;
	}
	
	
	public Iterable<product> getAll(Integer pageNumber,Integer pageSize)
	{
		Pageable p=PageRequest.of(pageNumber, pageSize);
		
		Page<product> p1=pr.findAll(p);
		Iterable<product> c2=p1.getContent();
		return c2;
//return pr.findAll();
	}
	
	public product getById(int id) {
		return pr.findById(id).get();//return cr.findById(id).get();
	}
	
	
}
