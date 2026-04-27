public class binary_search {
    public static int search(int num[],int target){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(num[mid]==target){
                return mid;
            }
            if(num[mid]<target){
                start=mid+1;          
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={10,20,30,50,40,70};
        int target=30;
        System.out.println(search(num, target));
    }
}
