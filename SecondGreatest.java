//check why aint running
//even with this logic

//                if(a<b && b<c){
// 	            System.out.print(b);
// 	        }
// 	        else if(b<a && a<c){
// 	            System.out.print(a);
// 	        }
// 	        else{
// 	            System.out.print(c);
// 	        }
	       
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SecondGreatest
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc =new Scanner(System.in);
	   int N=sc.nextInt();
	    
	    for (int i=0;i<N ;i++ ) {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        
	        
	        
	        if(a<b){
	            
	            if(b<c){   //a<b<c
	                System.out.print(b);
	            }
	            else{    //b>c
	                if(a<c){    // a<c<b
	                    System.out.println(c);
	                }
	                else{      //a>c     // c<a<b
	                    System.out.println(a);
	                }
	            }
	        }
	        else{   //a>b
	            
	            if(b>c){           //  c<b<a
	                System.out.print(b);
	            }
	            else{       //b<a<c
	                if(a<c){       
	                    System.out.println(a);
	                }
	                else{   // c>a // b<c<a
	                    System.out.println(c);
	                }
	            }
	        }
	            
	            
	            
	        }
	    }
	}
}
