package com.production.perfectProduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return "clientview";
	}
	
	@RequestMapping(value= {"/clients"},  method = RequestMethod.POST)
	public String showClient (Model model) {
		cs.showClient();
		return "clientview";
	}

	

}
