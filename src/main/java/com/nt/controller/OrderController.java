package com.nt.controller;

import java.util.List;

import javax.validation.Valid;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Order;
import com.nt.service.OrderService;

@RestController
@RequestMapping("/ord")
public class OrderController {

	      @Autowired
	      private OrderService service;
	      
	      @PostMapping("/order")
	      public Order createOrder(@RequestBody Order order) {
	    	  return service.saveOrder(order);
	      }
	      
	      @GetMapping("/ordlist")
	      public List<Order> getAllOrder(){
	    	  return service.findall();
	      }
	      
	      @GetMapping("/order/{orderid}")
	      public ResponseEntity<Order> findById(@PathVariable("orderid") int orderid){
	    	  Order order=service.findone(orderid);
	    	  if(order==null) {
	    		  return ResponseEntity.notFound().build();
	    	  }else {
	    		  return ResponseEntity.ok().body(order);
	    	  }
	      }
	      
	      @PutMapping("ord/{orderid}")
	      public ResponseEntity<Order> updateOrder(@PathVariable("orderid") int orderid,@Valid @RequestBody Order orddetail){
	    	  Order order=service.findone(orderid);
	    	  if(order==null) {
	    		    return ResponseEntity.notFound().build();
	    	  }else {
				 order.setOrderid(orddetail.getOrderid());
				 order.setOrderprodname(orddetail.getOrderprodname());
				order.setCustname(orddetail.getCustname());
				 Order ord=service.saveOrder(order);
				 return ResponseEntity.ok().body(ord);
			}
	    	  
	    	  }
	      @DeleteMapping("/ord/{orderid}")
    	  public ResponseEntity<Order> deleteOrder(@PathVariable("orderid") int orderid1){
    		  Order ord=service.findone(orderid1);
    		  if(ord==null) {
	    		    return ResponseEntity.notFound().build();
	    	  }else {
	    		  service.delete(orderid1);
	    		  return ResponseEntity.ok().build();
	    	  }
	      }
	      
}
