package com.assignment.program2;
import com.assignment.program1.GFG1;
import com.assignment.program2.*;
public class GFG2  implements GFG3Interface{
	 @Override public void interfaceGFG()
	    {
	        System.out.println(
	            "This is the interface of the GFG3class");
	    }
	public static void main(String[] args) {
		 
        GFG1 ob = new GFG1();
        ob.setName("GFGsetter");
        System.out.println(ob.getName());     
        GFG2 ob2 = new GFG2();
        ob2.interfaceGFG();
    }

	}


