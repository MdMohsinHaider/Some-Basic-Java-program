import java.util.Scanner;
public class Relation
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number  ");
        int a = obj.nextInt();
        System.out.print("Enter the number  ");
        int b = obj.nextInt();
        System.out.println("");
        System.out.println("Check the relation    a==b :-    "+(a==b));
        System.out.println("Check the relation    a!=b :-    "+(a!=b));
        System.out.println("Check the relation    a<=b :-    "+(a<=b));
        System.out.println("Check the relation    a>=b :-    "+(a>=b));
        obj.close();
    }
}