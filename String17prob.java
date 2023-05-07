import java.util.*;
class String17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
          String str = "vaishanwi";
          //vshnw
        StringBuffer sb = new StringBuffer(str);
       
        String after="";
        for(int i=0;i<sb.length();i++)
        {
            for(int j=0;j<sb.length();j++)
            {
                if(sb.charAt(i) == sb.charAt(j))
                {
                      
                      sb.delete(j,j+1);
                }
                
            }
            
        }
        System.out.println(sb);
    }
}