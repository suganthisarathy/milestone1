package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public Company insertCompany(Company company) throws SQLException  {
		/*		Connection conn=DriverManager.getConnection("","test","test123");
		PreparedStatement ps=conn.prepareStatement("insert into company (clo) value(?,?,?,?,?)")
		ps.setInt(1, company.getCompanyId());
		ps.executeUpdate();
		*/
		  try{
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","password-1");
              PreparedStatement ps=conn.prepareStatement("insert into company (company_code,company_name,turnover,ceo,boardofdirectors,sector_id,breifwriteup) values(?,?,?,?,?,?,?)");
              ps.setInt(1, company.getCompanyId());
              ps.setString(2, company.getCompanyName());
              ps.setString(3,company.getTurnOver());
              ps.setString(4, company.getCEO());
              ps.setString(5, company.getBoardOfDirectors());
              ps.setInt(6, company.getSectorId());
              ps.setString(7, company.getBriefWriteUp());
              ps.executeUpdate();
              System.out.println("inserted successfully");
              }
              catch(SQLException e){
                     System.out.println(e);
                     throw e;
              }
              
              
              return null;
	}

	
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		 try{
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","password-1");
             PreparedStatement ps=conn.prepareStatement("select * from company");
             ResultSet rs= ps.executeQuery();
             Company company=null;
             while(rs.next()){
                    company=new Company();
                    int companyId=rs.getInt("company_code");
                    company.setCompanyId(companyId);
                    company.setCompanyName(rs.getString("company_name"));
                    company.setTurnOver(rs.getString("turnover"));
                    company.setCEO(rs.getString("ceo"));
                    company.setBoardOfDirectors(rs.getString("boardofdirectors"));
                    company.setSectorId(rs.getInt("sector_id"));
                    company.setBriefWriteUp(rs.getString("breifwriteup"));
                    companyList.add(company);
             }
             }catch(SQLException e){
                    System.out.println(e);
                    throw e;
             }
             return companyList;
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}