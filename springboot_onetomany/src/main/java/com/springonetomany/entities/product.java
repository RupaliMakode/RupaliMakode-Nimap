package com.springonetomany.entities;
import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
//@JsonInclude(value = Include.NON_NULL)
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pname;
	
	@ManyToOne(cascade = CascadeType.MERGE)
//	@ManyToOne
	@JoinColumn(name="c_id")
	private category category;

	
	@JsonBackReference
	public category getCategory() {
		return category;
	}
	public void setCategory(category category) {
		this.category = category;
	}
	public int getpId() {
		return pId;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setpId(int id) {
		this.pId = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	public product(String pname) {
		super();
		this.pname = pname;
//		this.category = category;
	}
	


	


	


	
	
	
	
}
