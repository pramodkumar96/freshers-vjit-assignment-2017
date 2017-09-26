import java.util.Scanner;

public class Payment {
Scanner s= new Scanner(System.in);

	void makePayment(int amount){
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
			System.out.println("Swipe Card at counter.");
			break;
		case 3:
			System.out.println("Swipe Card at counter.");
			break;
		case 4:
			System.out.println("Pay on this Number 9988122333");
			break;
		}
		
			
			
			
	}
}
