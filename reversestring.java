import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        /*
        StringBuilder sb = new StringBuilder("Akshay");
        sb.reverse();
        System.out.println(sb);
        */
        String name = "Akshay";
        int len=name.length();
        String rev=" ";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("The reverse of string is" +rev);
    }
}