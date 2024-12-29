import java.util.*;

import java.lang.String;
public class stringtoarray {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char arr[]=new char[input.length()];

        input.getChars(0,input.length(),arr,0);

        for(char c: arr)
        {
            System.out.print(c+" ");
        }
        sc.close();




    }
    
}
