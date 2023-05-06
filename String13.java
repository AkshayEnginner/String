import java.util.*;
class String13
{
    public static void main(String args[])
    {
        String str = "ikshay";
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
        {
            for(int j=0;j<vowels.length();j++)
            {
                if(sb.charAt(i) == vowels.charAt(j))
                {
                    System.out.println(sb.charAt(i));
                    sb.setCharAt(i,'-');
                    
                }
                
            }
            break;
        }
        System.out.println(sb);
    }
}