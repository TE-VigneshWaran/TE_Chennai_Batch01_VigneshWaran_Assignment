package com.assignment.program;
//3	WAP to find the number of arguments provide at runtime.
public class Assignment4 {

	public static void main(String[] arguments) {
		 String wordToFind = "Good";
		  
		    System.out.println("Arguments passed at runtime. " + 
		    "We can get that by using args.length and  it is " + 
		                            arguments.length + " here ");
		  
		    for(int i = 0; i < arguments.length; i++) {    
		        if (arguments[i].equalsIgnoreCase(wordToFind)) {
		  
		             System.out.println("Provided word "+
		                          wordToFind + " is present " +  
		                         "and it is at location " + (i+1));
		        }
	}
	}

}