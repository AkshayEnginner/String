import java.util.*;
class String11
{
    public static void main(String args[])
    {
        int n=0;
        int m;
        String vowels = "aeiou";
        String str = "aksihay";
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<vowels.length();j++)
            {
                if(str.charAt(i) == vowels.charAt(j))
                {
                    n=n+1;
                }
            }
        }
        m=str.length()-n;
        System.out.println("number of vowels in string are " +n);
        System.out.println("Number of constrants are " +m);
        
    }
}