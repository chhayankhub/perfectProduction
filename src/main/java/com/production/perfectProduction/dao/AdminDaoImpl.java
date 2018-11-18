package com.production.perfectProduction.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.production.perfectProduction.entity.Admin;


@Repository("AdminDao")

public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public boolean authorize(String email, String password) {
		System.out.println("Reached to Dao Bro");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		
		Root<Admin> admin = cq.from(Admin.class);
		Predicate predicateemail =  cb.equal(admin.get("email"),email);
		Predicate predicatepass =  cb.equal(admin.get("password"),password);
		cq.where(predicatepass, predicateemail);

		List <Admin> data = em.createQuery(cq).getResultList();
		if (data.size() == 1) {
			return true;
		}
		
		return false;
	}
}
