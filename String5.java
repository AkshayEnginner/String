import java.util.*;
class String5
{
    public static void main(String args[])
    {
        String str = "aeiou";
        String ch = "u";
        String s;
        char c;
        int temp=0;
       
       for(int i=0;i<str.length();i++)
       {
           c=str.charAt(i);
           s = Character.toString(c);
           if(s.equals(ch))
           {
               temp=temp+1;
           }
       }
       if(temp>0)
       {
           System.out.println("it is vovel");
       }
       else
       {
            System.out.println("it is constrant");
       }
       
       
    }
}