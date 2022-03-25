package com.basics.apps;

public class GradeSystem {
	
	public void gradeSystem(int mark) {
	if(mark >= 95) {
		System.out.println("The Student is secured A+ grade ");
	}
	else if (mark >=85) {
		System.out.println("The Student is secured A grade ");
	}
	else if (mark >= 75) {	
		System.out.println("The Student is secured B+ grade ");
	}
	else if (mark >= 65 ) {
		System.out.println("The Student is secured B grade ");
	}
	else if (mark >= 55) {	
		System.out.println("The Student is secured C+ grade ");
	}
	else if (mark >= 45 ) {	
		System.out.println("The Student is secured c grade ");
	}
	else if (mark <= 40 & mark >= 1 ){	
		System.out.println("The Student is secured F grade ");	
	}
	else if (mark == 0) {	
		System.out.println("The Student is adsent. ");
	}
}
}   

