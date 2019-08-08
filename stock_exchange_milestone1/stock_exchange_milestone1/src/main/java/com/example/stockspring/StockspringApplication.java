package com.example.stockspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stockspring.controller.CompanyControllerImpl;

@SpringBootApplication
public class StockspringApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StockspringApplication.class, args);
		// beans are created
		
		/*Scanner s=new Scanner(System.in);
         System.out.println("Enter company code");
         company.setCompanyId(s.nextInt());
         s.nextLine();
         System.out.println("Enter Company name");
         company.setCompanyName(s.nextLine());
         System.out.println("Enter turn over");
         company.setTurnOver(s.nextLine());
         System.out.println("Enter CEO");
         company.setCEO(s.nextLine());
         System.out.println("Enter board of directors");
         company.setBoardOfDirectors(s.nextLine());
         System.out.println("Enter Sector Id");
         company.setSectorId(s.nextInt());
         s.nextLine();
         System.out.println("Enter brief writeup");
         company.setBriefWriteUp(s.nextLine());
		
		Sectors sector=new Sectors();
		System.out.println("Enter sector name");
        sector.setSectorName(s.nextLine());
        System.out.println("Enter sector brief");
        sector.setBrief(s.nextLine());
        
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("after the container");
		CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
		 System.out.println(companyController.insertCompany(company));
         System.out.println("");
         */
        
		  /* SectorController sectorController=(SectorController)applicationContext.getBean("sectorControllerImpl");
		   sectorController.insertSector(sector);
		   System.out.println(sectorController.geSectorList());*/
		   
	}

}

