package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("title", "Spring MVC");
        modelAndView.addObject("message", "Hello Spring MVC");
        modelAndView.addObject("message", "test git 1");
        modelAndView.addObject("message", "test git 2");
        modelAndView.addObject("message", "test git 3");
        return modelAndView;
    }
}
