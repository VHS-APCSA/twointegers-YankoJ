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
	Goran.setNum1(10);
	Goran.setNum2(5);
	System.out.println(Goran.arithmetic());
}
}
