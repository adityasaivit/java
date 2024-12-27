import java.util.*;
public class switchcase {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a=sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();

        System.out.print("1.For sum\n2.For Sub\n3.For Mul\n4.For Div");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("the sum of two numbers:"+(a+b));
                break;
            case 2:
                System.out.println("the difference of two numbers is:"+(a-b));
                break;
            case 3:
                System.out.println("the multiplication of two numbers is:"+(a*b));
                break;
            case 4:
                System.out.println("the division of two numbers is:"+(a/b));
                break;
            default:
                System.out.println("wrong input");

        }
        sc.close();
    }
    
}
