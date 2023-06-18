package pac.bankapp;

public class Checking extends Account{
   private  int debitCardNumber;
   private int debitCardPIN;
    
	
	public Checking(String name,String sSN,double initDeposit)
	{   super(name,sSN,initDeposit);
		AccouuntNumber="2"+AccouuntNumber;
		SetDebitCard();
	}
	
	
	@Override
	public void setRate()
	{
	   rate=getBaseRate()*.15;
	  // System.out.println("this is set      Rate Mrtod");
	}
	
	private void SetDebitCard()
	{
		debitCardNumber=(int)(Math.random()*Math.pow(10,12));
	    debitCardPIN=(int)(Math.random()*Math.pow(10,4));
	}
	

public void showInfo()
{
	super.showInfo();
	System.out.println("Your Cheaking Accouunt Feature: "+"\nDebit Card Number: "+debitCardNumber+"\nDebit Card Pin"+debitCardPIN);
}
	
	
}
