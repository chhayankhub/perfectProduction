package com.production.perfectProduction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.production.perfectProduction.dto.ClientDto;
import com.production.perfectProduction.dto.LoginDto;
import com.production.perfectProduction.entity.Client;
import com.production.perfectProduction.service.ClientService;

@Controller
public class ClientController {
	@Autowired
	ClientService cs;
	
	@RequestMapping(value= {"/addclient"},  method = RequestMethod.POST)
	public String addClient (@ModelAttribute("clientdto") ClientDto clientdto, Model model) {
		Client client = cs.addClient(clientdto);
		return "addclient";
	}
	
	@RequestMapping(value= {"/clients"},  method = RequestMethod.GET)
	public String showClient (@ModelAttribute("clientdto") ClientDto clientdto,Model model) {
		model.addAttribute("clientdto", new ClientDto());
		List<Client> clients = cs.showClient();
		model.addAttribute("clients", clients);
		return "client";
	}

	
	@RequestMapping(value= {"/newclient"},  method = RequestMethod.POST)
	public String newClient (@ModelAttribute("clientdto") ClientDto clientdto, Model model) {
		Client client = cs.addClient(clientdto);
		List<Client> clients = cs.showClient();
		model.addAttribute("clients", clients);
		return "client";
	}

	@RequestMapping(value="clientedit/{id}", method = RequestMethod.GET)
	public String editClient (@PathVariable("id") int id) {
		return null;
//		List<Client> clients = cs.GetClientById(id);
		
	}
	
}
