package model.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.dao.CategoryDao;
import model.entity.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
     private static List<Category> categories=new ArrayList<>();
     
     static {
    	  
    	 Category category=new Category();
    	 category.setId(1);
    	 category.setName("Smartphones");
    	 category.setDescription("Some description for Smartphones");
    	 category.setImageURL("cat1.png");
    	 
    	 categories.add(category);
    	 
    	 category=new Category();
    	 category.setId(2);
    	 category.setName("Laptops");
    	 category.setDescription("Some description for Laptops");
    	 category.setImageURL("cat2.png");
    	 
    	 categories.add(category);
    	 
    	 category=new Category();
    	 category.setId(3);
    	 category.setName("Camera");
    	 category.setDescription("Some description for Cameras");
    	 category.setImageURL("cat3.png");
    	 
    	 categories.add(category);
    	 
    	 
    	 
     }
     
     
     
	@Override
	public List<Category> list() {
		
		return categories;
	}
	
	
	

}
