package com.production.perfectProduction.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.production.perfectProduction.dto.FabricatorDto;
import com.production.perfectProduction.dto.FileUploadDto;
import com.production.perfectProduction.dto.OrderDto;
import com.production.perfectProduction.entity.Fabricator;
import com.production.perfectProduction.service.FabricatorService;
import com.production.perfectProduction.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	@Autowired
	FabricatorService fbService;
	
	private static String UPLOADED_FOLDER = "E://CoreJava//images//";
	
	@RequestMapping(value= {"/order"}, method= RequestMethod.GET)
	public String index (Model model) {
		model.addAttribute("orderdto",new OrderDto());
		return "order";
	}
	
	@RequestMapping(value= {"/quickorder"}, method= RequestMethod.POST)
	public String addOrder (@ModelAttribute("orderdto") OrderDto order, FileUploadDto file, ModelMap model) {
		System.out.println("Reached controller");
		orderservice.saveOrder(order);
		MultipartFile multipart = order.getDesign();
		byte[] bytes;
		try {
			bytes = multipart.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + multipart.getOriginalFilename());
	        Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("reached home");
        List<Fabricator> fbrs = fbService.getFabricator();
		model.addAttribute("orderdto",new OrderDto());
		model.addAttribute("fabricatordto", new FabricatorDto());
		model.addAttribute("fabricators", fbrs);
		return "dashboard";
		
	}
}
