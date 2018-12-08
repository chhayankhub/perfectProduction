package com.production.perfectProduction.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.production.perfectProduction.dao.ClientDao;
import com.production.perfectProduction.dao.StockDao;
import com.production.perfectProduction.dto.StockDto;
import com.production.perfectProduction.entity.Stock;

@Service

public class StockServiceImpl implements StockService {

	@Autowired
	StockDao stdao;
	@Transactional
	@Override
	public List<Stock> showStock() {
		
		return stdao.getStocks();
	}
	@Override
	public String addStock(StockDto stockdto) {

		Stock st = new Stock();
		st.setFabric(stockdto.getFabric());
		st.setColour(stockdto.getColour());
		st.setRoll_length(stockdto.getRoll_length());
		st.setFimage(stockdto.getFimageName());
		st.setRolls(stockdto.getRolls());
		st.setRemark(stockdto.getRemark());
		return stdao.addStock(st);
	}
	@Override
	public String editStock(StockDto stockdto) {
		Stock st = new Stock();
		st.setFabric(stockdto.getFabric());
		st.setColour(stockdto.getColour());
		st.setRoll_length(stockdto.getRoll_length());
		st.setFimage(stockdto.getFimageName());
		st.setRolls(stockdto.getRolls());
		st.setRemark(stockdto.getRemark());
		return stdao.updateStock(st);
		
	}
	@Override
	public String deleteStock(int id) {
		// TODO Auto-generated method stub
		return stdao.deleteStock(id);
	}
	
	@Override
	public Stock getStockById(int id) {
		return stdao.getById(id);
	}

}
