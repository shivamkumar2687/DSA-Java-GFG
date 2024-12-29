//Q. Intersection of Two arrays with Duplicate Elements

// Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not have duplicate elements and the result should contain items in any order.
// Examples:

// Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
// Output: [1, 3]
// Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.
// Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
// Output: [1]
// Explanation: 1 is the only common element present in both the arrays.
// Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
// Output: []
// Explanation: No common element in both the arrays.

// Time Complexity: O( a.size() + b.size() )Auxiliary Space: O( a.size() )



import java.util.ArrayList;
import java.util.HashMap;


public class intersectionOf2Arrays {
    public static ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer>list=new ArrayList<>();
         HashMap<Integer,Integer>mp=new HashMap<>();
    for(int i=0;i<a.length;i++){
        mp.put(a[i],1);
        }
    for(int i=0;i<b.length;i++){
       if(mp.containsKey(b[i])){
        list.add(b[i]);
        mp.remove(b[i]); // remove the presence
       }
    }
       return list;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,3}, b[] = {1,3,4,2,1};
       System.out.println(intersectionWithDuplicates(a,b));  //output [1,3,2]
    
    }
}
