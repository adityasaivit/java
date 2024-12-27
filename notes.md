// the creation of the object
// classname objectname=new classname();

// the methods in java which can be created without creating the object were called as the static functions or static methods

        // we sould call the main method wthour creating the object there fore we should add static to it
        // e.g public static void main()
        // here we should call the main method without creating the object;
        // jvm will call the main method as javafundamentals.main() 
        // we declare the main method as the public to make itself available to the jvm if we dont declare public it will not make available to the Java Virtual Machine

        // main methid should alwaya be written as the public static void main(String args[])
        // here public make available to the jvm
        // static to access the main without creating the object
        // void which represent that no value will be returned
        // main is the entry/starting point of the program

        // we can also write
        // static public void main(String args[])
        // static public void main(String x[])


## naming conventions
    // to import the packeges 
    // all letters should be small e.g:- 
    // to name a method and variables firstword will be a small case and from second word onwards it was capital letter
    // naming of the variable will be the same as of the method naming

    // all the variable contains inbuilt constant values should be all uppercase
    // PI,BOLD etc
    // all keywords such as public,static,void,int,float,private etc should be all small case letters

# Datatypes in java

        // variable is a memory storage which stores the data to use it we should first store it
        // for integer we have byte,short,int,long(1,2,4,8) bytes respectively   
        // for long we should add the L at the end of the numner
         // float datatypes
        // there are two types of float data types 
        // 1.float (4bytes)
        // 2.double(8bytes)
        // we have to add the F at the end of the floating variable

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
# storing of the numbers in java

positive number was stored as ones complement

negative number was stored as twos complement

## bit wise operator

        // ~ was the tilde operator which will convert the 1 to 0 and 0 to 1 in binary form of the number

        System.out.println(~a);

        // & bitwise operator will return 1 if both are 1 and else 0

        System.out.println(a&b);

        // | bitwise operator will return 1 if any one was 1 else o if both were 0

        System.out.println(a|b);

        // xor ^ operator 1 of opposite symbold else 0 if same

        System.out.println(a^b);


