import java.util.Scanner;

public class Register {
	
	String fname=" ",  email=" ";
	String phone=" ";
	int noOfPeople;
	Scanner s=new Scanner(System.in);
	
	void newRegister()
	{
		int t;
		System.out.println("Enter First Name: ");
		fname=s.nextLine().toString();
		t=fname.length();
		while(t<3)
		{System.out.println("Enter Valid Name: ");
		fname=s.nextLine().toString();
		t=fname.length();
		}
		
		
		System.out.println("Enter E-mail id: ");
		email=s.nextLine().toString();
		t=email.length();
		while(t<15){
			System.out.println("Enter Valid Email: ");
			email=s.nextLine().toString();
			t=email.length();
		}
		
		
		System.out.println("Enter Phone no.: ");
		phone=s.nextLine();
		t=phone.length();
		while(t<10)
		{		System.out.println("Enter Valid Number: ");	
		phone=s.nextLine();		
		t=phone.length();
		}
		
		System.out.println("Number of People with you ");
		noOfPeople=s.nextInt();
		if(noOfPeople>30)
		{
			System.out.println("Sorry for Inconvenience but we have limit of 30 pepole max. Other "+(noOfPeople-30)+" has to wait");
			
		}
		
		
		System.out.println("Registered Successfully !! \n\"CC10\" use this code for 10% discount");
	}
	
	String getName()
	{
		return fname;
	}
	
}
