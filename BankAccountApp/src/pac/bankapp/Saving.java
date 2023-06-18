package pac.bankapp;
public class Saving extends Account {
	
	private int saftyDepositBoxID;
	private  	 int saftyDepositBoxKEY;
	
	
public Saving(String name,String sSN,double initDeposit)
{   
	super(name,sSN,initDeposit);
	AccouuntNumber="1"+AccouuntNumber;
	SetSaftyDepositBox();    
}

public void showInfo() {
	System.out.print("Account Type Saving :");
	super.showInfo();	
	System.out.println("Your Savings Is:"+"\nSafty DepositBoxID: "+saftyDepositBoxID+ "\nSafty DepositKEY: "+saftyDepositBoxKEY);
}
	
@Override
public void setRate()
{
	rate=getBaseRate()*.15;
}

private void SetSaftyDepositBox()
{
	saftyDepositBoxKEY=(int) (Math.random()*Math.pow(10,3));
	saftyDepositBoxID=(int) (Math.random()*Math.pow(10,4));
}




}
