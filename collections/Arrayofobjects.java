package collections;
import java.util.*;

class Employee
{
    
   int id;
   String name;

   public Employee(int id,String name)
   {
        this.id=id;
        this.name=name;
   }
   
    public void display()
    {
        System.out.println("--------\n Name :"+name+"\nId :"+id+"\n--------");
    }
}
public class Arrayofobjects {
   public static void main(String args[])
   {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of objects:");
    int n=sc.nextInt();
    Employee e[]=new Employee[n];

    for(int i=1;i<=n;i++)
    {
        String a=sc.next();
        int i1=sc.nextInt();

        e[i-1]=new Employee(i1,a);
    }

    for(int j=1;j<=n;j++)
    {
        e[j-1].display();
    }

    sc.close();
    
    

   }
    
}
