import java.util.Scanner;

public class OrderOnline {
	Scanner s= new Scanner(System.in);
	String cc10="CC10";
	String r30="R30";
	int amount;
	OrderOnline()
	{}
	OrderOnline(int a)
	{
		amount=a;
	}
	void managerMethod()
	{
		
System.out.println("*** JCafe Welcome you ***\n\n");
		
		Register reg= new Register();
		reg.newRegister(2);
		System.out.println("\nEnter Address: ");
		String address=s.nextLine();
	
		
		
		MenuItem mi=new MenuItem(2);
		System.out.println("\nNeed only Vegetarian menu\nYES: y No:n");
		
		char c2=s.next().charAt(0);
		if(c2 == 'y' ||c2 == 'Y')
		{System.out.println("\n\nHere is Meatless Masterpieces\n\nItemCode Name");
			mi.veg();}
		
		else
		mi.nonveg();
		
		
	}
	
	void pay(){

		System.out.println("Do you have any COUPON code: ? Yes:Y No:N\n");
		char c3=s.next().charAt(0);
		if(c3 == 'y' ||c3 == 'Y')
		{
			
			discount(amount);		
			
		}
		
		System.out.println("\nPay or Swipe after Delivery\n");
		
		Feedback fb=new Feedback();
		fb.takeFeedBack();
		
		System.out.println("\n*********************THANK YOU ORDER US AGAIN***********************\n\n");
		String[] args = null;
		JCafeMainClass.main(args);
		
	}
	
	private int discount(int amountTotal) {
		// TODO Auto-generated method stub
		System.out.print("\nEnter Code: ");
		String code=s.next().toString().toUpperCase();
		if(code.equals(cc10))
		{
		int d=(int) (amountTotal*0.10);
		amountTotal=amountTotal-d;
		System.out.println("amount payable after discount $"+amountTotal);
		return amountTotal;
			
		}
		if(code.equals(r30))
		{
			int d=(int) (amountTotal*0.30);
			amountTotal=amountTotal-d;
		System.out.println("amount payable after discount $"+amountTotal);
			return amountTotal;
		}
		System.out.println("Invalid coupon");
		return amountTotal;
	}
}
