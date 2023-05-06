import java.util.*;

public class Practice {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        String t="hy";
		String s = "Akshay";
		String n="";
		for(int j=0;j<t.length();j++)
		{
           if(s.contains(t.charAt(j)+""))
		      n= s.replace(t.charAt(j)+"","");
		  s=n;
		}
		
		System.out.println(n);
	}
}