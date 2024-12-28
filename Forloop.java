public class Forloop {

    
    public static void main(String args[])
    {
        // basic for loop

        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        int j=1;
        for(;j<=10;j++)
        {
            System.out.print(j+" ");
        }

        j=1;
        for(;j<=10;)
        {
            System.out.println(j);
            j++;
        }

        j=1;
        for(;;)
        {
            System.out.print(j+" ");
            j++;
            if(j>10)
            {
                break;
            }
        }

        // multiple declarations
        System.out.println();
        for(int p=1,q=5;p<=5;p++,q--)
        {
            System.out.println(p+"\t"+q);
            
        }

        


    }
}
