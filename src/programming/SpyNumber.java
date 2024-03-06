package programming;
import java.util.*;
public class SpyNumber {
	// spy number=sum of digits equal to product of digits for ex:132
	public static void main(String[]args) {
		int n,count=0,sum=0,prod=1,d;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	n=sc.nextInt();
	while(n>0) {
		d=n%10; //2+3+1=6
		sum=d+sum;//sum=
		prod=d*prod;
		n=n/10;
	}
		if(sum==prod)
		{
			System.out.println("is spy number");
		}
		else
			System.out.println("is not spy number");
	}
	
	}
	


