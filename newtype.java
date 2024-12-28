import java.lang.String;

public class newtype {

    public static void main(String args[])
    {
        String s="java";
        System.out.println(s);

        // second method of creation of the strings

        String obj=new String("hello");

        System.out.println(obj);

        // third type of building of the creation of string (intresting)

        char arr[]={'c','h','a','i','r','s'};

        String obj1=new String(arr);
        System.out.println(obj1);

        // if we dont want to all the charecters

        String obj2=new String(arr,2,3);
        System.out.println(obj2);

    }
    
}
