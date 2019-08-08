package com.example.stockspring.model;

public class StockExchange {
private int id;
private int stockExchange;
private String brief;
private String contactAddress;
private String remarks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getStockExchange() {
	return stockExchange;
}
public void setStockExchange(int stockExchange) {
	this.stockExchange = stockExchange;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public String getContactAddress() {
	return contactAddress;
}
public void setContactAddress(String contactAddress) {
	this.contactAddress = contactAddress;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
@Override
public String toString() {
	return "StockExchangeData [id=" + id + ", stockExchange=" + stockExchange + ", brief=" + brief + ", contactAddress="
			+ contactAddress + ", remarks=" + remarks + "]";
}

}
