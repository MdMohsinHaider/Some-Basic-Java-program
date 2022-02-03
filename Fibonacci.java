import java.util.Scanner;

class Fibonacci
{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i;
     System.out.println("Enter the number");
     Scanner obj=new Scanner(System.in);
     int count=obj.nextInt();  //input from users
     System.out.print(n1+" "+n2); //printing 0 and 1 
     obj.close();   
        
     for(i=2;i<count;++i) //loop starts from 2 because 0 and 1 are already printed    
      {    
       n3=n1+n2;    
       System.out.print(" "+n3);    
       n1=n2;    
       n2=n3;    
      }    
       
    }
}  