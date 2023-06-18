package pac.bankapp;

public abstract class Account implements IBaseRate {
   private  String name;
   private String sSN;
   private double balance;
    protected String AccouuntNumber="11333223459";
    protected double rate;
	private static int  index=1000;
 public	Account(String name,String sSN,double initDeposit)
 {   
	 this.name=name;
	 this.sSN=sSN;
	 this.balance=initDeposit;
	 index++;
	 this.AccouuntNumber=SetAccountNumber();
	 setRate();
 }
 
  public abstract void setRate();
 
 private String SetAccountNumber()
 {
	 String LastwosSn=sSN.substring(sSN.length()-2, sSN.length());
	 int UniqueID=index; 
	 int randomNumber= (int)(Math.random()*Math.pow(10, 3));
	 return LastwosSn+UniqueID+randomNumber;
 }
 
 public void compound()
 {   double accouredinterest=balance*(rate/100);
	 balance=balance+accouredinterest;
	
	 System.out.println("Your Accoured interest: $"+accouredinterest);
	 printbalance();
 }
 public void Deposit(double amount)
 {
	 balance=balance+amount;
	 System.out.println("Depositing Ammount $"+balance);
	 printbalance();
 }
 public void withdraw(double amount)
 {
	 balance=balance-amount;
	 System.out.println("Witrawing Ammount $"+amount);
	 printbalance();
	 
 }
 public void transfer(String toWhere,double amount)
 {
	 System.out.println("Transfering Amount $"+amount+"to "+toWhere);
 }
 
 public void printbalance()
 {
	 System.out.println("Your Balance Is Now $:"+balance);
 }
 
 public void showInfo()
 {
	 System.out.println("\nNAME: "+name+"\nAccountNumber "+AccouuntNumber+"\nBalance "+balance+
			 "\nRate: "+rate);
 }	
}
