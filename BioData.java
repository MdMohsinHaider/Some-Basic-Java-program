import java.util.Scanner;
public class BioData 
{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);//int "obj" objects
        Scanner obj2 = new Scanner(System.in);//String "obj2" objects

        System.out.print("Enter your age           =  ");//print age statement for user  
        int a = obj.nextInt();//input"a" age from user 

        System.out.print("Enter your name          =  ");//print name statement for user
        String b = obj2.nextLine();//input "b" name from user 

        System.out.print("Enter your Mother's name =  ");//print mothe's name statement for user
        String c = obj2.nextLine();//input "c" mother's name from user 

        System.out.print("Enter your Father's name =  ");//print Father's name statement for user
        String d = obj2.nextLine();//input "d" Father's name from user

        System.out.print("Enter your country name  =  ");//print country name statement for user
        String e = obj2.nextLine();//input "e" country name from user

        System.out.print("Enter your State name    =  ");//print state name statement for user
        String f = obj2.nextLine();//input "f" state name from user

        System.out.print("Enter your Distict name  =  ");//print Distict name statement for user
        String g = obj2.nextLine();//input "g" distict name from user

        System.out.print("Enter your mobile number =  ");//print mobile number statement for user
        long h = obj.nextLong();//input "h" mobile number from user

        System.out.println("");// space
        
        System.out.println("       Bio_Data");// heading print statement given

        System.out.println("");// space

              //printing statement starting("a to h")
        System.out.println("1. AGE           :-  "+a);
        System.out.println("2. NAME          :-  "+b);
        System.out.println("3. MOTHER'S NAME :-  "+c);
        System.out.println("4. FATHER'S NAME :-  "+d);
        System.out.println("5. COUNTRY       :-  "+e);
        System.out.println("6. STATE         :-  "+f);
        System.out.println("7. DISTICT       :-  "+g);
        System.out.println("8. MOB No.       :-  "+h);
        System .out.printf("           End         ");

       obj.close(); // object close
       obj2.close(); // onject close
    }    
       
} 
