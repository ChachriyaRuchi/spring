package com.xworkz.accapp.runner;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.accapp.bean.AccountBean;
import com.xworkz.accapp.dao.AccountDAO;


public class Runner {
	
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
		//DbApplication application=container.getBean(DbApplication.class);
		AccountBean accountBean=new AccountBean();
		accountBean.setAccountNo(112324354);
		accountBean.setAccountType("Savings");
		AccountDAO dao=container.getBean(AccountDAO.class);
		dao.saveData(accountBean);
		
	}

}
