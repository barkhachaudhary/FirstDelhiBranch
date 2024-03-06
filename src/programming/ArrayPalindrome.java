package programming;
import java.util.*;
public class ArrayPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int flag=1;
		int []marks=new int [size];
		System.out.println("Enter name of "+size+" students");
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++) {
			
		if(marks[i]!=marks[size-1-i]) 
		{
			flag=0;
			break;
			
		}
	}
	if(flag==1) {
		System.out.println("Number is palindrome");
		}
	else {
		System.out.println("Number is not palindrome");

		}
}
}
