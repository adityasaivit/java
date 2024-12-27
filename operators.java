import java.util.*;
public class operators
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        // addition

        System.out.println("The addition:"+(a+b));
        System.out.println("The difference:"+(a-b));
        System.out.println("The Multiplication:"+(a*b));
        System.out.println("The Division:"+(a/b));

        // shortcut 

        a+=1;
        System.out.println("Addition:"+a);
        a-=1;
        System.out.println("Subtraction:"+a);
        a*=10;
        System.out.println("Multiplication:"+a);
        a/=2;
        System.out.println("Division:"+a);
        
        sc.close();
    }
}