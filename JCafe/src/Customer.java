import java.util.Scanner;

public class Customer {
	Scanner s= new Scanner(System.in);
	void customerMethod()
	{
		
System.out.println("*** JCafe Welcome you ***\n\n");
		
		
		Register reg= new Register();
			reg.newRegister(1);
			
			boolean yn=false;
			
			while(yn==false)
			{
				System.out.println("\nWould you like to Order Something \nYes:Y No:N");
				
				char c=s.next().charAt(0);
				if(c == 'Y' ||c == 'y')
					break;
			}
		MenuItem mi=new MenuItem();
		System.out.println("\nAre you vegetarian \nYES: y No:n");
		
		char c2=s.next().charAt(0);
		if(c2 == 'y' ||c2 == 'Y')
		{System.out.println("\n\nHere is Meatless Masterpieces\n\nItemCode Name");
			mi.veg();}
		
		else
		mi.nonveg();
		
		//mi.showMenu();
	}

}
