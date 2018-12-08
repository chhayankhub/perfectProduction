package com.production.perfectProduction.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.production.perfectProduction.dao.OrderDao;
import com.production.perfectProduction.dto.OrderDto;
import com.production.perfectProduction.entity.Order;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderDao orderen;
	@Transactional
	@Override
	public void saveOrder(OrderDto orderdto) {
		// TODO Auto-generated method stub
		Order odr = new Order();
		odr.setUser("admin");
		odr.setClient(orderdto.getClient());
		odr.setFabricator(orderdto.getFabricator());
		odr.setDesign(orderdto.getDesignName());
		odr.setStatus("Confirmation Pending");
		odr.setProduct(orderdto.getProduct());
		odr.setCreated_at(new Date());
		odr.setUpdated_at(new Date());
		odr.setRemark(orderdto.getRemark());
		orderen.saveOrder(odr);
	}
	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderen.getOrders();
	}
	
	

}
