package homework3;

import java.util.Scanner;

public class LogicalSt {

	public static void main(String[] args) {
		int studentid = 111; //Student Id of the student
		String first = "MOHAMMAD"; //First name of the student
		String last = "HOSSAIN";  //Last name of the student
		
		System.out.println("Checking student's credibility: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Please your first name: ");
		String first1 = in.next();
		System.out.println("Please your last name: ");
		String last1 = in.next();
		System.out.println("Please your Student ID: ");
		int studentid1 = in.nextInt();
		
		if (first1.equals(first)) {
				if (last1.equals(last)) {
					if (studentid1 == studentid) {
						System.out.println("Welcome! your name is in our databse.");
					}else {
						System.out.println("Sorry, your name is not in our databse");
					}
					
				}else {
					System.out.println("Sorry, your name is not in our databse");
				}
				
				} else {
					System.out.println("Sorry, your name is not in our databse");
				}
				
			}
		
		
		}
		
	


