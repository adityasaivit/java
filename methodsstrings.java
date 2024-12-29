import java.lang.String;
public class methodsstrings {
    public static void main(String args[])
    {
        String s1="hydera";
        String s2="bad";

        System.out.println(s1);
        // to concat two strings;
        s1=s1.concat(s2);
        System.out.println(s1);

        // length of a string

        System.out.println("Length of string1:"+s1.length()+"\nLength og string1:"+s2.length());

        // to retrive the charecters of a strings

        for(int i=0;i<s1.length();i++)
        {
            System.out.println("Position:"+i+" charecter:"+s1.charAt(i));
        }
        // s1.compareTo(s2)
        // will return 0 if both the strings were same a
        // will return the positive if s1 is greater than the s2
        // will return the negative if s1 is smaller than the s2

        System.out.println("when we compare s1 and s2 "+(s1.compareTo(s2)));
        // s1 was bigger than s2  6 s1 was 6 charecters bigger
        
        System.out.println("ehrn we compare s2 and s1 "+(s2.compareTo(s1)));
        // s2 was smaller than s1 -6 s2 was 6 charecter small

        System.out.println("adit".compareTo("adit"));
        System.out.println("adit".compareTo("ammu"));

        // compareTo will tells us if both the strings were same
        System.out.println("Boy".compareTo("boy"));
        // capital letters were smaller than small charecters


        // s1.compareToIgnoreCase(s2)  will compare both the strings by ignoring the case of the letters

        System.out.println("BOX".compareToIgnoreCase("box"));

        // to check the euality of the strings  .equals() will return the boolean value if both the strings were same or not


        String first="Srinivasarao";
        String second="Aditya";

        boolean equal=first.equals(second);
        System.out.println(equal);

        System.out.println("aditya".equals("aditya"));

        // equaling the strings with out case

        System.out.println("Aditya".equalsIgnoreCase("aditya"));
        System.out.println("Aditya".equalsIgnoreCase("srinivasrao"));

        // to startsWith() method will return the boolean true/false

        boolean start="aditya".startsWith("adi");
        System.out.println(start);

        start="aditya".startsWith("srinivasrao");
        System.out.println(start);

        // to use the .endsWith() method which will return the boolean value of true/false

        boolean end="adityasai".endsWith("sai");
        System.out.println(end);

        String text="This is a string program";
        String word="is";
        // .indexOf() will return the index of the substring stated it will return index of first appearence if multiple instance available
        // will return -1 of there is no substring

        System.out.println(text.indexOf(word));
        System.out.println(text.indexOf("adi"));

        // lastindexOf() will work same as the previous indexOf() method but will return the last appearence of the sibstring

        System.out.println(text.lastIndexOf(word));

        // .replace(c1,c2) method will replace a charecter with another c1 with c2

        String h="hello";
        h.replace('l','x');
        System.out.println(h);

        // substring(l1)  substring(l1,l2)
        
        text="this is a book in the class";
        System.out.println(text.substring(3));
        System.out.println(text.substring(3,6));
        // 6 is the number of charecters
        System.out.println(text.substring(3,3));

        // .toLowerCase() to convert the string to lower case
        System.out.println("Aditya".toLowerCase());
        // .toUpperCase()
        System.out.println("Aditya".toUpperCase());

        String newtex="aditya sai  ";
        System.out.println(newtex.trim());

        // to split the text with respect to the delimter  .split(delimter)

        String arr[];
        String separate="Srinivasarao,Rajyalakshmi,Adithya,Amrutha";
        arr=separate.split(",");
        for(String s:arr)
        {
            System.out.print(s+" ");
        }
    }
    
}
