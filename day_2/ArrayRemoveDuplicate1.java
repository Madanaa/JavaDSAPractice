package day_2;

public class ArrayRemoveDuplicate1 {
	public static int Duplicate(int[] a, int n) {
		if(a.length < n) {
			return a.length;
		}
		int j = 0;
		int i = 1;
		while(i < a.length) {
			if(a[i]!=a[j]) {
				j++;
				a[j] =a[i];
			}
			i++;
		}
		return j + 1;
		
	}

	public static void main(String[] args) {
		int a[] = {1,1,2,8,8,8,6,6};
		int n=a.length;
		n=Duplicate(a,n);
		for(int i = 0; i <n;i++)
		System.out.print(a[i]+" ");

	}

}
