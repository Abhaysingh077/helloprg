package com.FoodPostman;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepo extends JpaRepository<Menu, Integer>, CrudRepository<Menu, Integer> {
	List<Menu> findByCategory(String category);
	Menu findByItem(String item);
	Menu save(String item);
}
