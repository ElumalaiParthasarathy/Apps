package com.basics.arithmetic;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Calculations caluclations = new DefineCalculations();
		String check;
		do {
			System.out.println("Please select opreations from below");
			System.out.println("Add");
			System.out.println("sub");
			System.out.println("mul");
			System.out.println("div");
			System.out.println("mod");

			String opreation = scanner.next().toLowerCase();
			
			System.out.println("Please enter first number : ");
			int a = scanner.nextInt();
			System.out.println("Please enter second number : ");
			int b = scanner.nextInt();

			switch (opreation) {
			case "add":
				int c = caluclations.add(a, b);
				System.out.println("The sum of two number is "+ c);
				break;

			case "sub":
				int f = caluclations.sub(a,b);
				System.out.println("The subraction of two number is "+ f);
				break;

			case "mul":
				int i = caluclations.mul(a, b);
				System.out.println("The product of given number  is "+ i);
				break;

			case "div":
				int l = caluclations.div(a, b);
				System.out.println("The  quat is "+ l);
				break;
			case "mod":
				int o = caluclations.mod(a, b);
				System.out.println("The  reminder is "+ o);
				break;
			default:
				System.out.println("thank for chosing us");
				break;
			}
			System.out.println("Do you want to make another calculations: yes/no");
			check = scanner.next().toLowerCase();
			
		} 

		while (check.equals("yes"));
		System.out.println("Thank you");
		scanner.close();
	}
}
