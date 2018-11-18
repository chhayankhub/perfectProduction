package com.production.perfectProduction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admins")

public class Login {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name; 
	
	@Column(name="email")
	private String email; 
	
	@Column(name="password")
	private String password; 
	
	@Column(name="mobile")
	private String mobile; 
	

}
