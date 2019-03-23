package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.dao.CategoryDao;
import model.entity.Category;
import model.entity.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView showManageproducts() {
		
		ModelAndView mv=new ModelAndView("template");
		
		
		mv.addObject("title", "Manage Products");
		mv.addObject("userClickManageProducts", true);
		
		Product nProduct=new Product();
		//set few fields
		
		nProduct.setSupplierId(1);
		nProduct.setActive(true);
		mv.addObject("product", nProduct);
		
		
		
		
		return mv;
		
		
	}
	
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		return categoryDao.list();
	}
	
	
	

}
