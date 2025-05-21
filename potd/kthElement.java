package potd;
//package Basics-java;

import java.util.PriorityQueue;

// Q. Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
// Output: 6
// Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.

class kthElement{

    //Function for finding kth element of two sorted array

     public static int kthElement(int[] a, int[] b, int k) {
        // Create a min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Add all elements from the first array
        for (int i : a) {
            pq.add(i);
        }
        
        // Add all elements from the second array
        for (int i : b) {
            pq.add(i);
        }
        
        // Extract the k-th element
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                return pq.peek(); // Return the top of the heap
            }
            pq.poll(); // Remove the top element
        }
        
        return 0; // Default return statement (should not reach here)
    }

    public static void main(String[] args) {
    
        int arr1[] = {2, 3, 6, 7, 9}; //first sorted array
        int arr2[] = {1, 4, 8, 10};   //2nd sorted array
        int k = 5; //find the element that would be at the kth position of the combined sorted array.
       int ans = kthElement(arr1, arr2,k); //Function call
       System.out.println("Kth Postion of Combined array : "+ans);
        



    }
}
