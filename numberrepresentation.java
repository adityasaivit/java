public class numberrepresentation {
    public static void main(String args[])
    {
        int num=0b0010011;
        System.out.printf("the number is %d\n",num);
        System.out.printf("the octal form is %o\n",num);
        System.out.printf("the hexadecimal format is %x\n",num);
        System.out.printf("the bonary format is %s",Integer.toBinaryString(num));
    }
    
}
