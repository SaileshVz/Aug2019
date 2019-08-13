package org.gor.obms.bill;

public class Item {
	
	String itemId;
	int quantity;
	String itemStatus;
	
	Item(){}

	public Item(String itemId, int quantity, String itemStatus) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.itemStatus = itemStatus;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", quantity=" + quantity + ", itemStatus=" + itemStatus + "]";
	}
	
	

}
