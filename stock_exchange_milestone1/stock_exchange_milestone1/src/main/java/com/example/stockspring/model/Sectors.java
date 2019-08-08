
package com.example.stockspring.model;

public class Sectors {
@Override
	public String toString() {
		return "Sectors [id=" + id + ", sectorName=" + sectorName + ", brief=" + brief + "]";
	}
private int id;
private String sectorName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSectorName() {
	return sectorName;
}
public void setSectorName(String sectorName) {
	this.sectorName = sectorName;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
private String brief;

}
