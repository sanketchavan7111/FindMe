package career.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		//logger.info("Inside page controller index method  this is for Info");
		//logger.debug("Inside page controller index method  this is for debug");
		//mv.addObject("categories", categoryDAO.list());
		//mv.addObject("userClickHome", true);
		return mv;
		
	}

	
}
