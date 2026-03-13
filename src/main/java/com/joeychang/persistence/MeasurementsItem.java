package com.joeychang.persistence;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasurementsItem{

	@JsonProperty("elementMeasurements")
	private ElementMeasurements elementMeasurements;

	@JsonProperty("elementDescription")
	private Object elementDescription;

	@JsonProperty("elementName")
	private String elementName;

	public void setElementMeasurements(ElementMeasurements elementMeasurements){
		this.elementMeasurements = elementMeasurements;
	}

	public ElementMeasurements getElementMeasurements(){
		return elementMeasurements;
	}

	public void setElementDescription(Object elementDescription){
		this.elementDescription = elementDescription;
	}

	public Object getElementDescription(){
		return elementDescription;
	}

	public void setElementName(String elementName){
		this.elementName = elementName;
	}

	public String getElementName(){
		return elementName;
	}

	@Override
 	public String toString(){
		return 
			"MeasurementsItem{" + 
			"elementMeasurements = '" + elementMeasurements + '\'' + 
			",elementDescription = '" + elementDescription + '\'' + 
			",elementName = '" + elementName + '\'' + 
			"}";
		}
}