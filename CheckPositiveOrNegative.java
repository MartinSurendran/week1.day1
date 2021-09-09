package week1.day1.assignments;

public class CheckPositiveOrNegative {
	// To check if a Number is Positive or Negative
	
	public static void main(String[] args) {
		int number = -1;
		
		if (number < 0) // To check if number is Negative i.e. less than 0
		{
			System.out.println("The entered number "+number+" is a Negative Number");
		}
		else if (number == 0) // To check if number is 0 i.e. neither positive nor negative
		{
			System.out.println("The entered number is "+number+" and its neither a Positive nor a Negative number");
		}
		else 
		{
			System.out.println("The entered number "+number+" is a Positive Number");
		}
	}

}
