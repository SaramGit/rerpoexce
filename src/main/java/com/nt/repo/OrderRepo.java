package com.nt.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nt.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer>{

	@Modifying
	@Transactional
	@Query(value="delete from Order c where c.orderid = ?1")
	void deleteByOrderId(int orderid);
}
