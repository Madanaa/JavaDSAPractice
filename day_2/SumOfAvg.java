package day_2;

public class SumOfAvg {
	static double SumAvg(int a[], int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) 
			sum += a[i];
		return (double) sum/n;
	}

	public static void main(String[] args) {
		
      int a[] = { 2, 3, 4, 5, 6};
      System.out.println(SumAvg(a,a.length));
	}

}
