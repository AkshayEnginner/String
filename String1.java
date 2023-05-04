import java.util.*;
class String1
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
       String str=sc.nextLine();
       System.out.println("Enter the char");
       String ch = sc.nextLine();
      
       StringBuffer sb = new StringBuffer(str);
       int a=sb.indexOf(ch);
       sb.replace(a,a+1,"");
       System.out.println(sb);
    }
}