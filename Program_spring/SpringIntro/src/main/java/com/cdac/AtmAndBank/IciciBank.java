package com.cdac.AtmAndBank;

import org.springframework.stereotype.Component;

@Component("icicibank-v2")
public class IciciBank implements Bank{
	
	
	public boolean isAccountPresent(int acno) {
		// TODO Auto-generated method stub
		if(acno == 2020202)
			return true;
		return false;
	}
	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Coustomer of IciciBank wants to withdraw money");

	}

	

}
