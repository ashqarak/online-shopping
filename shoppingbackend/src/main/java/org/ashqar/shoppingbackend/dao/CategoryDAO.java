package org.ashqar.shoppingbackend.dao;

import java.util.List;

import org.ashqar.shoppingbackend.dto.Category;


public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
