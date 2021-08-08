package day_2;

//Write a Java program to convert a float value to absolute value??
public class ConvertFloat {
    static float convert(float n) {
    	float ab =(n >= 0) ? n : -n;
    	return ab;
    	
    }
	public static void main(String[] args) {
		float n =13.768965f;
		System.out.printf("The absolute value %.2f",n,convert(n));

	}

}
