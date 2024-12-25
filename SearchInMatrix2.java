//Q.Search in a sorted Matrix

// Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
// Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

// Examples:

// Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
// Output: true
// Explanation: 14 is present in the matrix, so output is true.
// Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
// Output: false
// Explanation: 42 is not present in the matrix.

// Expected Complexities
// Time Complexity: O(log(n×m))Auxiliary Space: O(1)

public class SearchInMatrix2 {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length,m=mat[0].length,low=0,high=n*m-1,mid=0;
        while(low<=high){     //Binary search in 2d Matrix
        mid=(low+high)/2;
        int row=mid/m;     //finding the row in matrix which should be mid 
        int col=mid%m;
        int temp =mat[row][col];
        if(temp==x) return true;
        if(x<temp){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return false;
    }
    public static void main(String[] args) {
      int mat[][]=  {{1, 5, 9}, 
                    {14, 20, 21},
                    {30, 34, 43}};
      int x = 14; //to be serached
      System.out.println(searchMatrix(mat, x));
    }
}
