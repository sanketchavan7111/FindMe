package career.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/FindMe/","/FindMe"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		//logger.info("Inside page controller index method  this is for Info");
		//logger.debug("Inside page controller index method  this is for debug");
		//mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
		
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","About");
	mv.addObject("userClickAbout",true);
	return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Contact");
	mv.addObject("userClickContact",true);
	return mv;
	}
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView viewp()
	{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","View Product");
	mv.addObject("userClickView",true);
	return mv;
	}
	
	@RequestMapping(value="/manage/products")
	public ModelAndView managep()
	{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Manage Product");
	mv.addObject("userClickManageProduct",true);
	return mv;
	}

	
	
}
