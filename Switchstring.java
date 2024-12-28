import java.util.*;
import java.lang.*;
public class Switchstring {

    public static void main(String args[])
    {å
        Scanner sc=new Scanner(System.in);

        String option=sc.next();
        switch(option)
        {
            case "monday":
                System.out.println("Monday");
                break;
            case "tuesday":
                System.out.println("Tuesday");
                break;
            case "wednesday":
                System.out.println("Wednesday");
                break;
            case "thursday":
                System.out.println("Thursday");
                break;
            case "friday":
                System.out.println("Friday");
                break;
            case "saturday":
                System.out.println("Saturday");
                break;
            case "sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid input");
        }
        sc.close();
    }
    
}
