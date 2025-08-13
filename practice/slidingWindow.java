package practice;

public class slidingWindow {
    public static void main(String[] args) {
        
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2) break;
            System.out.println("This is after break");
        }
    }
}
