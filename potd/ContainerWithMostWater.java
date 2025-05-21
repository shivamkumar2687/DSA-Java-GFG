package potd;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[]={2, 1, 8, 6, 4, 6, 5, 5};
        int ans=0;
        int i=0,j=arr.length-1;
        while(i<=j){
            int small=Math.min(arr[i], arr[j]);
            int unit=j-i;
            ans=Math.max(small*unit, ans);

            if(i<=j){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(ans);
    }
    
}
