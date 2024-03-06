package Exception;
import java.util.*;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("main method start");
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("you did wrong");
			System.out.println(e.getMessage);
			e.printStackTrace();
			
		}
		System.out.println("main method ends");
	}

}
