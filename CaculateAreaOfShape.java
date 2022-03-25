package com.basics.apps;
import java.util.Scanner;

import com.basics.samples.Shapes;

public class CaculateAreaOfShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the side of square :");
		int side = sc.nextInt();
		System.out.println("Please Enter The length of rectangle : ");
		int len = sc.nextInt();
		System.out.println("Please Enter the width of rectangle : ");
		int wid = sc.nextInt();
		sc.close();
		Shapes calculate = new Shapes();
		System.out.println("The area of square is "+calculate.calculateArea(side));
		System.out.println("The area of rectangle is "+calculate.calculateArea(len,wid));		
	}

}
