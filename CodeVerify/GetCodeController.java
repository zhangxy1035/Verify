package com.ow.appmg.controller.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class GetCodeController {
	
	@RequestMapping("/getCode")
	public void execute(
		HttpServletResponse response,
		HttpSession session) throws Exception{
		//0.创建空白图片
		BufferedImage image = new BufferedImage(100,30,BufferedImage.TYPE_INT_RGB);
		//1.获取图片画笔
		Graphics g = image.getGraphics();
		Random r = new Random();
		//2.设置画笔颜色
		g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
		//3.绘制矩形的背景
		g.fillRect(0, 0, 100, 30);	
		//4.调用自定义的方法，获取长度为5的字母数字组合的字符串
		String number = getNumber(5);	
		//将图片字符存入session,用于验证码检查使用
		session.setAttribute("scode", number);
		g.setColor(new Color(0,0,0));
		g.setFont(new Font(null,Font.BOLD,24));
		//5.设置颜色字体后，绘制字符串
		g.drawString(number, 5, 25);
		//6.绘制8条干扰线
		for(int i=0;i<8;i++){
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100), r.nextInt(30));
		}
		response.setContentType("image/jpeg");
		OutputStream ops = response.getOutputStream();
		ImageIO.write(image, "jpeg", ops);
		ops.close();
	}
	
	private String getNumber(int size){
		String str = "qwertyuioplkjhgfdsazxcvbnmABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String number = "";
		Random r = new Random();
		for(int i=0;i<size;i++){
			number+=str.charAt(r.nextInt(str.length()));
		}
		return number;
	}
}
