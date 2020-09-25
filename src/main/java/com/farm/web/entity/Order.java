package com.farm.web.entity;

import java.util.Date;

import lombok.Data;


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

    public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, int memberId, String destination, Date regDate, String payMethod, Date payDDate, Date payCDate,
			String deliveryMemo, String status) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.destination = destination;
		this.regDate = regDate;
		this.payMethod = payMethod;
		this.payDDate = payDDate;
		this.payCDate = payCDate;
		this.deliveryMemo = deliveryMemo;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public Date getPayDDate() {
		return payDDate;
	}

	public void setPayDDate(Date payDDate) {
		this.payDDate = payDDate;
	}

	public Date getPayCDate() {
		return payCDate;
	}

	public void setPayCDate(Date payCDate) {
		this.payCDate = payCDate;
	}

	public String getDeliveryMemo() {
		return deliveryMemo;
	}

	public void setDeliveryMemo(String deliveryMemo) {
		this.deliveryMemo = deliveryMemo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", memberId=" + memberId + ", destination=" + destination + ", regDate=" + regDate
				+ ", payMethod=" + payMethod + ", payDDate=" + payDDate + ", payCDate=" + payCDate + ", deliveryMemo="
				+ deliveryMemo + ", status=" + status + "]";
	}
    
    
	
}
