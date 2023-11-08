//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        
     PriorityQueue<Integer>pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=l;i<=r; i++){
            pq.add(arr[i]);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        return pq.peek();
        
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    // { 
    //     //Your code here
    //      int kthSmallest(int arr[], int l, int r, int k) {
    //     //code here
        
    //   int maxelement = -1,count =0;
    //   //Find the max element in an array
    //   for(int i = 0 ; i <=r ; i++)
    //   {
    //       maxelement = max(maxelement ,arr[i]);
    //   }
    //     int el =maxelement+1;
    //     int freq[el] = {0};
    //     for(int i = 0 ; i <=r ; i++)
    //   {
    //          freq[arr[i]]++;
    //   }
       
    //   for(int i = 0 ; i <el;i++ )
    //   {
    //       if(freq[i] !=0)
    //       {
    //           count +=freq[i];
    //       }
          
    //       if(count >= k)
    //       {
    //           return i;
              
    //       }
    
    //----------------best approach---------------
    
        
   
   ////------------time limit exceed---------------
//       Arrays.sort(arr); 
       
//       Stack<Integer> st = new Stack<>();
       
//       for(int i=l; i<=r; i++){
//           st.push(arr[i]);
//       }
       
//   for(int i=r; i>=k; i--){
//           st.pop();
//       }
       
//       return  st.peek();
   
//     } 
// } 