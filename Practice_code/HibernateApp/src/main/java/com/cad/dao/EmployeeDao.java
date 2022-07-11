package com.cad.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Employee;

public class EmployeeDao {
	
	public void add(Employee emp) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	
	em.persist(emp); //persist method will generate insert query
	
	tx.commit();
	emf.close();
	}
	//Note : we use this find method by giving empno which is primary key and find the data related to that empno.  
	public Employee fetch(int empno) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, empno);
		//find method is used to find the data form table using only primary key
		emf.close();
		
		return emp;
	}
	
	public List<Employee> fetchAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e");//HQL : Hibernet query language / JPQL : java persistance query language
		List<Employee> list = q.getResultList();
		emf.close();
		
		return list;
	}
	
	public List<Employee> fetchAllBySalary(double salary){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e where e.salary >= :sal");//HQL : Hibernet query language / JPQL : 
		q.setParameter("sal",salary );
		List<Employee> list = q.getResultList();
		emf.close();
		
		return list;
	}
	
	
	public List<String> fetchAllNames(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e.name from Employee e");//HQL : Hibernet query language / JPQL :  
		List<String> list = q.getResultList();
		emf.close();
		
		return list;
	}
	
	public List<Object[]> fetchAllNamesAndSalaries(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e.name,e.salary from Employee e");//HQL : Hibernet query language / JPQL :  
		List<Object[]> list = q.getResultList();
		emf.close();
		
		return list;
	}
}
