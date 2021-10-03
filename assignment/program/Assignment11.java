package com.assignment.program;
/*
10	WAP to design a class using abstract Methods
and Classes.
*/
abstract class Bike{  
	  abstract void run();  
	}  
	class Splendor extends Bike{  
	void run(){
		System.out.println("running safely");
	}  
	}
public class Assignment11 {

	public static void main(String[] args) {
		 Bike obj = new Splendor();  
		 obj.run();  

	}

}
/*
OUTPUT:

running safely

*/