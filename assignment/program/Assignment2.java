package com.assignment.program;
//	WAP to find the average and sum of the N numbers
//Using Command line argument.
public class Assignment2 {

	public static void main(String[] args) {

	    int sum = 0;
	     
	    for(int i=0;i<args.length;i++)
	    {
	        sum +=Integer.parseInt(args[i]);
	    }
	    try {
	    	int average = sum / args.length;
		} catch (Exception e) {
			
		}
	    
	    
	    System.out.println("Average of " + args.length + " command line arguments is "  );
	    }
	}


