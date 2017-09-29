
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MenuItem extends OrderOnline{


	Hashtable<Integer,String> itemName=new Hashtable<Integer,String>();  
	Hashtable<Integer,Integer> itemPrice=new Hashtable<Integer,Integer>();
 
Scanner s=new Scanner(System.in);

String bill;
int totalAmount;
int wioo;

MenuItem(){
	bill=" ";
	
}
MenuItem(int n){
	wioo=n;
	
}
void nonveg()
{
	
	System.out.println("Enter Menu Code to select...\nItemCode Name");
	//menu for non veg
	itemName.put(100,"chicken 65");  
	itemName.put(101,"french fries");  
	itemName.put(102,"Mashroom");  
	itemName.put(103,"fish chips");  

	itemName.put(104,"Chicken Briayni");  
	itemName.put(105,"Mutton Briayni");  
	itemName.put(106,"Bamboo Chicken");  
	itemName.put(107,"Tandori");  

	itemName.put(108,"Cup Cake");  
	itemName.put(109,"Ice Cream");  
	itemName.put(110,"Gulab jamun");  
	itemName.put(111,"Meetha Pan");  
	
	itemPrice.put(100,80);  
	itemPrice.put(101,70);  
	itemPrice.put(102,90);  
	itemPrice.put(103,90);  
	itemPrice.put(104,130);  
	itemPrice.put(105,150);  
	itemPrice.put(106,170);  
	itemPrice.put(107,150);  
	itemPrice.put(108,20);  
	itemPrice.put(109,25);  
	itemPrice.put(110,10);  
	itemPrice.put(111,15);  
  
//calling veg method
veg();

}
public void veg() {
	
	
	itemName.put(112,"Palak paneer");  
	itemName.put(113,"Dal makhani");  
	itemName.put(114,"Khichdi");  
	itemName.put(115,"Chole bhature");  

	itemName.put(116,"Daal puri");  
	itemName.put(117,"Gajar ka halwa");  
	itemName.put(118,"Rasgulla");  
	itemName.put(119,"Laddu");  
	
	itemPrice.put(112,80);  
	itemPrice.put(113,60);  
	itemPrice.put(114,30);  
	itemPrice.put(115,40);  
	itemPrice.put(116,50);  
	itemPrice.put(117,40);  
	itemPrice.put(118,40);  
	itemPrice.put(119,20);  
	
	for(Map.Entry m:itemName.entrySet()){
		int i=(int) m.getKey();
		if(i>112)
		{System.out.print("");}
	
			System.out.println(m.getKey()+"\t "+m.getValue());
	}
	select();
	}


void select()
{
 
boolean select=true;
while(select){
	
int code=s.nextInt();
if(code<100||code>119)
{System.out.println("********Invalid item********"); }

for(Map.Entry m:itemName.entrySet()){  
	if(m.getKey().equals(code))
		{
		//Print the Name of menu
		System.out.print(m.getValue());
		for(Map.Entry n:itemPrice.entrySet())
		{	if(n.getKey().equals(code))
			{
			//Print the price of menu
			System.out.print(" Enter Quantiy: ");
			int q=s.nextInt();
			int amount =((int) n.getValue())*q;
			totalAmount+=amount;
			String msg=" "+m.getValue()+" "+n.getValue()+" * "+q+" = "+amount+"\n";
			bill+=" "+msg;
			System.out.println(msg+"\n*****");
			System.out.println("\nSelect one more item Y:Yes N:No");
			char c=s.next().charAt(0);
			if (c=='Y' || c=='y')
					{
				System.out.println("Enter Menu Code to select...\n");
				select();
					}
			else if (c=='n' || c=='N')
			{
	select=false;
	break;	}
			
			}
		
		}	//2st for loop
	 //1st for loop
		}
	
}//while loop

}
int gst=(int) (totalAmount*0.09);


if(wioo==2)
{
	System.out.print("Your Order Summary \n"+bill+"\nAmount: "+totalAmount+"\nGST: "+gst+"\nDelivery charges: 40"+"\nGrand Total: ");
	totalAmount+=gst+40;
	System.out.println(totalAmount);
	amount=totalAmount;
	OrderOnline oo=new OrderOnline(amount);
	oo.pay();
}
else
{
System.out.print("Your Order Summary \n"+bill+"\nAmount: "+totalAmount+"\nGST: "+gst+"\nGrand Total: ");
totalAmount+=gst;
System.out.println(totalAmount);
	//calling payment method
	Payment p= new Payment();
	p.makePayment(totalAmount);
}
	
	
}

}
