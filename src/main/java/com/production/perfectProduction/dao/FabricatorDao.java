package com.production.perfectProduction.dao;

import java.util.List;

import com.production.perfectProduction.entity.Fabricator;

public interface FabricatorDao {
	
	public Fabricator addFabricator(Fabricator fb);
	public List<Fabricator> getFabricatorByEntity();
}
