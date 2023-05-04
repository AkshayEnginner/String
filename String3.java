import java.util.*;
class String3
{
    public static void main(String args[])
    {
        String str1 = "akshay";
        String str2 = "shakay";
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1==n2)
        {
            char ch[] = str1.toCharArray();
             Arrays.sort(ch);
              System.out.println(ch);
            char chh[] = str2.toCharArray();
            Arrays.sort(chh);
            System.out.println(chh);
            if(Arrays.equals(ch,chh))
            {
                System.out.println("yes it is anagram");
            }
            else
            {
                System.out.println("not the anagram");
            }
        }
        else
        {
            System.out.println("length not same");
        }
       
    }
}