import java.util.*;
class String4
{
    public static void main(String args[])
    {
        String str = "madam";
        String rev = "";
        int n = str.length();
       
       for(int i=n-1;i>=0;i--)
       {
        rev = rev + str.charAt(i);
       }

        if(str.equals(rev))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}