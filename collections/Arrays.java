package collections;
import java.util.*;

public class Arrays {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }

        System.out.println("The elements you entered is:");
        for(int j=1;j<=n;j++)
        {
            System.out.print(arr[j-1]+" ");
        }



    }
    
}
