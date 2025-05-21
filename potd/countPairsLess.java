package potd;
class countPairsLess{
    public static void main(String[] args) {
        
int arr[]={5, 2, 3, 2, 4, 1};
int target=5;
int ans=0;
int i=0,j=arr.length-1;

while(i!=j){
    if(arr[i]+arr[j]>= target){
     j--;
    }
    else{
        ans+=j-i;
        i++;
    }
}
System.out.println(ans);
    }
}