package com.basics.apps;
import java.util.Scanner;

public class GradeSystemApp {

	public static void main(String[] args) {

		System.out.println("Please Enter The student Mark :");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("The Student mark is " + a);	
		GradeSystem gradeSystemApp = new GradeSystem();
		gradeSystemApp.gradeSystem(a);
		input.close();
	}

}

