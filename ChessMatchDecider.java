import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChessMatchDecider
{   
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
		  int T =sc.nextInt();
		  
		  for (int i=0;i<T ;i++ ){
		     int a =sc.nextInt();
		     int b =sc.nextInt();
		     int c=a+b;
		     
		     if(c<3){
		         System.out.println("1");
		     }
		     else if(3<=c && c<=10){
		         System.out.println("2");
		     }
		     else if(11<=c && c<=60){
		         System.out.println("3");
		     }
		     else{
		         System.out.println("4");
		     }
		  } 
	}
}
