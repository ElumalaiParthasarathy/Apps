package com.basics.apps;

public class MarkSystem {
	public void markSystem(char grade){
		
		switch (grade) {
		case 'A':
			System.out.println("The student mark is 95");
			break;
		case 'B':
			System.out.println("The student mark is 85");
			break;
		case 'C':
			System.out.println("The student mark is 75");
			break;
		case 'F':
			System.out.println("The student is failed ");
			break;
		default:
			System.out.println("The student is absent");
			break;
		}
	}

}
