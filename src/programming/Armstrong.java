package programming;
import java.util.*;
public class Armstrong {	
	// ArmStrong number for example taken 153 as a number...sum of cube of 
	//individual num like 1*1*1+5*5*5+3*3*3
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number :");
	int n=sc.nextInt();
	int arm=n;
	int sum=0;

	while(n>0)
	{
     int y=n%10;
     sum=(y*y*y)+sum;
     n=n/10;
		
	}


	if(arm==sum)
	{
		System.out.println(" It is an armstrong number");
	}
	else
	{
		System.out.println("It is not armstrong number");
	}
}
}
