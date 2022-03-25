package com.basics.arithmetic;

public class DefineCalculations implements Calculations {

	@Override
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

	@Override
	public int sub(int a, int b) {
		int c =a - b;
		return c;
	}

	@Override
	public int mul(int a, int b) {
		int c = a*b;	
		return c;
	}

	@Override
	public int div(int a, int b) {
		int c =a/b;
		return c;
	}

	@Override
	public int mod(int a, int b) {
		int c = a%b;
		return c;
	}

}
