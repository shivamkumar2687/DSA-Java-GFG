package segmentTree;

import java.util.Scanner;
   
class CSESPractice{
    static int arr[];
    static long segTree[]; //global variable to hold the segment tree
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt(); //input the array elements    
        }
        segTree = new long[4 * n]; 
        buildSeg(0, 0, n-1);
       

        while(q-->0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
            if(a==1) {
                update(0,0,n-1,b-1,c);
            }
            if(a==2){
                System.out.println(query(0,0,n-1,b-1,c-1));
            }
        }
    }
    static void buildSeg(int idx, int low, int high) {
        if (low == high) {
            segTree[idx] = arr[low];
            return;
        }
        int mid = (low + high) / 2;
        buildSeg(2 * idx + 1, low, mid); // left child
        buildSeg(2 * idx + 2, mid + 1, high); // right child
        segTree[idx] = segTree[2 * idx + 1] + segTree[2 * idx + 2]; // sum of left and right child

    }
    static long query(int idx, int low, int high, int l, int r) {
        if (low >= l && high <= r) {
            return segTree[idx]; // if the range of the segment tree is completely within the range of the query
        }
        if (high < l || low > r) {
            return 0; // if the range of the segment tree is completely outside the range of the query
        }
        int mid = (low + high) / 2;
        long left = query(2 * idx + 1, low, mid, l, r);
        long right = query(2 * idx + 2, mid + 1, high, l, r);
        return left + right; // sum of left and right child
    }
  

    static void update(int idx, int low, int high, int pos, int value) {
        if (low == high) {
            arr[pos] = value;
            segTree[idx] = value; // update the segment tree
            return;
        }
        int mid = (low + high) / 2;
        if (pos <= mid) {
            update(2 * idx + 1, low, mid, pos, value); // left child
        } else {
            update(2 * idx + 2, mid + 1, high, pos, value); // right child
        }
        segTree[idx] = segTree[2 * idx + 1] + segTree[2 * idx + 2]; // update the segment tree
    }
}