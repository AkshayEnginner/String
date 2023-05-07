import java.util.*;
class String18
{
    public static void main(String args[])
    {
        String str = "abcd12345y";
        int sum=0;
       
        for(int i=0;i<str.length();i++)
        {
           
            if(Character.isDigit(str.charAt(i)))
            {
                int n = str.charAt(i);
                sum = sum + n;
            }
           
        }
        
        System.out.println(sum);
        
    }
}