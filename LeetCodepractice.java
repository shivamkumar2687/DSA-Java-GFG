class LeetCodepractice{
    public static void main(String[] args) {
        int arr[] = {2,3,1,0,4};
        int n = arr.length;
        int i=0;
        while(i<n){
            if(i>=n-1){
                System.out.println(("true"));
                return;
            }
            if(i+arr[i] == i){
                System.out.println("false");
                return;
            }
            i+= arr[i];
        }
    }
}