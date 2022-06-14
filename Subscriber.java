import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Subscriber
{
	public static void main (String[] args) throws java.lang.Exception
	{   int value;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for (int i=0;i<a ;i++ ){
		  int N=sc.nextInt();
		  int X=sc.nextInt();
		  value=N/6;
		  if(N<6){
		      System.out.println(X);
		      
		  }else if(N%6==0){
		  
		  System.out.println(value*X);
		    
	     	} 
	     	else{
	     	    System.out.println((value+1)*X);
	     	}
		     
		}
	}
}
