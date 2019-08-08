package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Sectors;
@Service
public class SectorServiceImpl implements SectorService {
	@Autowired
	private SectorDao sectorDao;
	@Override
	public Sectors insertSector(Sectors sector) throws SQLException {
		// TODO Auto-generated method stub
		return sectorDao.insertSector(sector);
	}

	@Override
	public Sectors updateSector(Sectors sector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sectors> getSectorList() throws SQLException {
		// TODO Auto-generated method stub
		return sectorDao.getSectorList();
	}

}
