package com.joeychang.persistence;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagsItem{

	@JsonProperty("AAT_URL")
	private String aATURL;

	@JsonProperty("term")
	private String term;

	@JsonProperty("Wikidata_URL")
	private String wikidataURL;

	public void setAATURL(String aATURL){
		this.aATURL = aATURL;
	}

	public String getAATURL(){
		return aATURL;
	}

	public void setTerm(String term){
		this.term = term;
	}

	public String getTerm(){
		return term;
	}

	public void setWikidataURL(String wikidataURL){
		this.wikidataURL = wikidataURL;
	}

	public String getWikidataURL(){
		return wikidataURL;
	}

	@Override
 	public String toString(){
		return 
			"TagsItem{" + 
			"aAT_URL = '" + aATURL + '\'' + 
			",term = '" + term + '\'' + 
			",wikidata_URL = '" + wikidataURL + '\'' + 
			"}";
		}
}