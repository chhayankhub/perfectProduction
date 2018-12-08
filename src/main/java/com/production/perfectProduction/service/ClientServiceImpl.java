package com.production.perfectProduction.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.production.perfectProduction.dao.ClientDao;
import com.production.perfectProduction.dto.ClientDto;
import com.production.perfectProduction.entity.Client;


@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientDao clientdao;
	@Transactional
	@Override
	public Client addClient(ClientDto clientdto) {
		Client client = new Client();
		client.setName(clientdto.getName());
		client.setDescription(clientdto.getDescription());
		client.setNumber(clientdto.getNumber());
		client.setCreated_at(new Date());
		client.setUpdated_at(new Date());
		
		return clientdao.addClient(client);
	}
	@Override
	public List<Client> showClient() {
		// TODO Auto-generated method stub
		return clientdao.getClients();
	}
	@Override
	public List<Client> getClientById(int id) {
		
		return clientdao.getClientFromDao(id);
	}

	
 
	
}
