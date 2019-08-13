package org.gor.oms.orders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rorders")
public class Rorder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	String id;
	int chairNo[];
	int tableNo [];
	List<Item> orderItems;
	String Status;
	Date createdDateTime;
	Date updatedDateTime;
	String createdBy;
	String updatedBy;
	
	Rorder(){}

	public Rorder(String id, int[] chairNo, int[] tableNo, List<Item> orderItems, String status, Date createdDateTime,
			Date updatedDateTime, String createdBy, String updatedBy) {
		super();
		this.id = id;
		this.chairNo = chairNo;
		this.tableNo = tableNo;
		this.orderItems = orderItems;
		Status = status;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int[] getChairNo() {
		return chairNo;
	}

	public void setChairNo(int[] chairNo) {
		this.chairNo = chairNo;
	}

	public int[] getTableNo() {
		return tableNo;
	}

	public void setTableNo(int[] tableNo) {
		this.tableNo = tableNo;
	}

	public List<Item> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Item> orderItems) {
		this.orderItems = orderItems;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "Rorder [id=" + id + ", chairNo=" + Arrays.toString(chairNo) + ", tableNo=" + Arrays.toString(tableNo)
				+ ", Status=" + Status + ", createdDateTime=" + createdDateTime + "]";
	}
	
	

}
