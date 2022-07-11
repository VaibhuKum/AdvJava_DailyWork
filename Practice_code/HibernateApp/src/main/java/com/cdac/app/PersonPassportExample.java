package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cad.dao.PersonPassportDao;

import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		/*
		Person p = new Person();
		p.setName("vishal");
		p.setEmail("vishal@outlook");
		p.setDateOfBirth(LocalDate.of(1999, 5, 10));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2020, 10, 30));	
		ps.setExpiryDate(LocalDate.of(2030, 10, 30));
		ps.setIssuedBy("Govt. of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);*/
		
//		Person p = dao.fetchPersonByPassportNo(3);
//		System.out.println(p.getName()+" "+p.getEmail());
		
		List<Person> list = dao.fetchPersonsByPassportExpiryYear(2030);
		for(Person p : list)
			System.out.println(p.getName() + " " + p.getEmail());
	}
}
