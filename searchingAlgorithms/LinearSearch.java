package searchingAlgorithms;

public class LinearSearch {
   /*Searching Algorithms are designed to check for an element or retrieve an element
    *  from any data structure where it is stored. 
    * Based on the type of search operation,
    *  these algorithms are generally classified into two categories:

1.Sequential Search: In this, the list or array is traversed sequentially and every element is checked.
 For example: Linear Search.
 
2.Interval Search: These algorithms are specifically designed for searching in sorted data-structures. 
These type of searching algorithms are much more efficient than Linear Search 
as they repeatedly target the center of the search structure and divide the search space in half
    * 
    * 
    * 
    * 
    * 
    * 
    * Problem: Given an array arr[] of n elements, 
    * write a function to search a given element x in arr[].
    * 
    * */
	static int search(int a[], int x) {
		int n = a.length;
		for(int i = 0; i <n; i++) {
			if(a[i] ==x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {3,7,9,9};
		int x =2;
		int res =search(a,x);
		if(res == -1) {
			System.out.println("Not found");
		}
		else {
			System.out.println(search(a,x));
		}
		

	}

}
