package com.nt.service;

import java.util.List;

import com.nt.dto.OrderRequest;
import com.nt.dto.OrderResponse;
import com.nt.model.Order;

public interface OrderService {

	   public Order saveOrder(Order order);
	   public List<Order> findall();
	   public Order findone(int prodid);
	   public void delete(int prodid);
	   public OrderResponse checkoutOrder(OrderRequest order);
}
