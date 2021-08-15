package day_6;

public class SumOfOdd {
   static int sumOdd(int n) {
	   int sum = 0, num =1;
	   for(int i= 0; i < n; i++) {
		   sum = sum + num;
		   num = num + 2;
	   }
	   return sum;
	   
   }
   public static void main (String[]args) {
	   int n = 5;
	   System.out.println(sumOdd(n));
   }
}
