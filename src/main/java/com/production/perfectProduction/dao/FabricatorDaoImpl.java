package com.production.perfectProduction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.production.perfectProduction.entity.Fabricator;


@Repository("FabricatorDao")

public class FabricatorDaoImpl implements FabricatorDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Fabricator addFabricator(Fabricator fb) {
		System.out.println("in Dao Layer");
		try {
			entityManager.persist(fb);
			return fb;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Fabricator> getFabricatorByEntity() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Fabricator> cq = cb.createQuery(Fabricator.class);
		Root<Fabricator> root = cq.from(Fabricator.class);
		List <Fabricator> data = entityManager.createQuery(cq).getResultList();
		return data;
	}
}
