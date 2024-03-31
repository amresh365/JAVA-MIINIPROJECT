package studentdata;

import java.util.Scanner;

public class StudentDataBaseApp {
public static void main(String[] args) {
	
	 System.out.println("Enter number of New Student TO Inrolled");
	 
	 Scanner in=new Scanner(System.in);
	 int NumberOfStudent=in.nextInt();
	 
	 
	 Student[] students=new Student[NumberOfStudent];
	 for(int n=0;n<NumberOfStudent;n++)
	 {
		    Student stu=new Student();
			stu.enroll();
			stu.payment();
			students[0]=stu;
			System.out.println(stu.toString());
	 }
	 
System.out.println("-------------------------------------------------------");
System.out.println(students[0].toString());
	 
	 
	 }
}

