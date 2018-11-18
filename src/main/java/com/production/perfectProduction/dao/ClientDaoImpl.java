package com.production.perfectProduction.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.production.perfectProduction.entity.Client;

@Repository("ClientDao")
public class ClientDaoImpl implements ClientDao{

	@PersistenceContext
	EntityManager em;
	@Override
	public Client addClient(Client client) {

		try {
			em.persist(client);
			return client;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Client> getClients() {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Client> cq = cb.createQuery(Client.class);
		Root<Client> root = cq.from(Client.class);
		List <Client> data = em.createQuery(cq).getResultList();
		return data;
	}

}
