package practice;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static int movieTime(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(i->i[1]));
        int newInterval[] = intervals[0];
        //ans.add(newInterval);
        int count = 1;

        for(int[] interval:intervals){
            if(newInterval[1]<=interval[0]){
                count++;
                 newInterval = interval;
            }
           
            
        }
        return count;
    }

public static void main(String[] args) {
    int mat[][] = {
        {3,5},
        {4,9},
        {5,8},
      
    };
    System.out.println(movieTime(mat));
    // Print the merged intervals
   
}
}
