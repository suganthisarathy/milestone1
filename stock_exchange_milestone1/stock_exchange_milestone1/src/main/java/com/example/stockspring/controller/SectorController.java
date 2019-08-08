package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;


import com.example.stockspring.model.Sectors;

public interface SectorController {
	 public Sectors insertSector(Sectors sector) throws SQLException;
	    public Sectors updateSector(Sectors sector);
		public List<Sectors> geSectorList() throws Exception;
}
