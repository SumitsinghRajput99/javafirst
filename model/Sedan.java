package com.psl.model;

public class Sedan extends Car{
	private boolean convertible;
	
	
	public Sedan() {
		super("","","",0);
		convertible=true;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
}
