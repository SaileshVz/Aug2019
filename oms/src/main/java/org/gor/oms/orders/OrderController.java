package org.gor.oms.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping(value="/placeOrder")
	public Rorder createOrder(@RequestBody Rorder rorder){
		return orderService.createOrder(rorder);
	}

	@GetMapping(value="/orders/{orderId}")
	public Rorder retrieveOrder(@PathVariable String orderId){
		return orderService.retriveOrder(orderId);
	}
	
	@PutMapping(value="/orders/{id}")
	public String updateOrder(@PathVariable String id, @RequestBody Rorder rorder){
		 orderService.updateOrder(id, rorder);
		 return "Order with order Id ("+id+")successully updated.";
	}
	
	@DeleteMapping(value="/orders/{id}")
	public String deleteOrder(@PathVariable String id){
		orderService.deleteOrder(id);
		return "Order with order Id ("+id+")successully deleted.";
	}
	
	
	
	
	
	
	
}
