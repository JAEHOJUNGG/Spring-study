package com.fastcampus.ch2;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//년원일을 입력하면 요일을 알려주는 프로그램 
@Controller
public class YoilTeller {
	@RequestMapping("getYoil")
	public  void main(HttpServletRequest request) {
		//1. 입력
	String year=request.getParameter("year");
			
	String month=request.getParameter("month");
	String day=request.getParameter("day");
	
	int yyyy=Integer.parseInt(year);
	int mm= Integer.parseInt(month);
	int dd =Integer.parseInt(day);
	
	//2.작업
	Calendar cal=Calendar.getInstance();
	cal.set(yyyy, mm-1,dd);
		
	int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);//1: 일요일 , 2:월요일
	char yoil=" 일월화수목금토".charAt(dayOfWeek);
	
	//3.출력
	System.out.println(year+"년 "+month +"월"+day+"일은");
	System.out.println(yoil+"요일입니다.");
	
	
	}

}
