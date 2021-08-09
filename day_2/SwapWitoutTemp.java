package day_2;

public class SwapWitoutTemp {

	public static void main(String[] args) {
		int a = 8;
		int b= 9;
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println(a);

	}

}
