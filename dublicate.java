import java.util.*;
class dublicate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = "akshayks";
        int count=0;
        char[] ch = str.toCharArray();
        int len = ch.length;
         System.out.println("dublicate char in string are");
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(ch[i]==ch[j])
                {
                    
                    System.out.println( ch[i]);
                    count++;
                }
            }
        }
         System.out.println("dublicate char are total " +count);
    }
}