package day_6;

public class SumOfEven {
	// 2+4+6+8
	static int sumEven(int n) {
		int c = 2, sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = c+sum;
			c = c+2;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumEven(4));

	}

}
