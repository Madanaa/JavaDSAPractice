package practice;

import java.io.*;
import java.util.*;
public class Pattrern
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // creating scanner class object
		System.out.println("Enter Number");
		int n = sc.nextInt(); // taking integer type of input from user
		drawPrintPattern(n); // calling draw pattern method(method is static type 
		// that’s why we are able call directly in static area
	}
  public static	void drawPrintPattern(int num) // method for printing method
	{
		int print=1;
		for(int i=0;i<num;i++)
		{   
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(print+" ");
			}
			System.out.println();
		}
	}
}

