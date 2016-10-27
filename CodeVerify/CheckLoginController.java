package com.ow.appmg.controller.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ow.appmg.dao.UserMapperDao;
import com.ow.appmg.entity.User;

@Controller
@RequestMapping("/login")
public class CheckLoginController {
	@Resource
	private UserMapperDao dao;
	public void setDao(UserMapperDao dao) {
		this.dao = dao;
	}
	@RequestMapping("/login")
	public String login(
		User user,Model model,
		HttpSession session){
		//检查验证码
		String scode = (String) 
			session.getAttribute("scode");
		System.out.println("user"+user.getUsername());
		System.out.println("用户输入:"+user.getCode());
		System.out.println("Session:"+scode);
		//不区分大小写
//		if(!user.getCode().toUpperCase().equals(scode.toUpperCase())){
//			//验证码错误
//			model.addAttribute("code_error", "验证码错误");
//			return "login";
//		}
//		//检查账号和密码
//		User info = 
//			dao.findByUsernameAndPwd(user);
//		if(info != null){//有记录直接在数据库中查询
//			session.setAttribute(
//				"user", info.getUsername());
//			return "index";//进入index.jsp
//		}else{//无记录,错误
//			model.addAttribute(
//				"error", "用户名或密码不正确");
//			return "login";//进入login.jsp
//		}
		return "index";
	}
}


