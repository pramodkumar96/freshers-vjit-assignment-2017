import java.util.Scanner;

public class JCafeMainClass {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		
		System.out.println("*** JCafe Welcome you ***\n\tSir/Madam\n\n");
		
		
		Register reg= new Register();
			reg.newRegister();
			
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
		if(c2 == 'y' ||c2 == 'y')
		{System.out.println("\nHere is Meatless Masterpieces \nItemCode Name");
			mi.veg();}
		
		else
		mi.nonveg();
		
		//mi.showMenu();
		

	}

}
