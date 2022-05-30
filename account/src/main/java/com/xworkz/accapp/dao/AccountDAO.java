package com.xworkz.accapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import com.xworkz.accapp.bean.AccountBean;



public class AccountDAO {
	EntityManagerFactory entityManagerFactory;
	EntityManager em = null;
	EntityTransaction transaction=null;
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void saveData(AccountBean accountBean) {
		
		em = entityManagerFactory.createEntityManager();
		transaction=em.getTransaction();
		transaction.begin();
		
		em.persist(accountBean);
		transaction.commit();
	}
}
