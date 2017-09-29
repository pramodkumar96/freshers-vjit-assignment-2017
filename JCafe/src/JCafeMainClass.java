import java.util.InputMismatchException;
import java.util.Scanner;

public class JCafeMainClass {

	private static Scanner s;
	private static int actor;

	public static void main(String[] args) {
	start();
	
	}

	static void start()
	{
		s = new Scanner(System.in);
		try{
			while(true){
			System.out.println("\nJCafe Resturant by Pramod Kumar\n1.Walk in and eat\n2.Order Online\n3.Know About Us");
			actor=s.nextInt();
			switch (actor){
			case 1:Customer c=new Customer();
					c.customerMethod();
				break;
			case 2:OrderOnline m=new OrderOnline();
					m.managerMethod();
				break;
			case 3:CafeInfo cf=new CafeInfo();
			cf.info();
		break;
			}
			}
		}	
		
		catch(InputMismatchException e)
		{
			System.out.println("***Please Provide Correct input value***");
			start();
		}
	}
}
