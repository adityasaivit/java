import java.util.*;
class Employee
{
    String name;
    int age;

    Employee(String s,int a)
    {
        name=s;
        age=a;
    }

    public void display()
    {
        System.out.println("Name of the Employee:"+name+"\nAge of the employee:"+age);
    }

}

public class collections {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee arr[]=new Employee[5];

        for(int i=1;i<=5;i++)
        {
            String first=sc.next();
            int a=sc.nextInt();
            arr[i-1]=new Employee(first,a);
        }


        for(int j=1;j<=5;j++)
        {
            arr[j-1].display();
        }

    }
    
}
