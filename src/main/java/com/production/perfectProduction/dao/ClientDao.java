package com.production.perfectProduction.dao;

import java.util.List;

import com.production.perfectProduction.entity.Client;

public interface ClientDao {

	public Client addClient(Client client);
	public List<Client> getClients();
}
