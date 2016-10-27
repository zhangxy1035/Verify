package com.ow.appmg.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8088/tianmao/login/toLogin.from
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "login";//½øÈëlogin/login.jsp
	}

}
