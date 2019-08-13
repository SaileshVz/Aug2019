package org.gor.obms.bill;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/bills/{orderId}", method = RequestMethod.GET)
	public Bill getBill(String orderId){
		
		HttpHeaders header = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(header);
		//String uri= "http://localhost:8084/orders/"+orderId;
		String uri= "http://EUREKCLIENTOMS/orders/"+orderId;		
		
		Rorder ordr = restTemplate.exchange(uri, HttpMethod.GET, entity, Rorder.class).getBody();
		
		List<Item> orderItems = ordr.getOrderItems();
		
		Bill bill = new Bill();
		bill.setId(orderId+"_01");
		bill.setOrderId(orderId);
		bill.setOrderItems(orderItems);		
		List<BillItem> billItems = new ArrayList<BillItem>();
		double totAmt=0.0;
		for (Item item :orderItems)  {
			BillItem  billItem = new BillItem();
			billItem.setItemId(item.getItemId());
			billItem.setQuantity(item.getQuantity());
			billItem.setPrice(12.75);
			billItem.setItemName(item.getItemId());
			double amt = billItem.getQuantity()*billItem.getPrice();
			billItem.setAmount(amt);			
			billItems.add(billItem);			
			totAmt = totAmt+amt;			
		};
		
		bill.setBillItems(billItems);
		bill.setTotalAmount(totAmt);		
		return bill;		
	}

}
