import java.util.*;
public class ternaryoperator {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        String result=(a>b)? "first number is greater":"second number was greater";

        System.out.println(result);

        sc.close();

    }
    
}
