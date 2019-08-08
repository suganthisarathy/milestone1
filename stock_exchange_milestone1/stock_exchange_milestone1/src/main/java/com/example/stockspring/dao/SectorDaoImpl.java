package com.example.stockspring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Sectors;
@Repository
public class SectorDaoImpl implements SectorDao {

	@Override
	public Sectors insertSector(Sectors sector) throws SQLException {
		// TODO Auto-generated method stub
		try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","password-1");
            PreparedStatement ps=conn.prepareStatement("insert into sectors (sector_name,brief) values(?,?)");
           
            ps.setString(1, sector.getSectorName());
            ps.setString(2,sector.getBrief());
            ps.executeUpdate();
            System.out.println("inserted successfully");
            }
            catch(SQLException e){
                   System.out.println(e);
                   throw e;
            }
            
            
            return null;
		
	}

	@Override
	public Sectors updateSector(Sectors sector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sectors> getSectorList() throws SQLException {
		// TODO Auto-generated method stub
		List <Sectors> sectorList=new ArrayList<Sectors>();
		 try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","password-1");
            PreparedStatement ps=conn.prepareStatement("select * from sectors");
            ResultSet rs= ps.executeQuery();
            Sectors sector=null;
            while(rs.next()){
                   sector=new Sectors();
                   int sectorId=rs.getInt("id");
                   sector.setId(sectorId);
                   sector.setSectorName(rs.getString("sector_name"));
                   sector.setBrief(rs.getString("brief"));
              
                   sectorList.add(sector);
            }
            }catch(SQLException e){
                   System.out.println(e);
                   throw e;
            }
            return sectorList;
		
	}

}
