import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RatingImprovment
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int i=0;i<T ;i++ ){
		   int X=sc.nextInt();
		   int Y=sc.nextInt();
		   
		   if(Y<=(X+200) && Y>=X){
		       System.out.println("YES");
		   }
		   else{
		       System.out.println("NO");
		   }
		} 
	}
}
