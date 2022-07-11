package com.cad.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cdac.entity.Adderss;
import com.cdac.entity.Customer;
import com.cdac.entity.Employee;

public class CustomerAddressDao {

	public void add(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	public void update(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(cust); //merge method will generate update query
		
		tx.commit();
		emf.close();
	}
	
	public Customer fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Customer emp = em.find(Customer.class, id);
		//find method is used to find the data form table using only primary key
		emf.close();
		
		return emp;
	}

	public void add(Adderss addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public Adderss fetchAdderss(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Adderss addr = em.find(Adderss.class, id);
		//find method is used to find the data form table using only primary key
		emf.close();
		
		return addr;
	}

}

