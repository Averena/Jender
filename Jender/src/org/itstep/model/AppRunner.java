package org.itstep.model;

public class AppRunner {

	public static void main(String[] args) {
		
		BoysGirls percentage = new BoysGirls();
		percentage.setBoys(892);
		percentage.setGirls(782);
		percentage.CountPercente();
		System.out.println("The percentage of boys is " + percentage.getBoysPercente() + "%  and girls is " + percentage.getGirlsPercente() + "%");
	}

}
