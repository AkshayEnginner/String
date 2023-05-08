import java.util.*;
class rotationofother
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1="abcd";
        String str2="xdad";
        if(str1.length()!=str2.length())
        {
            System.out.println("not the rotation");
        }
        String str3=str1.concat(str1);
        if(str3.indexOf(str2)!=-1)
        {
            System.out.println("it is rotaion");
        }
        else
        {
            System.out.println("not the rotation");
        }
    }
}