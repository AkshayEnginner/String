import java.util.*;
class String2
{
    public static void main(String args[])
    {
        int ans;
        String str;
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str =sc.nextLine();
         System.out.println("Enter the char");
        ch = sc.nextLine();
        int before = str.length();
        int after = str.replace(ch,"").length();
        ans = before-after;
        System.out.println(ans);
    }
}