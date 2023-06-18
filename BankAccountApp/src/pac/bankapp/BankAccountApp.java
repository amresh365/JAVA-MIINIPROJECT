package pac.bankapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) {
		List<Account>accounts=new LinkedList<Account>();
			
		//Read A CSV File Than Create A new Account Based on That Data  
		String file="C:\\Users\\91959\\Downloads\\NewBankAccounts.csv";
		
		List <String[]>newAccountholders=utility.CSV.read(file);
		
	   for(String accountholder[]: newAccountholders)
	   {
		   String name=accountholder[0];
		   String sSN=accountholder[1];
		   String accountType=accountholder[2];
		   double initDeposit=Double.parseDouble(accountholder[3]);
	
		if(accountType.equals("Saving"))
		{
			
			accounts.add(new Saving(name,sSN,initDeposit));
		}
		else if(accountType.equals("Checking")) {
			
			accounts.add(new Checking(name,sSN,initDeposit));
		}
		else {
			System.out.println("Error In Reading Account Type");
		}
		      
	   }
	   
	   
	   for(Account acc:accounts)
	   {
		   System.out.println("\n***************************************************");
		   acc.showInfo();
	   }
	   
		
	}

}
