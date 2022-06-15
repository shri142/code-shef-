import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0)
		{
		    String k,s=sc.next();
		    boolean b=true;
		    int j=s.length()-1;
		    for(int i=0;i<s.length()/2;++i)
		    {
		        if(s.charAt(i)!=s.charAt(j))
		        {
		            b=false;
		            break;
		        }
		        --j;
		    }
		    if (b)
		    System.out.println("wins");
		    else
		    System.out.println("loses");
		    t--;
		}
	}
}
