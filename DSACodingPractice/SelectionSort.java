package day_5;

public class SelectionSort {
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
	    for(int i = 0; i < a.length;i++) {
       	 System.out.print(a[i]+" ");
        }
	}
// break point	
	public static void main(String[] args) {
		
          int a[] = {32, 67,76,87,12,90};
          
         selectionSort(a);
        
         
        
	}

}
