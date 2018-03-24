package com.gusto.serviceinfosystem.controller;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gusto.serviceinfosystem.bean.ServiceInfoSystemBean;
import com.gusto.serviceinfosystem.dao.ServiceInfoSystemDao;


@Controller
public class ServiceinfoSystemController {
	@Autowired
	ServiceInfoSystemDao dao;

	@RequestMapping("/index")
	public ModelAndView viewindex(ModelAndView model) {
		model.setViewName("index");
		return model;

	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveContact(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		String username=request.getParameter("d_name");
		String email=request.getParameter("d_email");
		String password=request.getParameter("d_password");
		ServiceInfoSystemBean sisb =new ServiceInfoSystemBean();
		sisb.setD_name(username);
		sisb.setD_email(email);
		sisb.setD_password(password);
		ModelAndView model=new ModelAndView();
		 dao.saveOrUpdate(sisb);
		 ServiceInfoSystemBean loginvalidate=dao.loginValidate(sisb);
		 String userid=loginvalidate.getD_id();
		 String session_username=loginvalidate.getD_name();
		 
		 HttpSession session = request.getSession(true);
		 session.setAttribute("userid",userid);
		 session.setAttribute("session_username",session_username);
	
		 return new ModelAndView("redirect:/welcome");
		
	}
	
	@RequestMapping("/welcome")
	public ModelAndView viewelcome(ModelAndView model) {
		model.setViewName("welcome");
		return model;
		
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView loginValidate(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("ServiceInfoSystemBean") ServiceInfoSystemBean sisb) throws IOException {
		
		ModelAndView mav = null;
		  
			String username=request.getParameter("dname");
			String password=request.getParameter("pwd");
			sisb.setD_name(username);
			sisb.setD_password(password);
			
		ServiceInfoSystemBean loginvalidate=dao.loginValidate(sisb);
		
		 if(null != loginvalidate){
			 String userid=loginvalidate.getD_id();
			 String session_username=loginvalidate.getD_name();
			 
			 HttpSession session = request.getSession(true);
			 session.setAttribute("userid",userid);
			 session.setAttribute("session_username",session_username);
				mav=new ModelAndView("redirect:/welcome");
			}else{
				 mav = new ModelAndView("index");
				    mav.addObject("msg", "<span style='color:red'>Username or Password is wrong!!</span>");
			}
			
		
		return mav;
	}
	@RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
       
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return "redirect:index";
    }
	@RequestMapping("/registar")
	public ModelAndView vieregistar(ModelAndView model) {
		model.setViewName("registar");
		return model;
		
	}
	
}
