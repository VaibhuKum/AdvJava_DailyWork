package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarPart;
import com.cdac.component.CarPartsInventory;



public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts2");
		
		CarPart cp = new CarPart();
		cp.setPartName("seat");
		cp.setCarModel("BMW");
		cp.setPrice(1300);
		cp.setQuantity(30);
		
		long ms1 = System.currentTimeMillis();
		inv.addNewParts(cp);
		long ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
	}	
}
	
	
