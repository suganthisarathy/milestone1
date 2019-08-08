package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;


import com.example.stockspring.model.Sectors;

public interface SectorDao {
	 public Sectors insertSector(Sectors sector) throws SQLException;
	    public Sectors updateSector(Sectors sector);
		public List<Sectors> getSectorList() throws SQLException;
}
