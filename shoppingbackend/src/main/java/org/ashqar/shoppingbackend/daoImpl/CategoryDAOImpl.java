package org.ashqar.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.ashqar.shoppingbackend.dao.CategoryDAO;
import org.ashqar.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		
		Category category = new Category();
		//First Category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is the description for televesion");
		category.setImageURL("CAT_1.png");		
		categories.add(category);
		
		//Second Category
		category = new Category();
		category.setId(2);
		category.setName("HomePhone");
		category.setDescription("This is the description for mobile");
		category.setImageURL("CAT_2.png");		
		categories.add(category);
		
		//Third Category
		category = new Category();
		category.setId(3);
		category.setName("Internet");
		category.setDescription("This is the description for Laptop");
		category.setImageURL("CAT_3.png");		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {		
		
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		
		for(Category category : categories) {
			
			if(category.getId() == id)
			
			return category;
		}
		return null;
	}

}
