package com.cdac.component;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank{

	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Coustomer of citibank wants to withdraw money");

	}

}
