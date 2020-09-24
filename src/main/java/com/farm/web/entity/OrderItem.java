package com.farm.web.entity;

import java.util.Date;

import lombok.Data;

@Data
public class OrderItem {
   
   private int id; 
   private int orderId; 
   private int itemId; 
   private int deliveryId; 
   private int qty; 
   private String status; 
   private String waybillNum;

   


 
   
}