package com.production.perfectProduction.dao;

import java.util.List;

import com.production.perfectProduction.entity.Order;

public interface OrderDao {
	
	public Order saveOrder (Order order);
	public List<Order> getOrders();

}
