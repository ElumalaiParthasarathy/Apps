package com.basics.apps;
import java.util.Scanner;
public class MarkSystemApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char grade = input.next().toUpperCase().charAt(0);
		input.close();
		MarkSystem markSystemApp = new MarkSystem();
		markSystemApp.markSystem(grade);
	}

}
