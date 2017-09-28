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
			System.out.println("Select The Actor as\n1.Customer 2.Manager");
			actor=s.nextInt();
			switch (actor){
			case 1:Customer c=new Customer();
					c.customerMethod();
				break;
			case 2:Manager m=new Manager();
					m.managerMethod();
				break;
			}
			}
		}	
		
		catch(InputMismatchException e)
		{
			System.out.println("***Please Provide only integer***");
			start();
		}
	}
}
