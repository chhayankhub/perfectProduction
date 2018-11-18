package com.production.perfectProduction.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.production.perfectProduction.dto.FabricatorDto;
import com.production.perfectProduction.entity.Fabricator;

@Service
public interface FabricatorService {
	@Transactional
	public Fabricator addFabricator (FabricatorDto fb);
	public List<Fabricator> getFabricator();
}
