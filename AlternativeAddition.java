import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AlternativeAddition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,a,b;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- >0)
		{
		    a=sc.nextInt();
		    b=sc.nextInt();
		    int c = b-a;
		   if(c%3 == 0 || c%3 == 1){
		       System.out.println("yes");
		   }
		   else{
		       System.out.println("no");
		   }
		}
	}
}
