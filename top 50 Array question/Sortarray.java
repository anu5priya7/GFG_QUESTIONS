 //{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

 //----------------1st approach----------------
//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
         divide(arr, 0, n-1);
         return arr;
         
    }



//--------------2nd approach ---------------------------
// class Solution 
// { 
//     int[] sortArr(int[] arr, int n) 
//     { 
//           int temp;
//           for(int i=0; i<arr.length; i++){
//               for(int j=i+1; j<arr.length; j++){
//                   if(arr[i]>arr[j]){
//                       temp = arr[i];
//                       arr[i] = arr[j];
//                       arr[j] = temp;
//                   }
//               }
//           }
          
//           return arr;
          
//     }
// } 



public static void conquer(int arr[], int si, int mid,  int ei ) {  //O(nlogn)
        int merged[] = new int[ei - si +1];

        int idx1 = si;
        int idx2 = mid +1;
        int x =0;
        
        while(idx1 <= mid && idx2 <=ei ){

            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid ){
            merged[x++] = arr[idx1++];

        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for(int i=0 , j=si; i< merged.length; i++, j++){
            arr[j] = merged[i];
        }
        
        
    }

    public static void divide(int arr[], int si, int ei) {
        
        if(si>=ei){
            return ;
        }
        int mid = si +(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr, si, mid, ei);
        
    }
}
 
