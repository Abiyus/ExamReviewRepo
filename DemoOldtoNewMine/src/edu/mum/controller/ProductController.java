package edu.mum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.domain.Product;



@Controller
public class ProductController  {

    

    @RequestMapping(value={"/","product_input.action"}, method=RequestMethod.GET)
    public ModelAndView handleRequest() throws Exception{
    	System.out.println("AIMA INNNNNNNNN!");
    	ModelAndView mav=new ModelAndView("ProductForm");
    	return mav;
    }
    
   // @RequestMapping(value={"product_save.action"}, method=RequestMethod.POST)
    //public ModelAndView handleRequest(Product product) throws Exception {
               

      //  return new ModelAndView("ProductDetails", "product",product);
    //}
    
    @RequestMapping(value={"product_save.action"}, method=RequestMethod.POST)
    public String handleRequest(Product product, RedirectAttributes rd) throws Exception {
               
    	rd.addFlashAttribute(product);
        return "redirect:details";
    }
    
    @RequestMapping(value={"detail"}, method=RequestMethod.GET)
    public ModelAndView handlePRG( ) throws Exception {
               
    	
        return new ModelAndView("ProductDetails");
    }

}
