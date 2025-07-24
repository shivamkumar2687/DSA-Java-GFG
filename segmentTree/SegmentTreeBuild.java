package segmentTree;

public class SegmentTreeBuild {
    static int segmentTree[]; //global variable to hold the segment tree
    //Building the Segment Tree
     static void build(int arr[],int idx, int low,int high){

        if(low == high){
            segmentTree[idx] = arr[low];
            return;
        }
        int mid = (low + high)/2;
        build(arr, 2*idx+1, low, mid);   //left child
        build(arr, 2*idx+2, mid+1, high);  //right child
        segmentTree[idx] = segmentTree[2*idx+1] + segmentTree[2*idx+2]; //sum of left and right child
     }
     int query(int idx,int low,int high, int l, int r){
        if (low>= l && high<=r){
            return segmentTree[idx]; //if the range of the segment tree is completely within the range of the query
        }
        if (high < l || low > r) {
            return 0; //if the range of the segment tree is completely outside the range of the query
        }
        int mid = (low + high) / 2;
        int left = query(2*idx+1, low, mid, l, r);
        int right = query(2*idx+2, mid+1, high, l, r);
        return left + right; //sum of left and right child

     }
    public static void main(String[] args) {
         int arr[] = {2,5,1,3,6,7};
         segmentTree = new int[4*arr.length]; //size of segment tree is 4 times the size of the array
         build(arr,0,0,arr.length-1);
         for(int i: segmentTree){
             System.out.print(i + " ");
         }
         System.out.println();
         System.out.println("Segment Tree built successfully.");
         System.out.println("Root of Segment Tree: " + segmentTree[0]);
            int q=1;
         while(q-- >0){
            int l = 1; //left index of the query
            int r = 4; //right index of the query
            int result = new SegmentTreeBuild().query(0, 0, arr.length-1, l, r);
            System.out.println("Sum of range [" + l + ", " + r + "] is: " + result);
         }
    }
         
    
}
