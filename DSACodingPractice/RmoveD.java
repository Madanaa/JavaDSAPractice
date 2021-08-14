package practice;

public class RmoveD {
	static int Remove(int a[]) {
		int i = 0;
		for(int n : a) {
			if(i < 1 || n > a[i-1])
				a[i++] = n;
		}
		return i;
	}

	public static void main(String[] args) {
		int a[] = {1,1,6,8,6};
		int n =a.length;
		n=Remove(a);
		for(int i = 0; i <n;i++) {
			System.out.println(a[i]);
		}

	}

}
