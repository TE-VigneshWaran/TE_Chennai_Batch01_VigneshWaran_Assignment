package com.assignment.program2;

public interface GFG3Interface {
	 String name = "GFG";
	    public void interfaceGFG();
	}

	abstract class GFGabstract {
	    String name = "GFGAbstract";
	   
	    
	    abstract public void print();
	}
	public class GFG3 {
	   
	   
	    int first;
	    int second;
	   
	    
	    GFG3(int a, int b)
	    {
	        this.first = a;
	        this.second = b;
	    }
	   
	   
	    public int add() { return this.first + this.second; }
	}

