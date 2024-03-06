package programming;
import java.util.*;
public class TechNumber {
	public static void main(String[] args) {
		int n,num,sum=0,count=0;
		int prod=1;
	//	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	n=sc.nextInt();
	num=n;
//	int techNo[]=new int[size];
	
//	for( i=0;i<size;i++) {
//		techNo[i]=sc.nextInt();
//		
//	}
//	for(int i=0;i<techNo.length;i++) {
//		System.out.println("the techNo is:+techNo[i]");
		while(num>0) {
			count++;
			num=num/10;
		}
		if(count % 2==0)
		{
			int left=n%100;
			int ryt=n%100;
			sum=left+ryt;
			prod=sum*sum;
			
		  if(prod==n) {
			System.out.println( n+""+"number is a techNo");
			
		  	}
		  else {
				System.out.println( n+""+"number is a techNo");
					  
		  }
	}
	}
}




