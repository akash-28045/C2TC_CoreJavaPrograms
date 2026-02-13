package com.tnsif.oopsconcept;

public class Executor {

	public static void main(String[] args) {
		
		EncapsulationDemo ED = new EncapsulationDemo();
		ED.setName("Akash");
		ED.setAge(21);
		ED.setJersyNo(7);
		
		System.out.println(ED);
		
		Executor e = new Executor();
		System.out.println(e);

	}
	
	

}
