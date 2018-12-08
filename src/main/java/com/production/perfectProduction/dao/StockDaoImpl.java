package com.production.perfectProduction.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.production.perfectProduction.entity.Client;
import com.production.perfectProduction.entity.Stock;

@Repository("StockDao")

public class StockDaoImpl implements StockDao{

	
	@PersistenceContext
	EntityManager em;
	@Override
	public List<Stock> getStocks() {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Stock> cq = cb.createQuery(Stock.class);
		Root<Stock> root = cq.from(Stock.class);
		List <Stock> data = em.createQuery(cq).getResultList();
		return data;
	}
	
	@Override
	public String addStock(Stock stock) {
		System.out.println("in Dao Layer");
		try {
			em.persist(stock);
			return "Success";
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	@Override
	public String updateStock(Stock stock) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<Stock> update = cb.createCriteriaUpdate(Stock.class);
		Root e = update.from(Stock.class);
		update.set("fabric",stock.getFabric());
		update.set("colour",stock.getColour());
		update.set("fimage",stock.getFimage());
		update.set("roll_length",stock.getRoll_length());
		update.set("rolls",stock.getRolls());
		update.set("remark",stock.getRemark());
		update.where(cb.equal(e.get("id"), stock.getId()));
		int result = em.createQuery(update).executeUpdate();
		if (result==1) {
			return "success";
		}else {
			return "error";
			}

	}
	
	
	@Override
	public String deleteStock(int id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaDelete<Stock> delete = cb.createCriteriaDelete(Stock.class);
		Root e = delete.from(Stock.class);
		delete.where(cb.equal(e.get("id"),id));
		int result = em.createQuery(delete).executeUpdate();
		if (result == 1) {
			return "success";
		} else {
			return "error";
		}
	}

	@Override
	public Stock getById(int id) {
		Query q = em.createNativeQuery("Select * from stock where id= :id",Stock.class);
		q.setParameter("id", 2);

		Stock stock = (Stock) q.getSingleResult();
		 
		return stock;
	}
	

}
