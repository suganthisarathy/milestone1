package com.example.stockspring.model;

public class Company {

       private int companyId; 
       private String companyName;
       private String turnOver;
       private String CEO;
       private String boardOfDirectors;
       private int sectorId;
       private String briefWriteUp;
       private int stockCode;
       public String getCompanyName() {
              return companyName;
       }
       public void setCompanyName(String companyName) {
              this.companyName = companyName;
       }
       public String getTurnOver() {
              return turnOver;
       }
       public void setTurnOver(String turnOver) {
              this.turnOver = turnOver;
       }
       public String getCEO() {
              return CEO;
       }
       public void setCEO(String cEO) {
              CEO = cEO;
       }
       public int getSectorId() {
              return sectorId;
       }
       public void setSectorId(int sectorId) {
              this.sectorId = sectorId;
       }
       public String getBriefWriteUp() {
              return briefWriteUp;
       }
       public void setBriefWriteUp(String briefWriteUp) {
              this.briefWriteUp = briefWriteUp;
       }
       public int getStockCode() {
              return stockCode;
       }
       public void setStockCode(int stockCode) {
              this.stockCode = stockCode;
       }

       private Sectors sector;

       public int getCompanyId() {
              return companyId;
       }
       public void setCompanyId(int companyId) {
              this.companyId = companyId;
       }
       public String getBoardOfDirectors() {
              return boardOfDirectors;
       }
       public void setBoardOfDirectors(String boardOfDirectors) {
              this.boardOfDirectors = boardOfDirectors;
       }
       public Sectors getSector() {
              return sector;
       }
       public void setSector(Sectors sector) {
              this.sector = sector;
       }
       @Override
       public String toString() {
              return "Company [companyId=" + companyId + ", companyName=" + companyName + ", turnOver=" + turnOver + ", CEO="
                           + CEO + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId + ", briefWriteUp="
                           + briefWriteUp + ", stockCode=" + stockCode + ", sector=" + sector + "]";
       }
       
       
}
