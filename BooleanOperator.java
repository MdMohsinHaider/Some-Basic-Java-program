import java.util.Scanner;
public class BooleanOperator
{  
 public static void main(String[] args) 
   {  
     Scanner obj=new Scanner(System.in);
     System.out.print("Enter the number a :-  " );  
     int a=obj.nextInt(); //input from user number "a"
     System.out.print("Enter the number b :-   ");
     int b=obj.nextInt();//input from user number "b"
     boolean b1=true;
     boolean b2=false;
     if(a<b)
       {
           System.out.println("a<b   "+b1);
        }
        else if(a>b)
        {
            System.out.println("a>b   "+b1);
        }
        else if(a==b)
        {
            System.out.println("a==b   "+b1);
        }
        else
        {
            System.out.println(b2);
        }
        System.out.println(" a&b :- "+(b1&b2));
        System.out.println(b2&b1);
        System.out.println(b2&b2);
        System.out.println(b1&b1);
        System.out.println(b1|b2);
        System.out.println(b2|b1);
        System.out.println(b1|b1);
        System.out.println(b2|b2);
        System.out.println(a!=b);
        System.out.println(b!=a);
        obj.close();
    } 
}            