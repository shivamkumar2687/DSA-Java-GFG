package greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;

class FractionalKnapsack{
    // Function to get maximum total value in knapsack
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        double ratio[][]=new double[values.length][2];
        
        for(int i=0;i<values.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=values[i]/(double)weights[i];
        }
        
        Arrays.sort(ratio, Comparator.comparingDouble(A->A[1]));
        int capacity=W;
        double ans=0;
        for(int i=ratio.length-1;i>=0;i--){
            
            int idx=(int)ratio[i][0];
            if(capacity>=weights[idx]){
                ans+=values[idx];
                capacity-=weights[idx];
            }
            else{
                ans+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        return (double)ans;
    }
    public static void main(String[] args) {
        
        int values[]={60,100,120};
        int weights[]={10,20,30};
        int W=50;
        FractionalKnapsack fk=new FractionalKnapsack();
        System.out.println("Maximum value in knapsack = "+fk.fractionalKnapsack(values, weights, W));
    }

}
