package com.springonetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springonetomany.entities.category;
//import com.springonetomany.entities.product;
import com.springonetomany.service.categoryService;
//import com.springonetomany.service.productService;
//import com.springrestapi.model.User;

@RestController//to handle the requests made by the client
@RequestMapping("/category")//web requests onto specific handler classes 
public class categoryController {

	@Autowired
	//Spring boot automatically inject the object 
	private categoryService cs; 
	
	//Add product
	@PostMapping("/api/categories")///handle post request
	private category add(@RequestBody category c) //@RequestBody converts JSON to java code
	{
		
		return cs.addorupdate(c);
	}
	

	
	@GetMapping("/api/categories")
	public Iterable<category> getAll(@RequestParam(value="pageNumber",defaultValue = "1",required = false) Integer pageNumber,
			@RequestParam(value="pageSize",defaultValue = "5",required = false) Integer pageSize)
	{
		return cs.getAll(pageNumber, pageSize);
	}
	
	@GetMapping("/api/categories/{id}")
	public category getById(@PathVariable int id) { // @PathVariable use to extract the value from the URI.
		//fetch object by id
		return cs.getById(id);
	}
	
	@PutMapping("/api/categories/{id}")
	public category update(@PathVariable int id,   @RequestBody category c)
	{
		c.setcId(id);
	
		return cs.addorupdate(c);
	}
	
	@DeleteMapping("/api/categories/{id}")
	public void delete(@PathVariable int id)
	{
		cs.delete(id);
		
	}
}
