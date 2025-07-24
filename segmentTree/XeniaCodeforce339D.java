package segmentTree;

import java.util.Scanner;



class XeniaCodeforce339D{
    static int segmentTree[]; //global variable to hold the segment tree
     //Building the Segment Tree
   static void build(int arr[],int idx, int low,int high,int level){

        if(low == high){
            segmentTree[idx] = arr[low];
            return;
        }
        int mid = (low + high)/2;
        build(arr, 2*idx+1, low, mid,level-1);   //left child
        build(arr, 2*idx+2, mid+1, high,level-1);  //right child
        if(level%2==1){
            segmentTree[idx] = segmentTree[2*idx+1] | segmentTree[2*idx+2]; //sum of left and right child
        } else {
            segmentTree[idx] = segmentTree[2*idx+1] ^ segmentTree[2*idx+2]; //max of left and right child
        }
     }
     static void update(int idx, int low, int high, int pos, int value, int level) {
         if (low == high) {
             segmentTree[idx] = value; // update the segment tree
             return;
         }
         int mid = (low + high) / 2;
         if (pos <= mid) {
             update(2 * idx + 1, low, mid, pos, value,level-1); // left child
         } else {
             update(2 * idx + 2, mid + 1, high, pos, value,level-1); // right child
         }
         if (level% 2 == 1) {
             segmentTree[idx] = segmentTree[2 * idx + 1] | segmentTree[2 * idx + 2]; // sum of left and right child
         } else {
             segmentTree[idx] = segmentTree[2 * idx + 1] ^ segmentTree[2 * idx + 2]; // max of left and right child
         }
     }
    
    public static void main(String[] args) {
         int arr[] = {1,6,3,5};
         segmentTree = new int[4*arr.length]; //size of segment tree is 4 times the size of the array
         build(arr,0,0,arr.length-1,arr.length);
         for(int i: segmentTree){
             System.out.print(i + " ");
         }
         System.out.println();
         System.out.println("Segment Tree built successfully.");
         System.out.println("Root of Segment Tree: " + segmentTree[0]);
            int a =1;
            int b=4;

         update(0, 0, arr.length-1, b, a, b);
    }
}
