package com.joeychang.persistence;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConstituentsItem{

	@JsonProperty("constituentID")
	private int constituentID;

	@JsonProperty("role")
	private String role;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("constituentWikidata_URL")
	private String constituentWikidataURL;

	@JsonProperty("name")
	private String name;

	@JsonProperty("constituentULAN_URL")
	private String constituentULANURL;

	public void setConstituentID(int constituentID){
		this.constituentID = constituentID;
	}

	public int getConstituentID(){
		return constituentID;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setConstituentWikidataURL(String constituentWikidataURL){
		this.constituentWikidataURL = constituentWikidataURL;
	}

	public String getConstituentWikidataURL(){
		return constituentWikidataURL;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setConstituentULANURL(String constituentULANURL){
		this.constituentULANURL = constituentULANURL;
	}

	public String getConstituentULANURL(){
		return constituentULANURL;
	}

	@Override
 	public String toString(){
		return 
			"ConstituentsItem{" + 
			"constituentID = '" + constituentID + '\'' + 
			",role = '" + role + '\'' + 
			",gender = '" + gender + '\'' + 
			",constituentWikidata_URL = '" + constituentWikidataURL + '\'' + 
			",name = '" + name + '\'' + 
			",constituentULAN_URL = '" + constituentULANURL + '\'' + 
			"}";
		}
}