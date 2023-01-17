package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//������ �����ϴ� ���ҽ��� ����(��Ʈ����) ,�������ҽ���(js.css.html) �ִ� . 

@Controller
public class TwoDice {
	@RequestMapping("/rollDice")
	public void main(HttpServletResponse response)throws IOException {
		int idx1=(int)(Math.random()*6)+1;
		int idx2=(int)(Math.random()*6)+1;
		
		
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<img src='resources/img/dice"+idx1+".jpg'>");
		writer.println("<img src='resources/img/dice"+idx2+".jpg'>");
				
		writer.println("</body>");
		writer.println("</html>");
	}
}
