package com.Hibernate.backdemo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.dao.CategoryDao;
import model.entity.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDao categoryDao;
	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("model");
		context.refresh();

		categoryDao = (CategoryDao) context.getBean("categoryDao");

	}

	/*
	 * @Test public void testAddCategory() { category = new Category();
	 * category.setName("Laptop"); category.setDescription("Some des laptop");
	 * category.setImageURL("cat105.png");
	 * assertEquals("Successfully added a category",true,categoryDao.add(category));
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetCategory() { category = categoryDao.get(2);
	 * assertEquals("Successfully fetched single category from the tacle","Laptop",
	 * category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() { category = categoryDao.get(2);
	 * 
	 * category.setName("Notebook");
	 * assertEquals("Successfully updated single category in the tacle",true,
	 * categoryDao.update(category)); }
	 */
	/*
	 * @Test public void testDeleteCategory() { category = categoryDao.get(2);
	 * 
	 * category.setName("Notebook");
	 * assertEquals("Successfully updated single category in the table",true,
	 * categoryDao.delete(category)); }
	 */
	/*
	 * @Test public void testListCategory() {
	 * 
	 * 
	 * 
	 * assertEquals("Successfully fetched list of categories from the table",1,
	 * categoryDao.list().size()); }
	 */

	@Test
	public void testCRUDCategory() {

		category = new Category();
		category.setName("Laptop");
		category.setDescription("Some des laptop");
		category.setImageURL("cat1.png");
		assertEquals("Successfully added a category", true, categoryDao.add(category));

		category = new Category();
		category.setName("Television");
		category.setDescription("Some des television");
		category.setImageURL("cat2.png");
		assertEquals("Successfully added a category", true, categoryDao.add(category));

		// fetching and updating the category
		category = categoryDao.get(2);
		category.setName("Notebook");
		assertEquals("Successfully updated single category in the tacle", true, categoryDao.update(category));

		assertEquals("Successfully deleted single category in the table", true, categoryDao.delete(category));

		assertEquals("Successfully fetched list of categories from the table", 1, categoryDao.list().size());
	}

}
