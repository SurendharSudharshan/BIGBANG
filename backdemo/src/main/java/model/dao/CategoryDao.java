package model.dao;

import java.util.List;

import model.entity.Category;

public interface CategoryDao {
	
	List<Category> list();
	
	Category get(int id);

}
