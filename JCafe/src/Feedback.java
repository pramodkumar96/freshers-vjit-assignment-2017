import java.util.Scanner;

public class Feedback {
	Scanner s= new Scanner(System.in);
	String fb;
	
	void takeFeedBack(){
		
		
		System.out.println("Give your Suggestions/Query/Feedback");
		 fb=s.nextLine();
		
		System.out.println("Thank You for your valuable feedback !");
	}
	
	String getFeedback()
	{
		return fb;
	}
	
}
