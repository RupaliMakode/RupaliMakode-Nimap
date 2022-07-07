package com.springonetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springonetomany.entities.category;
import com.springonetomany.entities.product;
import com.springonetomany.repository.categoryRepo;
import com.springonetomany.repository.productRepo;

@Service
public class categoryService {

	
	@Autowired//  inject the object dependency
	private categoryRepo cr;  //connect to the DB
	
	public category addorupdate(category c)
	{
		
		//save in database
		return cr.save(c);
	}
	
	public boolean delete(int id)
	{
		cr.deleteById(id);
		return true;
	}
	

	public Iterable<category> getAll(Integer pageNumber,Integer pageSize)
	{
		Pageable p=PageRequest.of(pageNumber, pageSize);
		
		Page<category> p1=cr.findAll(p);
		Iterable<category> c1=p1.getContent();
//		return cr.findAll();
		return c1;
	
	}
	
	public category getById(int id) {
		return cr.findById(id).get();
	}

	


	
}

