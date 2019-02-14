package homework3; //inheritance

import java.util.Scanner;

public class LibraryCard extends Student{
		public static void main(String[] args) {
		Student s = new Student();	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String tempfirst = in.next();
		String first = tempfirst;
		System.out.println("Enter Last Name: ");
		String templast = in.next();
		String last = templast;
		System.out.println("Your Libary card Name is: ");
		name (first, last);
	    
	    }
	}
	
	


	