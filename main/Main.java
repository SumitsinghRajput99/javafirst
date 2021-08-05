package com.psl.main;

import com.psl.model.*;

public class Main {
public static void main(String[] args) {
	Car swift = new  Car();
//	swift.setColor("Black");
//	swift.setMake("Maruti");
//	swift.setModel("2021");
//	swift.setPrice(500000);
	System.out.printf("Color:%s\n",swift.getColor());
	System.out.printf("Make:%s\n",swift.getMake());
	System.out.printf("Model:%s\n",swift.getModel());
	System.out.printf("Price:%d\n",swift.getPrice());
	
	Car i20 = new Car("Maruti","xuv","Black",100000);
	System.out.printf("Color:%s\n",i20.getColor());
	System.out.printf("Make:%s\n",i20.getMake());
	System.out.printf("Model:%s\n",i20.getModel());
	System.out.printf("Price:%d\n",i20.getPrice());
	
	SUV car = new SUV(true);
	System.out.printf("model:%s\n",car.getModel());
	System.out.printf("color:%s\n",car.getColor());
	System.out.printf("make:%s\n", car.getMake());
	System.out.printf("price:%s\n",car.getPrice());
	
	



	
	
	
	
	
}
}
