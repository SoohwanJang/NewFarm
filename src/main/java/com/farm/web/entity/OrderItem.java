package com.farm.web.entity;

public class OrderItem {
   
   private int id; 
   private int orderId; 
   private int itemId; 
   private int deliveryId; 
   private int qty; 
   private String status; 
   private String waybillNum;

   public OrderItem() {
	// TODO Auto-generated constructor stub
   }

	public OrderItem(int id, int orderId, int itemId, int deliveryId, int qty, String status, String waybillNum) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.itemId = itemId;
		this.deliveryId = deliveryId;
		this.qty = qty;
		this.status = status;
		this.waybillNum = waybillNum;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public int getDeliveryId() {
		return deliveryId;
	}
	
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getWaybillNum() {
		return waybillNum;
	}
	
	public void setWaybillNum(String waybillNum) {
		this.waybillNum = waybillNum;
	}
	
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", itemId=" + itemId + ", deliveryId=" + deliveryId
				+ ", qty=" + qty + ", status=" + status + ", waybillNum=" + waybillNum + "]";
	}
	   
	   
   
}