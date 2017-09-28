import java.util.Scanner;

public class Payment {
	String cc10;
	String r30 ;
	Payment(){
		 cc10="CC10";
		 r30 ="R30";
	}
Scanner s= new Scanner(System.in);
int amountTotal,dis;

	void makePayment(int amount){
		amountTotal=amount;
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
			if(givenCash<amountTotal)
			{
				System.out.print(" More $"+(amountTotal-givenCash));
				break;	
			}
			System.out.println(" Return $"+(givenCash-amountTotal));
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
		if(code.equals(cc10))
		{
		int d=(int) (amountTotal*0.10);
		amountTotal=amountTotal-d;
		System.out.println("amount payable after discount $"+amountTotal);
		return 1;
			
		}
		if(code.equals(r30))
		{
			int d=(int) (amountTotal*0.30);
			amountTotal=amountTotal-d;
		System.out.println("amount payable after discount $"+amountTotal);
			return 1;
		}
		return 0;
	}
	

}
