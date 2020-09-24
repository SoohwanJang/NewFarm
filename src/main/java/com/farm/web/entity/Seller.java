package com.farm.web.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Seller {
	
	private int id;
	private String uid;
	private String pwd;
	private String comName;
	private int brn;
	private String staffName;
	private String telephone;
	private String phone;
	private String email;
	private String sellingUrl;
	private String titleImage;
	private Date regDate;
	private Date acpDate;
	private int enabled;

}
