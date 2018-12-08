package com.production.perfectProduction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="fabric")
	private String fabric; 
	
	@Column(name="fimage")
	private String fimage; 
	
	@Column(name="colour")
	private String colour;
	
	@Column(name="roll_length")
	private String roll_length; 
	
	@Column(name="rolls")
	private String rolls; 
	
	@Column(name="remark")
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public String getRolls() {
		return rolls;
	}

	public void setRolls(String rolls) {
		this.rolls = rolls;
	}
	


	public String getRoll_length() {
		return roll_length;
	}

	public void setRoll_length(String roll_length) {
		this.roll_length = roll_length;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFimage() {
		return fimage;
	}

	public void setFimage(String fimage) {
		this.fimage = fimage;
	}  

	
}
