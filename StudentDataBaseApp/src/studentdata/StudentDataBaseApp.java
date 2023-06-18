package studentdata;

import java.util.Scanner;

public class StudentDataBaseApp {
public static void main(String[] args) {
	
	 System.out.println("Enter number of New  S	tudent TO Inrolled");
	 
	 Scanner in=new Scanner(System.in);
	 int NumberOfStudent=in.nextInt();
	 
	 
	 Student[] students=new Student[NumberOfStudent];
	 for(int n=0;n<NumberOfStudent;n++)
	 {
		    Student stu=new Student();
			stu.enroll();
			stu.payment();
			System.out.println(stu.toString());
	 }
	 }
}

