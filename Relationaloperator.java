import java.util.*;
public class Relationaloperator {

    public static void main(String args[])
    {
        // relational operators

        // relational operators were generally used in the conditional statements 
        // if,while,for,dowhile etc...

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b) System.out.println("Both were equal numbers");
        else if(a>b) System.out.println("First number is larger than second");
        else if(a<b) System.out.println("Second number was greater then the first");
        sc.close();

    }
    
}
