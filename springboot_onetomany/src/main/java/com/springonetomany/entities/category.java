package com.springonetomany.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
//import javax.persistence.Table;
//import javax.persistence.Table;
//cproduct
@Entity
public class category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cname;
//	@OneToMany(cascade = CascadeType.ALL)
//  @ManyToOne(cascade = CascadeType.ALL)
@OneToMany(cascade = CascadeType.ALL,mappedBy = "category",fetch = FetchType.LAZY)//2//
//  @JoinColumn(name="catid",referencedColumnName = "cId")
	private List<product> products;

	@JsonManagedReference
	public List<product> getProducts() {
		return products;
	}

	public void setProducts(List<product> products) {
		this.products = products;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int id) {
		this.cId = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public category( String cname, List<product> products) {
		super();
		
		this.cname = cname;
		this.products = products;
	}
	
	
	

	
	
	
	
	
}
