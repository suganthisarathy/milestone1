package com.example.stockspring.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.service.CompanyService;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService companyService;
	
	
	
	
	
	public Company insertCompany(Company company) throws SQLException {
		companyService.insertCompany(company);
		return company;	
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ManageCompanies");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}
	
	
	// try
	
	
}