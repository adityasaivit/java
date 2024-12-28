import java.util.*;
public class Switchchar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the Charecter:");
        ch=sc.next().charAt(0);

        switch(ch)
        {
            case 'r':
                System.out.println("Red color");
                break;
            case 'b':
                System.out.println("Blue color");
                break;
            case 'g':
                System.out.println("Green color");
                break;
            default:
                System.out.println("other colors/invalid inputs");
        }

        sc.close();
    }
    
}
