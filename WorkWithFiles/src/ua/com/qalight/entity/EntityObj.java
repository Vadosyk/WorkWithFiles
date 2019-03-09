package ua.com.qalight.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EntityObj implements Serializable {
	
	private String strfileld;
	private Integer intfileld;
	private Boolean boolfileld;
	
	public EntityObj(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getStrfileld() {
		return strfileld;
	}
	public void setStrfileld(String strfileld) {
		this.strfileld = strfileld;
	}
	public Integer getIntfileld() {
		return intfileld;
	}
	public void setIntfileld(Integer intfileld) {
		this.intfileld = intfileld;
	}
	public Boolean getBoolfileld() {
		return boolfileld;
	}
	public void setBoolfileld(Boolean boolfileld) {
		this.boolfileld = boolfileld;
	}
	
	
	
	
	

}
