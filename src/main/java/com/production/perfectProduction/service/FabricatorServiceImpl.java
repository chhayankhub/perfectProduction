package com.production.perfectProduction.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.production.perfectProduction.dao.FabricatorDao;
import com.production.perfectProduction.dto.FabricatorDto;
import com.production.perfectProduction.entity.Fabricator;

@Service
public class FabricatorServiceImpl implements FabricatorService {

	@Autowired
	FabricatorDao fbd;
	
	@Transactional
	@Override
	public Fabricator addFabricator(FabricatorDto fb) {
		Fabricator fbe = new Fabricator();
		fbe.setName(fb.getName());
		fbe.setDescription(fb.getDescription());
		fbe.setAddress(fb.getAddress());
		fbe.setNumber(fb.getNumber());
		fbe.setCreated_at(new Date());
		fbe.setUpdated_at(new Date());
		fbe.setPassword(fb.getPassword());
		fbe.setPassword(fb.getUsername());
		fbe = fbd.addFabricator(fbe);

		return fbe;
	}
	
	@Override
	public List<Fabricator> getFabricator() {
		// TODO Auto-generated method stub
		return fbd.getFabricatorByEntity();
	}

}
