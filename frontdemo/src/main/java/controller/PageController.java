package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

import model.dao.CategoryDao;
import model.dao.ProductDAO;
import model.entity.Category;
import model.entity.Product;

@Controller
public class PageController {
	
	private static final Logger logger=LoggerFactory.getLogger(PageController.class);
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProductDAO productDAO;
	@RequestMapping(value = {"/", "/homepage", "/index"} )
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("template");
		mv.addObject("title", "Home");
		
		logger.info("Inside Page controller index method - info");
		logger.debug("Inside Page controller index method - debug");
		
		mv.addObject("UserClickHome", true);
		mv.addObject("categories",categoryDao.list());
		return mv;
		
	}
	
	@RequestMapping(value = "/about" )
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("template");
		mv.addObject("title", "About Us");
		mv.addObject("UserClickAbout", true);
		return mv;
		
	}
	
	@RequestMapping(value = "/contact" )
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("template");
		mv.addObject("title", "Contact Us");
		mv.addObject("UserClickContact", true);
		return mv;
		
	}
	
	//Methods to load all the products based on category
	
	@RequestMapping(value ="show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("template");
		mv.addObject("title", "All Products");
		mv.addObject("UserClickAllProducts", true);
		mv.addObject("categories",categoryDao.list());
		return mv;
		
	}
	
	
	
	@RequestMapping(value ="show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("template");
		
		//category Dao to fetch a single category
		
		Category category =null;
		category = categoryDao.get(id);
		
		
		mv.addObject("title", category.getName());
		
		mv.addObject("categories",categoryDao.list());
		//passing the single category
		mv.addObject("category",category);
		
		mv.addObject("UserClickCategoryProducts", true);
		
		return mv;
		
	}

	
	@RequestMapping(value="/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable int id) {
		
		ModelAndView mv=new ModelAndView("template");
		Product product= productDAO.get(id);
		product.setViews(product.getViews() + 1);
		//update the view count
		
		productDAO.update(product);
		
		
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		mv.addObject("userClickShowProduct",true);
		
		
		
		return mv;
		
	}
	

}
