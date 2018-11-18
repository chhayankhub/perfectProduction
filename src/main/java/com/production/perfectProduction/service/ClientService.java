package com.production.perfectProduction.service;

import java.util.List;

import com.production.perfectProduction.dto.ClientDto;
import com.production.perfectProduction.entity.Client;

public interface ClientService {
	public Client addClient(ClientDto clientdto);
	public List<Client> showClient();
}
