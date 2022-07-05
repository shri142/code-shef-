import java.util.*;
import java.lang.*;
import java.io.*;
//use function if you want to use break and continue in nested loop
/* Name of the class has to be "Main" only if the class is public. */
class MinFlip
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner sc=new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for (int i=0; i<testCases ;i++ ) {
		    
		     int sum=0;
		   
		   int arraySize = sc.nextInt(); 
		   	     int [] A =new int[arraySize];
		   
		   
		   
		   for(int j=0; j<arraySize;j++){
		       
		       A [j]=sc.nextInt();
		   }
		   
		    for(int j=0; j<arraySize;j++){
		       
		       sum=sum+ A[j];
		       
		   }
		   
		   if(arraySize%2==0){
		       
		       if(sum>0){
		       System.out.printf("%d\n",sum/2);
		       }
		   
		       else{
		       System.out.printf("%d\n",(sum/2)*-1);
		       }
		       
		      
		     }
		     
		     else{
		          System.out.printf("-1\n");
		     }
		    
		   
		   
		   
		    
		  
	 }   
		
		
    }
    
}
	
	
