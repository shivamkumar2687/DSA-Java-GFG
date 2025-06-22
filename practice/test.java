package practice;

public class test {
    public static void main(String[] args) {
        int arr[] = {2,3,3,3,2,2,3,4,4,4,4,1};
        int n = arr.length;

        int ans=0;
        int count=1;
      for (int i = 1; i < n; i++) {
   
        if(arr[i]==arr[i-1]){
           count++;
        }
       else{
        if(count==arr[i-1]){
            ans++;
       
       }
        count=1;
          
      }
      if (count == arr[n - 1]) {
            ans++;
        }
    }
    System.out.println("Answer "+ans);

    }
    }
