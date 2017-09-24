import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MenuItem {

	
	Hashtable<Integer,String> itemName=new Hashtable<Integer,String>();  
	Hashtable<Integer,Integer> itemPrice=new Hashtable<Integer,Integer>();
 
Scanner s=new Scanner(System.in);
void Create()
{
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


select();

}
void select()
{
  
	for(Map.Entry m:itemName.entrySet()){  
		if(m.getKey().equals("100"))
		{System.out.println("Starter's \n");}
		if(m.getKey().equals("104"))
		{System.out.println("Main Course \n");}
		if(m.getKey().equals("108"))
		{System.out.println("Desert \n");}
	 System.out.println(m.getKey()+" "+m.getValue());  
	}  

boolean select=true;
while(select){
	System.out.println("Enter Menu Code to select\n");
int code=s.nextInt();

for(Map.Entry m:itemName.entrySet()){  

	if(m.getKey().equals(code))
		{System.out.println(m.getValue());
		for(Map.Entry n:itemPrice.entrySet())
		{	if(n.getKey().equals(code))
			System.out.println(" "+n.getValue());
		
		System.out.println("\nSelect one more item Y:Yes N:No");
		char c=s.next().charAt(0);
		if (c=='Y' || c=='y')
				{
			select();
				}
		else if (c=='n' || c=='N')
		{
select=false;

		}
		else
		{
System.out.println("\nEnter Y or N ");
		}
		}	//2st for loop
	} //1st for loop
}
}	//while loop




}

}
