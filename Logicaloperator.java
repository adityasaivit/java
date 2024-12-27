import java.util.*;
public class Logicaloperator {

    public static void main(String args[])
    {
        // && logical and operator
        // || logical or operator
        // ! logical not operator

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a==1 && b==1 && c==1) System.out.println("all were 1");

        if(a>b && b<c) System.out.println("Second number was smallest");

        if(a<b && a<c) System.out.println("First number is smallest");

        if(c<a && c<b) System.out.println("Third number is smallest");
        

        sc.close();

        
    }
    
}
