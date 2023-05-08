import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String rev=" ";
        
        System.out.println("Enter the string");
        name = sc.nextLine();
        System.out.println(name);
        int len=name.length();
        
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        if(name.equals(rev))
        {
            System.out.println("is palindrome");
        }                                           
        else
        {
             System.out.println("not palindrome");
        }    
    }
}
/////////////////////////////////
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        String org_str = str;
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)) {

            System.out.println("is palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}