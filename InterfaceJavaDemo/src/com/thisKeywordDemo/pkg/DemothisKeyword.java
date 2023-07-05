package com.thisKeywordDemo.pkg;

public class DemothisKeyword 
{

	int empid;
	String empName;
	String location;
	
	DemothisKeyword(int empid, String empName, String location )
	{
		this.empid=empid;
		this.empName=empName;
		this.location=location;
		
	}
	
	public void EmpDetails()
	{
		System.out.println("The Employee Details is :" +empid+" "+empName+" "+location);
	}
	
	public static void main(String args[])
	{
		DemothisKeyword dtk = new DemothisKeyword(101, "Tushar Rajput", "Jalgaon");
		DemothisKeyword dtk1 = new DemothisKeyword(102, "Kalyani Rajput", "Pune");
		
		dtk.EmpDetails();
		dtk1.EmpDetails();
	}
}
