package com.assignment.program;
/*
6	WAP to create a Simple class to find out
 the Area and perimeter of rectangle and box 
using super and this keyword.
*/
public class Assignment10 {
    double length;
    double width;
    void Area()
    {
        double area;
        area = this.length * this.width;
        System.out.println("Area of rectangle is : "
                           + area);
    }
    void Perimeter()
    {
        double perimeter;
        perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of rectangle is : "
                           + perimeter);
    }
	public static void main(String[] args) {
		Assignment10 rect =new Assignment10();
        rect.length = 15.854;
        rect.width = 22.65;
        System.out.println("Length = " + rect.length);
        System.out.println("Width = " + rect.width);
        rect.Area();
        rect.Perimeter();
	}
}
