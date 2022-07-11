package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.AtmAndBank.Atm;
import com.cdac.component.Car;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.LoginService;
import com.cdac.component.SpellChecker;
import com.cdac.component.TextEditor;
import com.cdac.component.calculater;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//accessing a perticular bean
//		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
//		System.out.println(hw.sayHello("vaibhav"));
//		
//		calculater clc = (calculater) ctx.getBean("calc");
//		System.out.println(clc.add(10, 20));
//		System.out.println(clc.sub(50, 20));
//		System.out.println(clc.mul(10, 20));
		
		CurrencyConverter cc = (CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD","INR", 650));
		
		LoginService ls = (LoginService) ctx.getBean("loginserv");
		System.out.println(ls.isValidUser("vaibhav", "123"));
		
		TextEditor sc = (TextEditor) ctx.getBean("txtEdtr");
		sc.load("abc.txt");
		
		Car C = (Car) ctx.getBean("car");
		C.drive();
		
		Atm atm =(Atm) ctx.getBean("hdfcAtm-v2");
		atm.withdraw(2020202, 5000);
		
		
	}
}
