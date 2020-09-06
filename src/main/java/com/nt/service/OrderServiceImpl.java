package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.nt.dto.OrderRequest;
import com.nt.dto.OrderResponse;
import com.nt.model.Order;
import com.nt.notification.NotificationUtil;
import com.nt.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo repo;
	
	@Override
	public Order saveOrder(Order order) {
		return repo.save(order);
	}

	public List<Order> findall(){
		return repo.findAll();
	}

	@Override
	public Order findone(int prodid) {
		 Optional<Order> ord=repo.findById(prodid);
		return ord.get();
	}

	@Override
	public void delete(int prodid) {
		  repo.deleteByOrderId(prodid);
		  return;
	}

	@Override
	public OrderResponse checkoutOrder(OrderRequest order) {
        String message=NotificationUtil.sendEmail(order.getEmailId());
		return new OrderResponse(order,message,HttpStatus.OK.value());
	}



	
	
	
}
