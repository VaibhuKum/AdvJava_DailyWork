package com.cdac.AtmAndBank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("hdfcAtm-v2")
public class HdfcAtm implements Atm {
	
	@Autowired
	private List<Bank> banks;
	
	public void withdraw(int acno, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Coustomer at HDFC atm having money");
		Bank currentBank = null;
		for(Bank bank : banks) {
			if(bank.isAccountPresent(acno)) {
				currentBank = bank;
				break;
			}
		}
		currentBank.withdraw(acno,amount);
	}

}
