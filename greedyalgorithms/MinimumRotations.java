
// Q. Given a lock made up of N different circular rings. 
// Each ring has 0-9 digit printed on it. 
// There is only one particular code which can open the lock. 
// You can rotate each ring any number of times in either direction. 
// Given the random sequence R and the desired sequence D, 
// find the minimum number of rotations required to open the lock. 


// Input: R = 222, D = 333
// Output: 3
// Explaination: Optimal number of rotations for 
// getting 3 from 2 is 1. There are three 2 to 3 
// transformations. So answer is 1+1+1 = 3.



package greedyalgorithms;
import java.util.Scanner;

class MinimumRotations {
    static int rotationCount(long R, long D) {
        // code here
        long remR=0,remD=0,ans=0;
        while(R>0){
           remR=R%10; //finding the last digit of R
           remD=D%10;
           long tempAns=Math.abs(remR-remD); //finding the difference between the last digit of R and D
           //finding the minimum rotation required to get the last digit of D from R
           ans+=Math.min(tempAns, 10-tempAns);  // check the minimum rotation Anticlockwise or clockwise
           R/=10;
           D/=10;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers R and D: ");
        long R = sc.nextLong();
        long D = sc.nextLong();
        sc.close();
        System.out.println("Minimum rotations required: " + rotationCount(R, D));
    }
}
                        