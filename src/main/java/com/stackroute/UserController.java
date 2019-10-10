package com.stackroute;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController
    {
        @RequestMapping("/login")
        public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
            {
                String username= request.getParameter("username");
                String password=request.getParameter("password");
                ModelAndView mv=new ModelAndView();
                mv.setViewName("display");
                User u = new User(username,password);
                mv.addObject("username",username);
                mv.addObject("passwordd",password);
                return mv;
            }
    }
