public class labels {
    public static void main(String args[])
    {
        label1: for(int i=1;i<=3;i++)
        {
            System.out.print(i);
            label2: for(int j=1;j<=5;j++)
            {
                System.out.println("\t"+j);
            }
            System.out.println("--------------------");
        }
    }
    
}
