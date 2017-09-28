import java.util.Scanner;

public class Payment {
Scanner s= new Scanner(System.in);
int amount,dis;
	void makePayment(int amount){
		this.amount=amount;
		System.out.println("Do you have any COUPON code: ? Yes:Y No:N\n");
		char c2=s.next().charAt(0);
		if(c2 == 'y' ||c2 == 'y')
		{
			discount();		
			
		}
		
		System.out.println("Select the Payment Type\n");
		
		System.out.println("1.CASH");
		System.out.println("2.Debit Card");
		System.out.println("3.Credit Card");
		System.out.println("4.PayTm or PhonePe");
		
		int type=s.nextInt();
		switch(type)
		{case 1:
			System.out.print("Enter Cash ");
			int givenCash=s.nextInt();
			if(givenCash<amount)
			{
				System.out.print(" More $"+(amount-givenCash));
				break;	
			}
			System.out.println(" Return $"+(givenCash-amount));
			break;
		case 2:
			System.out.println("Swipe Card");
			break;
		case 3:
			System.out.println("Swipe Card");
			break;
		case 4:
			System.out.println("Pay on this Number 9988122333");
			break;
		}
		
			
			
			
	}
	private int discount() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter Code: ");
		String code=s.next().toString().toUpperCase();
		if(code.equals("CC10"))
		{
		float d=(float) (amount*0.10);
		dis-= (int) (amount-d);
		amount=amount-dis;
		System.out.println("amount payable after discount $"+amount);
		return 1;
			
		}
		if(code.equals("R30"))
		{
		float d=(float) (amount*0.30);
		dis-= (int) (amount-d);
		
		System.out.println("amount payable after discount $"+amount);
			return 1;
		}
		return 0;
	}
	

}
