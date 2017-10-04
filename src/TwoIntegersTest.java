import java.util.Scanner;

public class TwoIntegersTest 
{
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter number1: ");
	int num1 = keyboard.nextInt();
	System.out.println("Please enter number2: ");
	int num2 = keyboard.nextInt();
	
	TwoIntegers Goran = new TwoIntegers(num1,num2);
	
	System.out.println(Goran.arithmetic());
	
	Integer higher = Goran.compare();
	
	if (higher == null) 
	{
		System.out.println("These numbers are equal.");
	}
	else
	{
		System.out.println(Goran.compare() + " is larger.");
	}
	
	if (Goran.oddOrEvenNum1()) 
	{
		System.out.println(Goran.getNum1() + " is even");
	} 
	else 
	{
		System.out.println(Goran.getNum1() + " is odd");
	}
	if (Goran.oddOrEvenNum2()) 
	{
		System.out.println(Goran.getNum2() + " is even");
	} 
	else 
	{
		System.out.println(Goran.getNum2() + " is odd");
	}
	if (Goran.isMultiple()) 
	{
		System.out.println(Goran.getNum1() + " is a multiple of " + Goran.getNum2());
	} 
	else 
	{
		System.out.println(Goran.getNum1() + " is not a multiple of " + Goran.getNum2());
	}
}
}
