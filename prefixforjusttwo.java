import java.util.*;
class prefix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "akshay";
        char[] ch1 = str1.toCharArray();
        String str2 = "akshxx";
         char[] ch2 = str2.toCharArray();
          
         
        for(int i=0;i<ch1.length;i++)
        {
            for(int j=0;j<ch2.length;j++)
            {
                if(ch1[i]==ch2[j])
                {
                   System.out.println(str1.substring(0,i));
                }
                else 
                {
                    break;
                }
            }
        }
    }
}