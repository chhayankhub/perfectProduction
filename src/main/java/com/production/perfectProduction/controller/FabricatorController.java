package com.production.perfectProduction.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.production.perfectProduction.dto.FabricatorDto;
import com.production.perfectProduction.dto.OrderDto;
import com.production.perfectProduction.entity.Fabricator;
import com.production.perfectProduction.service.FabricatorService;

@Controller
public class FabricatorController {

	@Autowired
	FabricatorService fbs;
	
	@RequestMapping(value= {"/fabricatorhome"},  method = RequestMethod.POST)
	public String addHomeFabricator (@ModelAttribute("fabricatordto") FabricatorDto fabricatordto, Model model) {
		Fabricator fb = fbs.addFabricator(fabricatordto);
		List<Fabricator> fbrs = fbs.getFabricator();
		
//		Iterator<Fabricator> ifb = fbrs.iterator();
//		while(ifb.hasNext())
//		{
//			ifb.
//		}
		System.out.println("got the list"+fbrs.get(0).getName());
		model.addAttribute("fabricatordto", new FabricatorDto());
		model.addAttribute("orderdto", new OrderDto());
//		model.addAttribute("fabricators", fbrs);
		return "dashboard";
	}
}
