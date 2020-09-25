package com.farm.web.entity;

import java.util.Date;
	

public class Seller {
	
	private int id;
	private String uid;
	private String pwd;
	private String comName;
	private int brn;
	private String repName;
	private String staffName;
	private String telephone;
	private String phone;
	private String email;
	private String address;
	private String sellingUrl;
	private String titleImage;
	private Date regDate;
	private Date acpDate;
	private int enabled;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(int id, String uid, String pwd, String comName, int brn, String repName, String staffName,
			String telephone, String phone, String email, String address, String sellingUrl, String titleImage,
			Date regDate, Date acpDate, int enabled) {
		super();
		this.id = id;
		this.uid = uid;
		this.pwd = pwd;
		this.comName = comName;
		this.brn = brn;
		this.repName = repName;
		this.staffName = staffName;
		this.telephone = telephone;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.sellingUrl = sellingUrl;
		this.titleImage = titleImage;
		this.regDate = regDate;
		this.acpDate = acpDate;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public int getBrn() {
		return brn;
	}

	public void setBrn(int brn) {
		this.brn = brn;
	}

	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSellingUrl() {
		return sellingUrl;
	}

	public void setSellingUrl(String sellingUrl) {
		this.sellingUrl = sellingUrl;
	}

	public String getTitleImage() {
		return titleImage;
	}

	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getAcpDate() {
		return acpDate;
	}

	public void setAcpDate(Date acpDate) {
		this.acpDate = acpDate;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", uid=" + uid + ", pwd=" + pwd + ", comName=" + comName + ", brn=" + brn
				+ ", repName=" + repName + ", staffName=" + staffName + ", telephone=" + telephone + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", sellingUrl=" + sellingUrl + ", titleImage="
				+ titleImage + ", regDate=" + regDate + ", acpDate=" + acpDate + ", enabled=" + enabled + "]";
	}
	
	

}
