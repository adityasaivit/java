public class Datatypes {
    public static void main(String args[])
    {
        // variable is a memory storage which stores the data to use it we should first store it
        // for integer we have byte,short,int,long(1,2,4,8) bytes respectively 
        byte rno=10;
        short s=100;
        int i=300000;
        long l=9000259798L;
        // for long we should add the L at the end of the numner

        System.out.println("the byte type: "+rno+"\nthe short type: "+s+"\nthe int type: "+i+"\nthe long type: "+l);

        // float datatypes
        // there are two types of float data types 
        // 1.float (4bytes)
        // 2.double(8bytes)

        float f=3.14F;
        double d=4.23443222;
        // we have to add the F at the end of the floating variable


        System.out.println("the float value is :"+f+"\n the double value is :"+d);

        // charecter datatypes

        // charecter datatype allocates 2 bytes of data
        // charecters were enclosed in the single quotes
        // java or in the matter of fact almost all the programming languages will use the ASCII values to recognise the charecter values
        // java can recognise almost 65535 different charecters

        // java provides 2 bytes for charecters to make it compatable to the unicode system
        // unicodes are the numbers to the symbols no matter the lnguage or the platform
        
        char c='A';
        System.out.println("charecter datatype :"+c);
        int c1=c;
        System.out.println("the ASCII code is "+c1);

        // string datatype 
        // s string datatype is a datatype which was the combination of the charecters and comes under th string class
        // all the class can be defined as the data types

        // boolean datatype
        boolean trial=true;
        boolean secondtrial=false;
        System.out.println("the boolean value is "+trial+" the false is "+secondtrial);

        // literals are the various types of data stored in variables

        // for integer we have decimal
        // we gave octal
        // we have hexadecimal

        int deci=123;
        int octal=032;
        int hexa=0x1a;
        System.out.println(octal);
        System.out.println(hexa);
        System.out.println(deci);

        // binary literals
        
        int num=0b010001;
        short sn=(short)num;

        System.out.println(num);
        System.out.println(sn);




    }
}
