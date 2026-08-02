public class chech_sorted_array {
    public static boolean check(int arr[],int i){
        if(arr[i]==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr,i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7};
        System.out.println(check(arr,0));
    }
}
