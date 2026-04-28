public class sub_array {
    public static void subarray(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("["+arr[i]+","+arr[j]+"]");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total subarray :"+tp);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        subarray(arr);
    }
}
