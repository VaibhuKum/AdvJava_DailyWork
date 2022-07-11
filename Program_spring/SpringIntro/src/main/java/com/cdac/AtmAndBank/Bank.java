package com.cdac.AtmAndBank;

public interface Bank {
	
	public boolean isAccountPresent(int acno);
	public void withdraw(int acno, double amount);
}
