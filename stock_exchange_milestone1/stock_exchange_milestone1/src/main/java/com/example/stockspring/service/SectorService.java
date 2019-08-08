package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;


import com.example.stockspring.model.Sectors;

public interface SectorService {

	  public Sectors insertSector(Sectors sector) throws SQLException;
	    public Sectors updateSector(Sectors sector);
		public List<Sectors> getSectorList() throws SQLException;

}
