import java.util.Scanner;
public class InputFromUser
 {
    public static void main(String[]args)
    {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number a =   ");
        a=obj.nextInt();
        System.out.print("Enter the second number b =  ");
        b=obj.nextInt();
        System.out.println("your input number is a             := "+a);
        System.out.println("Your input number is b             := "+b);
        System.out.println("Addition of two number a + b is    := "+(a+b));//addition operator
        System.out.println("Product of two  number a * b is    := "+(a*b));//multiplication operator
        System.out.println("Subtraction of two number a - b is := "+(a-b));//substraction operator
        System.out.println("Division of two number a/b is      := "+(a/b));//division operator
        System.out.println("moduler of two number a % b is     := "+(a%b));//moduler operator
        obj.close();
    }
}