package com.student.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.student.Entity.Cart;



public interface CartRepo extends JpaRepository<Cart, Integer>, CrudRepository<Cart, Integer>{
	List<Cart> findByName(String name);
}
