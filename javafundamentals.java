// the creation of the object
// classname objectname=new classname();

import java.io.PrintStream;
import java.lang.*;

public class javafundamentals
{


    public static void main(String args[])
    {
        javafundamentals j=new javafundamentals();

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
        // if we didnt add the string args[] as the parameter jvm cannot detect the main method there fore we cannot run the program
        // as main method is the entry point to the program

        PrintStream obj=new PrintStream(System.out);
        obj.println("welcome to java");

        // but we use system.out.print();
        // to make things simplified
        // PrintStream was responsible for the printing the output when we call the system.out here out is the variable in the system class which willl crete the abject shown above

        System.out.println("Hello Java!");

        // execution of the java program in terminal is
        // javac javafundamentals.java
        // java javafundamentals

        // javac will create the byte code which will contain the instructions 
        // java will execute the byte code
        // jvm is written in the c code

        // jvm is an java.exe

        



        

    }
}