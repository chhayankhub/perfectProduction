package com.production.perfectProduction.dto;

import org.springframework.web.multipart.MultipartFile;

public class OrderDto {
	String fabricator;
	String client;
	String product;
	String rolltype;
	int rolls;
	MultipartFile design;
	String remark;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFabricator() {
		return fabricator;
	}
	public void setFabricator(String fabricator) {
		this.fabricator = fabricator;
	}
	public String getRolltype() {
		return rolltype;
	}
	public void setRolltype(String rolltype) {
		this.rolltype = rolltype;
	}
	public int getRolls() {
		return rolls;
	}
	public void setRolls(int rolls) {
		this.rolls = rolls;
	}
	public MultipartFile getDesign() {
		return design;
	}
	public void setDesign(MultipartFile design) {
		this.design = design;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getDesignName() {
		return design.getOriginalFilename();
	}
	
	
	
	

}
