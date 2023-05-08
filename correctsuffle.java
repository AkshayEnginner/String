import java.util.*;
class suffle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "ab";
        String str2= "dc";
        String str3= str1+str2;
        String str4= "pabc";//check
       
        
        int a = str1.length();
        int b = str2.length();
        int c = str3.length();
        
        if(a+b != c)
        {
            System.out.println("not the suffle");
        }
       char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        System.out.println(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        System.out.println(ch2);
        char[] ch3 = str3.toCharArray();
        Arrays.sort(ch3);
        System.out.println(ch3);
        char[] ch4 = str4.toCharArray();
        Arrays.sort(ch4);
        System.out.println(ch4);
        
        
         if(Arrays.equals(ch3,ch4))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
        
        /*if(ch3.equals(ch4))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        */
        
        
       
    }
}