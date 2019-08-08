package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.stockspring.model.Sectors;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.SectorService;
@Controller
public class SectorControllerImpl implements SectorController {
	@Autowired
	private SectorService sectorService;
	@Override
	public Sectors insertSector(Sectors sector) throws SQLException {
		// TODO Auto-generated method stub
		sectorService.insertSector(sector);
		return null;
	}

	@Override
	public Sectors updateSector(Sectors sector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sectors> geSectorList() throws Exception {
		// TODO Auto-generated method stub
		return sectorService.getSectorList();
	}

}
