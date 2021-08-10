package day_3;

public class StackImplement {
	static final int Max = 1000;
	int top;
	int arr[] = new int [Max];
	boolean isEmpty() 
	{
		return (top < 0);
	}
	   StackImplement() 
	   {
		   top = -1;
	   }
	   boolean push(int x) {
		   if(top >= (Max -1)) {
			   System.out.println("Stack Overflow");
			   return false;
		   }
		   else {
			   arr[++top] = x;
			   System.out.println(x+ " push into stack ");
			   return true;
		   }
	   }
         int pop() {
        	 if(top < 0) {
        		 System.out.println("Stack Underflow");
        		 return 0;
        	 }
        	 else {
        		 int x = arr[top--];
        		 return x;
        	 }
         }
         int peek () {
        	 if(top < 0) {
        		 System.out.println("Stack UnerFlow");
        		 return 0;
        	 }
        	 else {
        		 int x =arr[top];
        		 return x;
        	 }
         }
	public static void main(String[] args) {
		StackImplement stack = new StackImplement();
		stack.push(16);
		stack.push(18);
		stack.push(20);
	    stack.push(50);
		System.out.println(stack.pop()+" popped from stack ");
		System.out.println(stack.peek()+" on top in stack ");

	}

}
