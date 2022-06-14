import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Mahasena
{
	public static void main (String[] args) throws java.lang.Exception
	{    
	     int countEven=0;
	     int countOdd=0;
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int i=0;i<T ;i++ ){
		   int a=sc.nextInt();
		    if(a%2==0){
		        countEven++;
		    }
		    else{
		        countOdd++;
		    }
		}
		
		if(countEven>countOdd){
		    System.out.println("READY FOR BATTLE");
		}
		else{
		    System.out.println("NOT READY");
		}
	}
}
