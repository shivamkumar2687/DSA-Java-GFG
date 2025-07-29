package MiscellaneousQuestionPractice;

public class ThirdLargestEle {
     
    public static int thirdLargestElement(int arr[]){
       
        int n = arr.length;
         
        int firstLargest = arr[0];
        for(int i =0;i<n;i++){
            if(firstLargest<arr[i]){
                firstLargest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;

          for(int i =0;i<n;i++){
            if(arr[i]==firstLargest)continue; // skip the 1st largest
           else if(secondLargest<arr[i]){
                secondLargest = arr[i];
            }
        }

        int thirdLargest = Integer.MIN_VALUE;
            
         for(int i =0;i<n;i++){
            if(arr[i]==firstLargest || arr[i] == secondLargest )continue; // skip the 1st largest
           else if(thirdLargest<arr[i]){
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;

    }
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
            System.out.println("Third Largest is : "+ thirdLargestElement(arr));
    }
}
