package com.student.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.student.Entity.Menu;



public interface MenuRepo extends JpaRepository<Menu, Integer>, CrudRepository<Menu, Integer> {
		List<Menu> findByCategory(String category);
		Menu findByItem(String item);
		Menu save(String item);
}
