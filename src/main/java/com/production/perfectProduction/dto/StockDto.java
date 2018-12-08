package com.production.perfectProduction.dto;

import org.springframework.web.multipart.MultipartFile;

public class StockDto {
	String fabric;
	String colour;
	String roll_length;
	String rolls;
	String remark;
	MultipartFile fimage;
	
	public String getRolls() {
		return rolls;
	}
	public void setRolls(String rolls) {
		this.rolls = rolls;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getRoll_length() {
		return roll_length;
	}
	public void setRoll_length(String roll_length) {
		this.roll_length = roll_length;
	}
	public MultipartFile getFimage() {
		return fimage;
	}
	public void setFimage(MultipartFile fimage) {
		this.fimage = fimage;
	}
	
	public String getFimageName() {
		return fimage.getOriginalFilename();
	}

}
