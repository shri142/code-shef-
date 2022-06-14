import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Error
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
		if(X<Y){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
