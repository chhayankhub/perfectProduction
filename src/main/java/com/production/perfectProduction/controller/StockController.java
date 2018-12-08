package com.production.perfectProduction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.production.perfectProduction.dto.OrderDto;
import com.production.perfectProduction.dto.StockDto;
import com.production.perfectProduction.entity.Stock;
import com.production.perfectProduction.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	StockService stt;
	
	@RequestMapping(value= {"/stock"}, method= RequestMethod.GET)
	public String index (Model model) {
		model.addAttribute("stockdto",new StockDto());
		List<Stock> stock_all = stt.showStock();
		model.addAttribute("stocks",stock_all);
		
		return "stock";
	}
	
	@RequestMapping(value= {"/updatestock/{id}"}, method = RequestMethod.GET )
	public String updateStock(@PathVariable int id, Model model) {
		model.addAttribute("stockdto",new StockDto());
		Stock st = stt.getStockById(id);
		model.addAttribute("stock",st);
		return "stockupdate";
	}

}
