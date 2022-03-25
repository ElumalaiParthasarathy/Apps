package com.basics.apps;

import java.util.Scanner;//importing scanner
	
class OddOrEvenFinderApp{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int N = input.nextInt();
	
	
	String s = input.nextLine();
	input.close();
	OddNumberFinder oddNumberFinder = new OddNumberFinder();
	System.out.println(s);
	oddNumberFinder.oddNumberFinder(N);





}


 
}