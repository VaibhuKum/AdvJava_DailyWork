package com.cdac.AtmAndBank;

import org.springframework.stereotype.Component;

@Component("citibank-v2")
public class CitiBank implements Bank{
	
	
	public boolean isAccountPresent(int acno) {
		// TODO Auto-generated method stub
		if(acno == 1010101)
			return true;
		return false;
	}
	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Coustomer of citibank wants to withdraw money");

	}

	

}
