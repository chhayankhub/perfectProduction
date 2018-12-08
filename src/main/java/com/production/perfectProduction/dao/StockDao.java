package com.production.perfectProduction.dao;

import java.util.List;

import com.production.perfectProduction.entity.Client;
import com.production.perfectProduction.entity.Stock;

public interface StockDao {

	public List<Stock> getStocks();
	public String addStock(Stock stock);
	public String updateStock (Stock stock);
	public String deleteStock(int id);
	public Stock getById(int id);
}
