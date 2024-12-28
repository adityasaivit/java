public class Breakandcontinue {
    public static void main(String args[])
    {
        // unline c/c++ there is no goto function in java as it creates a confusion in a large projects 
        // and programs

        
        int i=1;
        while(true)
        {
            if(i==101)
            {
                break;
            }
            System.out.println("Number :"+i);
            i++;
        }

        System.out.println("\n\n");
        for(int j=1;j<=10;j++)
        {
            if(j<=5)
            {
                continue;
            }
            System.out.println(j);
        }
    }
    
}
