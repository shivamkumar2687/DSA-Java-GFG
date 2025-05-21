package potd;
//Q. Two Sum - Pair with Given Sum
// Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.

// Examples:

// Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
// Output: true
// Explanation: arr[3] + arr[4] = 6 + 10 = 16.
// Input: arr[] = [1, 2, 4, 3, 6], target = 11
// Output: false
// Explanation: None of the pair makes a sum of 11.

// Expected Complexities
// Time Complexity: O(n)Auxiliary Space: O(n)

import java.util.HashMap;
public class TwoSum {

    public static boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();   //Create Hashmap
        for(int i=0;i<arr.length;i++){                 //Traversing in arry
            if(map.containsKey(target-arr[i]))return true;     //Always find (target - current element in arr) before putting in Map 
                                                               //If available we found target 
            else{
                map.put(arr[i],1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[]={1, 4, 45, 6, 10, 8};
        int target = 16;
        System.out.println(twoSum(arr, target));
    }
}
