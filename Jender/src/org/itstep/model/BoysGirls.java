package org.itstep.model;

public class BoysGirls {
	
	private int boys, girls;
	private double boysPercente;
	private double girlsPercente;
	
	public void setBoys(int boys) {
		this.boys = boys;
	}

	public void setGirls(int girls) {
		this.girls = girls;
	}
	public void CountPercente() {
		boysPercente = (double)(boys *100)/(double)(boys + girls );
		girlsPercente = (double)(girls *100)/(double)(boys + girls );
	}
	public double getGirlsPercente() {
		return Math.rint(girlsPercente*100.0)/100.0;
	}
	public double getBoysPercente() {
		return Math.rint(boysPercente*100.0)/100.0;
	}
	


}
