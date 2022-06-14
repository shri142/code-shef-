import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WhoIsTaller
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for (int j=0;j<a ; j++) {
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    
		    if(X>Y){
		        System.out.println("A");
		    }
		    else{
		        System.out.println("B");
		    }
		}
	}
}
