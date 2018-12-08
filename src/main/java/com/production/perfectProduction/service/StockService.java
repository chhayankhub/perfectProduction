package com.production.perfectProduction.service;

import java.util.List;

import com.production.perfectProduction.dto.StockDto;
import com.production.perfectProduction.entity.Stock;

public interface StockService {
	public String addStock (StockDto stockdto);
	public List<Stock> showStock();
	public String editStock(StockDto stockdto);
	public String deleteStock(int id); 
	public Stock getStockById(int id);

}
