public class sum_subarray {
    public static void sum(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr +=arr[k];
                }
                System.out.println(curr);
                if(max<curr){
                    max=curr;
                }
            }
        }
        System.out.println("total sum:"+max);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        sum(arr);
    }
}
