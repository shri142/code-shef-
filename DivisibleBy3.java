import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class DivisibleBy3
{
	public static void main (String[] args) throws java.lang.Exception
	{    
		Scanner sc=new Scanner(System.in);
		int T= sc.nextInt();
		
		for (int i=0;i<T ;i++ ){
		   
		   int A=sc.nextInt();
            int B=sc.nextInt();
            int g=0;
            
            while (A%3!=0 && B%3!=0) {
                if (B>A)
                    B=Math.abs(A-B);
                else
                    A=Math.abs(A-B);
                g++;
            }
            System.out.println(g);


		} 
	}
}
