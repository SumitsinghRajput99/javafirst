package com.psl.model;

public class SUV extends Car{
	private boolean fourwheeldrive;
	
	public SUV(boolean fourwheeldrive) {
		this.fourwheeldrive=fourwheeldrive;
	}

	public boolean isFourwheeldrive() {
		return fourwheeldrive;
	}

	public void setFourwheeldrive(boolean fourwheeldrive) {
		this.fourwheeldrive = fourwheeldrive;
	}
	

}
