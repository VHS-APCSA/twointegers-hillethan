import java.util.Scanner;
public class TIRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		System.out.println("Enter another integer: ");
		int num2 = input.nextInt();
		
		TwoIntegers twoInt = new TwoIntegers(num, num2);
		System.out.println(twoInt.arithmetic());
		System.out.println(twoInt.larger() + " is the larger integer.");
		System.out.println("is the sum of " + num + " and " + num2 + " even? " + twoInt.isEven());
		System.out.println("is " + num + " divisible by " + num2 + "? " + twoInt.isEven());
		
		
		
		
	}
}
