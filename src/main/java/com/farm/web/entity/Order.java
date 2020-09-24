package com.farm.web.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Order {
	private int id; 
	private int memberId; 
	private String destination; 
	private Date regDate;
	private String payMethod;
    private Date payDDate; 
    private Date payCDate;
    private String deliveryMemo;
    private String status;

	
}
