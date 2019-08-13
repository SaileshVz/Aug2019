package org.gor.obms.bill;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bills")
public class Bill implements Serializable {
	
	@Id	
	String id;
	String orderId;
	List<Item> orderItems;
	List<BillItem> billItems;
	double totalAmount;
	
	Bill(){}
	
	

	public Bill(String id, String orderId, List<Item> orderItems, List<BillItem> billItems, double totalAmount) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.orderItems = orderItems;
		this.billItems = billItems;
		this.totalAmount = totalAmount;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	
	public List<Item> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Item> orderItems) {
		this.orderItems = orderItems;
	}

	public List<BillItem> getBillItems() {
		return billItems;
	}



	public void setBillItems(List<BillItem> billItems) {
		this.billItems = billItems;
	}



	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", orderId=" + orderId + ", totalAmount=" + totalAmount + "]";
	}
	
	
	

}
