import java.util.Scanner;

public class Register {
	
	String fname;
	String email;
	String phone;
	int noOfPeople;
	Scanner s=new Scanner(System.in);
	
	Register(){
		 fname=" ";
		 email=" ";
		 phone=" ";
	}
	//wioo= walk in or order online
	void newRegister(int wioo)
	{
		int t;
		System.out.println("Enter First Name: ");
		fname=s.nextLine().toString();
		//
		t=fname.length();
		while(t<3)
		{System.out.println("Enter Valid Name: ");
		fname=s.nextLine().toString();
		t=fname.length();
		}
		
		
		System.out.println("Enter E-mail id: ");
		email=s.nextLine().toString();
		t=email.length();
		boolean condition=false;
		if(email.contains("@")&&email.contains(".com"))
		{
			condition=true;
		}
		
		while(t<=15||condition==false){
			System.out.println("Enter Valid Email: ");
			email=s.nextLine().toString();
			t=email.length();
			for(int i=0;i<email.length();i++)
			{
				if(email.contains("@")&&email.contains(".com"))
				{
					condition=true;
				}
				
			}
		}
		
		
		System.out.println("Enter Phone no.: ");
		phone=s.nextLine();
		t=phone.length();
		while(t<10)
		{		System.out.println("Enter Valid Number: ");	
		phone=s.nextLine();		
		t=phone.length();
		}
		
		
		if(wioo==1)
		{
		System.out.println("Number of People with you ");
		noOfPeople=s.nextInt();
		if(noOfPeople>30)
		{
			System.out.println("Sorry for Inconvenience but we have limit of 30 pepole max. Other "+(noOfPeople-30)+" has to wait");
			
		}
		
		
		System.out.println("Registered Successfully !! \n\"CC10\" use this code for 10% discount");
		}
		
		
		
	}
	
	public String getName()
	{
		return this.fname;
	}
	
}
