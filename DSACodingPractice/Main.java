package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int len = sc.nextInt();
		System.out.println("Enter Elements in array");
		int [] arr = new int[len];
        selectionSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
                System.out.print(arr[i]+" ");
		}
        
	}


public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
	        int min = a[i];
	        int minId = i;
	        for (int j = i+1; j < a.length; j++) {
	            if (a[j] < min) {
	                min = a[j];
	                minId = j;
	                
	            }
	        }
	        // swapping
	        int temp = a[i];
	        a[i] = min;
	        a[minId] = temp;
	    }
	    
	}
}
