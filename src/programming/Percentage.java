package programming;
import java.util.*;
public class Percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[]marks=new int[size];
		int sum=0;
		//double percent=0;
		System.out.println("enter marks of"+size+"students");
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=size-1;i>0;i--) { //For reverse number
			System.out.println(marks[i]);
		}
				
	 for(int i=0;i<marks.length;i++) {
	 System.out.println("the marks of student:+marks[i]");
		 sum=sum+marks[i];
	 
	 }
	   double percent=sum/size;
		System.out.println(percent);
		System.out.println("total of marks "+sum);
		
	}
	
	

}
