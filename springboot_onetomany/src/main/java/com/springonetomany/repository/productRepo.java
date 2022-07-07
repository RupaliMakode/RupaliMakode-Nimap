package com.springonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springonetomany.entities.product;
@Repository
public interface productRepo extends JpaRepository<product, Integer>{

}
