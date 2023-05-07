import java.util.*;
class String14
{
    public static void main(String args[])
    {
        String str = "ak&s7h$ay";
        int numbers =0;
        int alphabets =0;
        int special_char=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                alphabets = alphabets+1;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                numbers = numbers +1;
            }
            else
            {
                special_char=special_char+1;
            }
        }
        System.out.println("alphabets" + alphabets);
        System.out.println("numbers" + numbers);
        System.out.println("special characters" + special_char);
    }
}