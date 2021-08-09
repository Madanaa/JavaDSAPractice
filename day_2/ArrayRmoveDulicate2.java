package day_2;
//given sorted array A = [1,1,1,2,2,3], your function should return length = 5, and A is now [1,1,2,2,3].
//So this problem also requires in-place array manipulation.

public class ArrayRmoveDulicate2 {
	   static int Dulicate(int a[]) {
		   int i = 0;
		   for(int n : a) {
			   if(i < 2 || n > a[i-2])
				   a[i++] = n;
		   }
		   return i;
	   }

	public static void main(String[] args) {
		int a[] = {1,1,1,2,2,3};
		int n =a.length;
		n=Dulicate(a);
		for(int i = 0; i < n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
