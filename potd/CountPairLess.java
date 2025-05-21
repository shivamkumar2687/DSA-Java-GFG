package potd;
// Q. Count Pairs whose sum is less than target

// Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.

// Examples:

// Input: arr[] = [7, 2, 5, 3], target = 8
// Output: 2
// Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3). 
// Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
// Output: 4
// Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).
// Input: arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
// Output: 6
// Explanation: There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).

// Expected Complexities
// Time Complexity: O(n log n)Auxiliary Space: O(1)

import java.util.Arrays;

public class CountPairLess {

    static int countPairs(int arr[], int target) {
        // Your code here
         Arrays.sort(arr);  //sort the array 
         int ans=0;
         int i=0,j=arr.length-1; //use 2 pointer approach 

         while(i!=j){

         if(arr[i]+arr[j]>= target){
         j--;
          }
        else{            // in true condition , j-1 gives no. of pairs betwwn i and j,
        ans+=j-i;
       
        i++;               //move i and then again search for i+1 and j
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int arr[]={2, 1, 8, 3, 4, 7, 6, 5};
        int target=7;
        Arrays.sort(arr);
        System.out.println("No. of pairs: "+countPairs(arr,target));

    }
}
