package com.production.perfectProduction.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="orders")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public Order() {
		super();
		
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="user")
	private String user; 
	
	@Column(name="fabricator")
	private String fabricator; 
	
	@Column(name="client")
	private String client; 
	
	@Column(name="design")
	private String design; 
	
	@Column(name="rolls")
	private int rolls; 
	@Column(name="rolltype")
	private int rolltype; 
	
	@Column(name="status")
	private String status;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="product")
	private String product;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	@JsonFormat(pattern="dd-MMM-YYYY")
	private Date updated_at;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	private Date created_at;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFabricator() {
		return fabricator;
	}

	public void setFabricator(String fabricator) {
		this.fabricator = fabricator;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	
	public int getRolls() {
		return rolls;
	}

	public void setRolls(int rolls) {
		this.rolls = rolls;
	}

	public int getRolltype() {
		return rolltype;
	}

	public void setRolltype(int rolltype) {
		this.rolltype = rolltype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	} 
	
	
	
}
