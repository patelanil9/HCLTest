package com.home;

import java.util.Scanner;

public class PrintNo  implements NumberAPI{

	@Override
	public void printNumver(int endRange) {
		if(endRange > 0 && endRange<=100)
		{
		for(int i = 1; i <= endRange; i++)
		{
			System.out.println(i);
		}
		}else
		{
			System.out.println("please Enter Correct end Range Between 1 To 100");
		}
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        
        System.out.println("Enter End Range No between 1 To 100");
        int endRange= s.nextInt();
         
         PrintNo pa=new PrintNo();
         pa.printNumver(endRange);
	}
}
