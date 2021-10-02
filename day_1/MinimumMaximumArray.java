package day_1;

import java.util.Arrays;

public class MinimumMaximumArray {

	public static void main(String[] args) {
		int b[] = {1,-6,7,9,0};
		Arrays.sort(b);
		System.out.println(b[0]);
		System.out.println(b[b.length-1]);
	}

}
