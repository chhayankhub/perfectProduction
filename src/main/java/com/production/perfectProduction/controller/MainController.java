package com.production.perfectProduction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.production.perfectProduction.dto.FabricatorDto;
import com.production.perfectProduction.dto.LoginDto;
import com.production.perfectProduction.dto.OrderDto;
import com.production.perfectProduction.entity.Client;
import com.production.perfectProduction.entity.Fabricator;
import com.production.perfectProduction.service.ClientService;
import com.production.perfectProduction.service.FabricatorService;
import com.production.perfectProduction.service.LoginService;

@Controller
public class MainController {
	
	@Autowired
	LoginService loginService;
	@Autowired
	FabricatorService fbService;
	@Autowired
	ClientService cs;
	
	@RequestMapping(value= {"/login"},  method = RequestMethod.GET)
	public String index (Model model) {
		model.addAttribute("logindto", new LoginDto());
		System.out.println("Login Page Shown");
		return "login";
	}
	
	@RequestMapping(value= {"/logins"},  method = RequestMethod.POST)
	public String login (@ModelAttribute("logindto") LoginDto login, Model model) {
		if (loginService.authorise(login)) {
			List<Fabricator> fbrs = fbService.getFabricator();
			model.addAttribute("orderdto",new OrderDto());
			model.addAttribute("fabricatordto", new FabricatorDto());
			model.addAttribute("fabricators", fbrs);
			List<Client> clients = cs.showClient();
			model.addAttribute("clients", clients);
			return "dashboard";
		}
		return "login";
	}
	
	@RequestMapping(value= {"/dashboard"},  method = RequestMethod.GET)
	public String dashboard (@ModelAttribute("logindto") LoginDto login, Model model) {
		List<Fabricator> fbrs = fbService.getFabricator();
		model.addAttribute("orderdto",new OrderDto());
		model.addAttribute("fabricatordto", new FabricatorDto());
		model.addAttribute("fabricators", fbrs);
		List<Client> clients = cs.showClient();
		model.addAttribute("clients", clients);
		return "dashboard";
	}
	
}
