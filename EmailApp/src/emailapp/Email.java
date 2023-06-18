package emailapp;

import java.util.Scanner;

public class Email {

    private String FirstName;
	private String LastName;
	private String passWord;
	private String departMent;
	private int mailBoxCapacity=500;
	private int defaultPassWordLength=10;
	private String alternateEmail;
	private String email;
	private String companySuffic="aeycompny.com";
	
	
	public Email(String firstName,String lastName)
	{
		this.FirstName=firstName;
		this.LastName=lastName;
		
		this.departMent=setDepartMent();
		
		this.passWord=randomPassword(defaultPassWordLength);
		System.out.println("Your password Is:"+passWord);
		
		email=FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+departMent+"."+companySuffic;
	
	}
	
	
	private String setDepartMent()
	{
		System.out.print("New Worker:"+FirstName+"\n1 for sals \n2 forDeplopMent\n3 forAccounting \n0 for none\nEnter the DepartMent!");
		Scanner in=new Scanner(System.in);
		int depchoice=in.nextInt();
		if(depchoice==1)
		{
			return "sales";
		}
		else if(depchoice==2)
		{
			return "DeplopMent";
		}
		else if(depchoice==3)
		{
			return "Accounting";
		}
		else {
			return "";
		}
	}
	
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%*";
		
		char password[]=new char[length];
		
		for(int i=0;i<length;i++)
		{
		int rand=	(int) (Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
  public void SetmailBoxCapacity(int capacity)
  {
	  this.mailBoxCapacity=capacity;
  }
  
  public void SetAlterNateEmail(String altMail)
  {
	  this.alternateEmail=altMail;
  }
  
  public void changePassword(String password)
  {
	  this.passWord=password;
  }
	
  public int getMailcapacity() {
	  return mailBoxCapacity;
  }
  public String getAlterNetEmail()
  {
	  return alternateEmail;
  }
  public String getPassword()
  {
	  return passWord;
  }
   
  public String showInfo()
  {
	return "DISPLAY NAME :"+FirstName+" "+LastName+"\nCOMPNY EMAIL:"+email+"\nMAILBOX CAPACITY:"+mailBoxCapacity+"mb";
  }
  
  
  
}
