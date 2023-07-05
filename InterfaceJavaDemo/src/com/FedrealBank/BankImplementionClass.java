package com.FedrealBank;

import java.util.Scanner;

public class BankImplementionClass implements BankAdmin, BankOP
{
	Scanner c = new Scanner(System.in);
			

	@Override
	public void BankName() 
	{
		System.out.println("Enter the Bank Name:");
		String Bankname = c.next();
		System.out.println("Bank Name :"+Bankname);
	}

	@Override
	public void NoOfEmp() 
	{
		System.out.println("Enter the number of Employee");
		int NoEmp = c.nextInt();
		System.out.println("No of Employee working in the bank are :" +NoEmp);
	}

	@Override
	public void BankOfATM() 
	{
		int NoAtm;
		System.out.println("Enter number of ATM available for the Bank");
		NoAtm = c.nextInt();
		System.out.println("No of ATM available for the Bank :" +NoAtm);
		
	}

	
	
}
