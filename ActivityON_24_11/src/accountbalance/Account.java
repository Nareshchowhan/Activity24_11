package accountbalance;

import java.util.Scanner;

public class Account {
	
	public void deposit() {
		System.out.println("deposit amount");
		
		
	}
	
	public  void withdraw(int balance) throws UserDefineException{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Withdraw amount");
		  balance = sc.nextInt();
		 
		 if(balance<=500) {
			 
			 throw new UserDefineException("please maintain minimum balance");
			 
		 }
		 
		 else {
			 
			 System.out.println("please collect the amount");
		 }
	 }
	
	

	public static void main(String[] args) {
		
		Account a = new Account();
		a.deposit();
		
		try {
			
			a.withdraw(0);
		}catch(Exception e)
		{
			System.out.println(e);
					
		}
	}
}
