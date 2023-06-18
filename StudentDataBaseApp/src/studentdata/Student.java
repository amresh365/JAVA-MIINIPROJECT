package studentdata;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int   gradYear;
	private String  StudentID;
	private String courses;
	private int  tutionBalance=0;
	private static int coastOfCourse=600;
	public static int id=1000;
	
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter The Student FirstName: ");
		this.firstName= in.nextLine();
		
		System.out.print("Enter the Student LastName");
		this.lastName=in.nextLine();
		
		System.out.println("1- freshmen\n2-for sophmore\n3- for junear\n4-for senior\nEnter the level: ");
		this.gradYear=in.nextInt();
		
		setStudentId();
		
		System.out.println(firstName+" "+lastName+" "+gradYear+" "+StudentID);
		
	}
	public void setStudentId()
	{   id++;
		this.StudentID=gradYear+""+id;
	}
	
	
	public void enroll()
	{
		do{System.out.println("Enter Course to enroll(Q to quite) ");
		Scanner in= new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q"))
		{
			courses=courses+"\n"+course;
			tutionBalance=tutionBalance+coastOfCourse;
		}
		else {
			break;
		}
		}while(1!=0);
		
		System.out.println("ENROLLED IN:"+courses);
		System.out.println("TUTION BALANCE :"+tutionBalance);
	}
	
	public void viewBalence()
	{
		System.out.println("Your Balance Is:$"+tutionBalance);
	}
	
	public void payment()
	{   int payment;
	    
	    System.out.println("Enter Yhe Amount $:");
		Scanner in=new Scanner(System.in);
		payment=in.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("Thank you for Payment$"+payment);
		viewBalence(); 
	}
	
	public String toString()
	{
		return "Your Information Is:\n"+firstName+" "+lastName+"\nCources Enrolled:"+courses+"\nBalance:"+tutionBalance;
	}
	
	
}
