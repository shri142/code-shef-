#include <iostream>
using namespace std;

#include <algorithm>
#include <iterator>
#include <cstdlib>


#include <stdio.h>

int main() {
    
    int T,j, min ,max,Fmax;
    
     
    
    
    scanf("%d",&T);
  
  for(int i=0;i<T;i++){
      
     int n;
      
     scanf("%d",&n);
     
    //  int arr[n];
    
    vector<int> g1;
    
    
    
    
     
     for(j=0;j<n;j++){
         

        int x;
        cin>>x;
        
        g1.push_back(x);
         
     }
     
     
     
          if (n == 1)
    {
        max = g1[0];
        min = g1[0];    
        
    }
     
  
    
    max= *max_element(g1.begin(), g1.end());
    min=  *min_element(g1.begin(), g1.end()); 
    
   
    
    // if (min<0){
        
    //     printf("%d ",min*max);
    //     //  printf("%d\n",max*max);
    // }
    // else{
    //     printf("%d ",min*min);
    //     //  printf("%d\n",max*max);
    // }
        
    //      if(abs(min)>max){
    //          Fmax=abs(min);
    //          printf("%d\n",Fmax*Fmax);
    //      }
    //      else{
    //          printf("%d\n",max*max);
    //      }
         
         if( min<0 && max<0){
             //coz max means negative mai chota number aayaga after squaring
            printf("%d ",max*max); 
            printf("%d\n",min*min); 
        
         }
         else if(min<0 && max>0){
             
             
                      if(abs(min)>max){
                          Fmax=abs(min);
                         
                              printf("%d ",min*max);  
                              printf("%d\n",Fmax*Fmax); 
                      }
                      else{
                          
                              printf("%d ",min*max); 
                              printf("%d\n",max*max);
                          
                      }
             
             
         }
         else{
             printf("%d ",min*min); 
             printf("%d\n",max*max); 
         }
         
         
      
      g1.clear();
      
  }
  
 
  
 return 0; 
}
