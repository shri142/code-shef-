import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GyserCapacity
{
	public static void main (String[] args) throws java.lang.Exception
	{  int X,Y,Z;
      Scanner sc =new Scanner(System.in);
      int T=sc.nextInt();
      
      for (int i=0;i<T ;i++ ){
         X=sc.nextInt(); 
         Y=sc.nextInt();
         Z=X/(2*Y);
         System.out.printf("%d\n", Z);
      } 
	}
}
