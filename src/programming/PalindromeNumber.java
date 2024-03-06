package programming;
import java.util.*;
public class PalindromeNumber {
	// palindrome number=it is a reverse number of that number for ex.151,111
	public static void main(String[] args) {
		int n;
		int d,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	n=sc.nextInt();
	int copy=n;
	while(n>0) {
		d=n%10;//151
		sum=(sum*10)+d;//0*10=0+1=1
		n=n/10;//15,1
	}
	if(copy==sum) {
		
	
	  System.out.println("It is palindrome Number");
		
	}
	else
	  
		System.out.println("It is not palindrome Number");
	


}
}
