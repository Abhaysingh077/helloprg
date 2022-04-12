package com.student.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.Entity.Menu;

import com.student.Repo.MenuRepo;

@Service
public class mainService {
	@Autowired
	MenuRepo menurepo;
	
	public Menu getItemById(int id) {
		return menurepo.findById(id).get();
	}

	public List<Menu> getAllItems() {
		List<Menu> items = new ArrayList<Menu>();
		menurepo.findAll().forEach(item -> items.add(item));
		return items;
	}

	public void save(Menu menu) {
		menurepo.save(menu);
	}

	public void deleteItemById(int id) {
		menurepo.deleteById(id);
	}

	public List<Menu> findAllItem(String category) {
		List<Menu> items = new ArrayList<Menu>();
		menurepo.findByCategory(category).forEach(item -> items.add(item));
		return items;
	}

	public Menu findAllItems(String item) {
		
		Menu menu=new Menu();
		
		menu=menurepo.findByItem(item);
		
		return menu;
		
	}


}
