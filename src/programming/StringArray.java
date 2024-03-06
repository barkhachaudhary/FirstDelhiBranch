package programming;

import java.util.*;

public class StringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		String s[] = new String[size];
		System.out.println("Enter name of "+size+);
	    
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextLine();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.println(s[i]);

		}

	}

}
