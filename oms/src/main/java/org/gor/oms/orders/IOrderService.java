package org.gor.oms.orders;

public interface IOrderService {
	
	
	Rorder createOrder(Rorder rorder);
	
	Rorder retriveOrder(String orderId);
	
	Rorder updateOrder(String orderId, Rorder rorder);
	
	Rorder deleteOrder(String orderId);
	
	

}
