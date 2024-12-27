import java.util.*;
public class Bitwiseoperator {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();


        // bit wise operator

        // ~ was the tilde operator which will convert the 1 to 0 and 0 to 1 in binary form of the number

        System.out.println(~a);

        // & bitwise operator will return 1 if both are 1 and else 0

        System.out.println(a&b);

        // | bitwise operator will return 1 if any one was 1 else o if both were 0

        System.out.println(a|b);

        // xor ^ operator 1 of opposite symbold else 0 if same

        System.out.println(a^b);

        // bitwise left shift operator
        System.out.println(a<<2);
        // bitwise right shift operator
        System.out.println(a>>2);
        // bitwise zerofill rightshift operator >>>
        System.out.println(a>>>2);

        


        sc.close();


    }
    
}
