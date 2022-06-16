
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class JoinningShifting
{
	public static void main (String[] args) throws java.lang.Exception
	{   int y,z;
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int i=0;i<T ;i++ ){
		   	int n=sc.nextInt();
		   	int k=sc.nextInt();
		   	
		   	   y = (n+4)/5;
               z = (k+4)/5;
            System.out.printf("%d\n", y-z);
		   	
		    
		} 
	}
}
