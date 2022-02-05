import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=obj.nextInt(); // input from user 
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
        obj.close();
    }
}