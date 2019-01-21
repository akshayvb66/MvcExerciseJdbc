package com.stackroute.controller;


import com.stackroute.configuration.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    CrudOperation operation = new CrudOperation();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("info", "command", new User());

    }

    @RequestMapping(value = "/userinfo", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("MvcJdbc")User user, ModelMap model) {
        model.addAttribute("name", user.getName());
      operation.insertUser(user.getName(),user.getPassword());
        return "login";
    }

}
