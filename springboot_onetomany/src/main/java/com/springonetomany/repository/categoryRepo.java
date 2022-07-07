package com.springonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.io.Serializable;
//import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springonetomany.entities.category;
//import com.springonetomany.entities.product;
@Repository
public interface categoryRepo extends JpaRepository<category, Integer>{

//some extra methods related to JPA such as delete records

}
