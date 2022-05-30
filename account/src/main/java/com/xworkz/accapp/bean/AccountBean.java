package com.xworkz.accapp.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="account")
public class AccountBean {
	@Id
	@Column(name="account_number")
	private long accountNo;
	@Column(name="account_type")
	private String accountType;
	
	

}
