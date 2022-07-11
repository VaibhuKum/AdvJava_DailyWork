package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import com.cad.dao.EmployeeDao;
import com.cdac.entity.Employee;

public class InsertEmployee {
	
	public static void main(String[] args) {
		// Note : we give hardcode input to get output
		/*
		Employee emp = new Employee();
		emp.setEmpno(1003);
		emp.setName("Vaibhav D");
		emp.setSalary(12000);
		emp.setDateOfJoining(LocalDate.of(2010, 11, 01));
		
		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);*/
		
		
		//Note : we give only empno and fetch data from table
		/*
		EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.fetch(1001);
		System.out.println(emp.getName()+" "+emp.getSalary());*/
		
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list = dao.fetchAll();
		for(Employee emp : list)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		
		System.out.println("------------------------");
		List<Employee> list2 = dao.fetchAllBySalary(12000);
		for(Employee emp : list2)
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());
		
		/*
		System.out.println("------------------------");
		List<String> names = dao.fetchAllNames();
		for(String name : names)
			System.out.println(name);
		
		System.out.println("------------------------");
		List<Object[]> namesAndSalaries = dao.fetchAllNamesAndSalaries();
		for(Object[] arr : namesAndSalaries) 
			System.out.println(arr[0]+" "+arr[1]);
		*/
		
	}
	//Note : we can write insert and display code saperatly or in a single program like downside code
	/*public static void main(String[] args) {
		//During this step, the persistence.xml file will be read
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(1001);
		emp.setName("Vishal");
		emp.setSalary(13000);
		emp.setDateOfJoining(LocalDate.of(2020, 11, 01));
		em.persist(emp); //persist method will generate insert query
		
		tx.commit();
		
		emf.close();
	}*/
}