// Q. You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

// Examples :

// Input: stalls[] = [1, 2, 4, 8, 9], k = 3
// Output: 3
// Explanation: The first cow can be placed at stalls[0], 
// the second cow can be placed at stalls[2] and 
// the third cow can be placed at stalls[3]. 
// The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.

import java.util.Arrays;

public class AgressiveCows {
    static boolean isPossible(int stalls[],int k,int mid,int n){
        int c=1,prev=stalls[0];  //c = for cow count ,prev=1st cow is always on starting index
        for(int i=1;i<n;i++){   // check pssible distance for remaining cow
            if(stalls[i]-prev>=mid){
                c++;
                prev=stalls[i];  //update the previous 
            }
        }
        return c>=k;
    }
    public static int aggressiveCows(int[] stalls, int k) {
    //Approach :- Try to sort array for which we can apply Binary srach for all possible distance and return 
    //maximum possible distance and our answer lie between stalls[0] to stalls[n-1] after sorting the array.
        
        Arrays.sort(stalls);
        int n=stalls.length,low=0,high=stalls[n-1]-stalls[0],mid,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(isPossible(stalls,k,mid,n)){
                ans=Math.max(ans,mid);
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
public static void main(String[] args) {
    
 int stalls[]={10, 1, 2, 7, 5};
 int k = 3; //no. of agressive cows , 1 <= k <= stalls.size()
 int ans =aggressiveCows(stalls, k);
 System.out.println("Output = "+ans);

   } 


    

}