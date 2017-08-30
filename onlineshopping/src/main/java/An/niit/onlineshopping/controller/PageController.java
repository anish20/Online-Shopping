package An.niit.onlineshopping.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
    	
    	ModelAndView mav =new ModelAndView("page");
    	mav.addObject("title","Home");
    	mav.addObject("userClickHome",true);
    	return mav;
		
	}
    
    @RequestMapping(value= "/about")
   	public ModelAndView about() {
       	
       	ModelAndView mav =new ModelAndView("page");
       	mav.addObject("title","About Us");
       	mav.addObject("userClickAbout",true);
       	return mav;
   		
   	}
    
    @RequestMapping(value= "/contact")
   	public ModelAndView contact() {
       	
       	ModelAndView mav =new ModelAndView("page");
       	mav.addObject("title","Contact Us");
       	mav.addObject("userClickContact",true);
       	return mav;
   		
   	}
	
	//This is not part of my project..its dummy..
   /* @RequestMapping(value= "/test")
     public ModelAndView test(@RequestParam(value="greeting",required=false )String greeting) { 
    	 if(greeting==null) { 
    		 greeting="Hello! there";
    	 }
    	ModelAndView mav =new ModelAndView("page");
    	mav.addObject("greeting",greeting);
    	return mav;
		
}*/
  /*  @RequestMapping(value= "/test/{greeting}")
    public ModelAndView test(@PathVariable (value="greeting",required=false )String greeting) { 
   	 if(greeting==null) { 
   		 greeting="Hello! there";
   	 }
   	ModelAndView mav =new ModelAndView("page");
   	mav.addObject("greeting",greeting);
   	return mav;
		
}*/
	
}
