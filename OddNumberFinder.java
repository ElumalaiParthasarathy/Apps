package com.basics.apps;
class OddNumberFinder{
	
	public void  oddNumberFinder(int N){

		  if (N%2 != 0)
	        {
	            System.out.println("Weird");
	        }    
	        else if(N%2 == 0 && N<=5 && N>=2 ){
	            System.out.println("Not Weird");
	        }
	        else if (N%2 == 0 && N<=20 && N>=6){
	            System.out.println("Weird");
	        }
	        else if (N%2 == 0 && N>20){
	            System.out.println("Not Weird");
	        }
	    
	}
	
}




