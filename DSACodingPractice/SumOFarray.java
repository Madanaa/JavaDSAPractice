package practice;

public class SumOFarray {
	static int sum(int a[], int n) {
		int sum = 0;
		for(int i = 0; i <n; i++) {
		     sum = sum +a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int a[] = {2,7,9,5};
		int n = a.length;
		System.out.println(sum(a,n));

	}

}
