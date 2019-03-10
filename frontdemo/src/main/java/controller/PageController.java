package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.dao.CategoryDao;

@Controller
public class PageController {
	@Autowired
	private CategoryDao categoryDao;
	@RequestMapping(value = {"/", "/homepage", "/index"} )
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("template");
		mv.addObject("title", "Home");
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
	
	

}
