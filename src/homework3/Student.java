package homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Student {
	private int studentid;//Student Id of the student
	private String first; //First name of the student
	private String last;  //Last name of the student
	private String dob;   //Date of birth of the student
	
	public Student() {}
	
	public Student(int studentid, String first, String last, String dob) {
		this.studentid = studentid;
		this.first = first;
		this.last = last;
		this.dob = dob;
	}
	
	public int getstudentid() {
		return studentid;
	}
	
	public void setstudentid(int studentid) {
		this.studentid = studentid;
	}
	
	public String getfirst() {
		return first;
	}
	
	public void setfirst(String first) {
		this.first = first;
	}
	
	public String getlast() {
		return last;
	}
	
	public void setlast(String last) {
		this.last = last;
	}
	
	public String getdob() {
		return dob;
	}
	
	public void setdob(String dob) {
		this.dob = dob;
	}
	
	public static void name(String first, String last) {
		String Studentname = first + last;
		System.out.println(Studentname);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Please enter number of student: ");
		n  = in.nextInt();
		
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Student ID (numeric) : ");
			int studentid = in.nextInt();
			System.out.print("Enter the first name of the student: " + "\n");
			String first = in.next();
			System.out.print("Enter the last name of the student: " + "\n");
			String last = in.next();
			System.out.println("Enter date of birth of the student (MM/DD/YYYY) : ");
			String dob = in.next();
	        students[i] = new Student(studentid, first, last, dob);
	        
		}
		
		for (int i = 0; i < n; i++) {
			 int j = i+1;
			 System.out.println("Information of Student#:" + j);
			 System.out.print("Student ID: " + students[i].studentid +", ");
		     System.out.print("First Name: " + students[i].first + ", ");
		     System.out.print("Last Name: " + students[i].last + ", ");
		     System.out.println("Date of Birth: " + students[i].dob);
			
		}
		}
			
	}	
		
	