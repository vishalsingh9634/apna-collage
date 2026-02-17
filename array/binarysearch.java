public class binarysearch {
    public static int searching(int arr[],int target){
        int start=0, end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,15,25,35,45};
        int target=40;
        System.out.println("index of binary search :"+searching(arr,target));
    }
}
