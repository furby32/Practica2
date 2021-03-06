package com.ipn.webclient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alopeze
 */
@Controller
public class controller  {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView welcome()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    } 
    
    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView goodbyr()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "Goodbye my friend");

        return model;
    }
    
   
    
}
