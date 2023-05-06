import java.util.*;
class String6
{
    public static void main(String args[])
    {
       char ch = 'a';
       
       System.out.println(Character.isDigit(ch));
       if(Character.isDigit(ch)==false)
       {
            System.out.println("no it is not the digit");
       }
       else
       {
           System.out.println("yes it is the digit");
       }
    }
}