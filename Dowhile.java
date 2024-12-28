public class Dowhile {

    public static void main(String args[])
    {   

        int i=1;

        do System.out.println(i);
        while(++i<=10);


        // second version
        int j=1;
        do{
            System.out.println("second "+j);
            j++;
        }while(j<=100);


    }
    
}
