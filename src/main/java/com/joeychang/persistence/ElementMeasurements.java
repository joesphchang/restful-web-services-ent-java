package com.joeychang.persistence;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ElementMeasurements{

	@JsonProperty("Height")
	private Object height;

	@JsonProperty("Width")
	private Object width;

	public void setHeight(Object height){
		this.height = height;
	}

	public Object getHeight(){
		return height;
	}

	public void setWidth(Object width){
		this.width = width;
	}

	public Object getWidth(){
		return width;
	}

	@Override
 	public String toString(){
		return 
			"ElementMeasurements{" + 
			"height = '" + height + '\'' + 
			",width = '" + width + '\'' + 
			"}";
		}
}