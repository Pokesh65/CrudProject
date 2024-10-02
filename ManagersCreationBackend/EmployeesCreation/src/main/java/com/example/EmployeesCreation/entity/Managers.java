package com.example.EmployeesCreation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Managers {

	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPagerNo() {
		return pagerNo;
	}
	public void setPagerNo(String pagerNo) {
		this.pagerNo = pagerNo;
	}
	public String getTelPhoneNo() {
		return telPhoneNo;
	}
	public void setTelPhoneNo(String telPhoneNo) {
		this.telPhoneNo = telPhoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long managerId;
	private String managerName;
	private String role;
	private String address1;
	private String address2;
	private String mobileNo;
	private String pagerNo;
	private String telPhoneNo;
	private String emailId;
	
}
