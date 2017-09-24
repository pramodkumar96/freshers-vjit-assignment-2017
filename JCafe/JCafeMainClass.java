import java.util.Scanner;

public class JCafeMainClass {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		boolean yn=false;
		System.out.println("*** JCafe Welcome you ***\n \tSir/Madam");
		
		while(yn==false)
		{
			System.out.println("\nWould you like to have a Order Something \nYes:Y No:N");
			
			char c=s.next().charAt(0);
			if(c == 'Y' ||c == 'y')
				break;
		}
		
		System.out.println("\nsup");
		MenuItem mi=new MenuItem();
		//mi.showMenu();
		mi.Create();

	}

}
