package com.production.perfectProduction.service;

import java.util.List;

import com.production.perfectProduction.dto.OrderDto;
import com.production.perfectProduction.entity.Order;

public interface OrderService {
	
	public void saveOrder (OrderDto orderdto);
	public List<Order> getOrders();

}
