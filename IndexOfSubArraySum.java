public class IndexOfSubArraySum {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 7, 5};
        int target = 12;

        int i=0,j=0,sum=0;
        for(int k=0;k<arr.length;k++){
            if(sum<=target){
                sum+=arr[k];
                i++;

            }
        }
        while(sum>target){
            sum-=arr[j];
            j++;
        }
        if (sum==target){
          System.out.println((j+1)+" "+(i+1));
        }


    }
    
}
