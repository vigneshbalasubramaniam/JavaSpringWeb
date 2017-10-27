/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    
@RequestMapping(value="/loginForm", method=RequestMethod.GET)
    public ModelAndView login()
    {
        return new ModelAndView("loginForm","command",new Login());
    }
 @RequestMapping(value="/viewUser", method=RequestMethod.POST)
 public String viewUser(@ModelAttribute("web") Login login,ModelMap model)
         {
             model.addAttribute("username",login.getUsername());
             model.addAttribute("password",login.getPassword());
             return "result";
         }
 
}
