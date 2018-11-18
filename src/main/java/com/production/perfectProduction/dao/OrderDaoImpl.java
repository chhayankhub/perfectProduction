package com.production.perfectProduction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.production.perfectProduction.entity.Fabricator;
import com.production.perfectProduction.entity.Order;

@Repository("OrderDao")

public class OrderDaoImpl implements OrderDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Order saveOrder(Order order) {
		System.out.println("in Dao Layer");
		try {
			entityManager.persist(order);
			return order;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Order> getOrders() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Order> cq = cb.createQuery(Order.class);
		Root<Order> root = cq.from(Order.class);
		List <Order> data = entityManager.createQuery(cq).getResultList();
		return data;
	}

}
