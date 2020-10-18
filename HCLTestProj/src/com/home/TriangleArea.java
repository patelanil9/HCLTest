package com.home;

import java.util.Scanner;

public class TriangleArea implements AreaCalculation{

	@Override
	public void calculateTrangleArea(double width, double height) {
		 double area=(width*height)/2;
	      System.out.println("Area of Triangle is: " + area);    
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the width of the Triangle:");
        double width= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
         double height= s.nextDouble();
         
         TriangleArea ta=new TriangleArea();
         ta.calculateTrangleArea(width, height);;
	}

}
