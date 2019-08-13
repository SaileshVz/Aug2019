package org.gor.oms.orders;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Rorder createOrder(Rorder rorder) {		
		return orderRepository.save(rorder);
	}

	@Override
	public Rorder retriveOrder(String orderId) {
		Optional<Rorder> rOrder = orderRepository.findById(orderId);
		return rOrder.get();
	}

	@Override
	public Rorder updateOrder(String orderId, Rorder rorder) {
		return orderRepository.save(rorder);		
	}

	@Override
	public Rorder deleteOrder(String orderId) {
		Optional<Rorder> rOrder = orderRepository.findById(orderId);
		orderRepository.deleteById(orderId);
		return rOrder.get();
	}
	
		

}
