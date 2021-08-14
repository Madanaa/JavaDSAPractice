package practice;

import java.io.*;
import java.util.*;
public class BirthdayCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your BirthDay Month");
		 String month = sc.next();
		 System.out.println("Enter Your BirthDay Date");
		int day = sc.nextInt();
		int res = checkBirthDay(month, day);
		System.out.print(res);
	}
	static int checkBirthDay(String month, int day)
	{
		if (!month.equals("July") || day == 5)
			return 1;
		else
			return 0;
	}
}
