// Java program for simple calculator
import java.util.Scanner;
public class BasicCalculator 
{
	public static void main(String[] args)
	{
		double num1, num2;// stores two numbers in "num1"& "num2"
		Scanner sc = new Scanner(System.in);// input from the user
		System.out.print("Enter the first numbers a :-  ");
		num1 = sc.nextDouble();// take the inputs
        System.out.print("Enter the second number b :-  ");
		num2 = sc.nextDouble();
		System.out.print("Enter the operator & click (   +  or  -  or  *  or  /  or  %  ) :-  ");
		char op = sc.next().charAt(0);
		double o = 0;
		switch (op)
		{
		 case '+': // case to add two numbers
			o = num1 + num2;
			break;

		 case '-': // case to subtract two numbers
			o = num1 - num2;
		    break;

		 case '*': // case to multiply two numbers
			o = num1 * num2;
		    break;

		 case '/': // case to divide two numbers
			o = num1 / num2;
		    break;
		 case '%': // case to moduler two numbers
		    o = num1 % num2;
		    break;

		 default:
			System.out.println("You enter wrong input");
		    break;

		}
		System.out.println("The final result:");
		System.out.println();
		System.out.println(num1 + " " + op + " " + num2 + " = " + o); // print the final result

		sc.close();
	}
}
