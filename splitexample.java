import java.util.Scanner;


import java.lang.String;

public class splitexample {
    public static void main(String args[])
    {
        String arr[];
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();

        arr=input.split(" ");

        for(String a:arr)
        {
            System.out.println(a);
        }

        // string comparision

        String s1="Aditya";
        String s2="Adiya";
        if(s1==s2)
        {
            System.out.println("Both are same");
        }
        else{
            System.out.println("Not same");
        }

        s.close();

    }
    
}
