//Q.Count pairs with given sum

// Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.

// Examples:

// Input: arr[] = [1, 5, 7, -1, 5], target = 6 
// Output: 3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
// Input: arr[] = [1, 1, 1, 1], target = 2 
// Output: 6
// Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
// Input: arr[] = [10, 12, 10, 15, -1], target = 125
// Output: 0

// Expected Complexities
// Time Complexity: O(n)Auxiliary Space: O(n)



import java.util.HashMap;

public class countPairs {

public static int countPairs(int arr[], int target) {
        // Your code here
        int count=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
         if(mp.get(target-arr[i])!=null){
             count+=mp.get(target-arr[i]);  //count no. value and add 
            }
             mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);    //default =0, and for already prsent +1 with initial
        }
        return count;
    }
    public static void main(String[] args) {
        
        int arr[]={1, 5, 7, -1, 5};
        int target = 6;
        int ans=countPairs(arr, target);
        System.out.println("No. of Pairs = "+ans);
    }
}
