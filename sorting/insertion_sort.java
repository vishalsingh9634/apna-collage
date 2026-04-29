public class insertion_sort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int previ=i-1;
            while(previ>=0 && arr[previ]>curr){
                arr[previ+1]=arr[previ];
                previ--;                
            }
            arr[previ+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,7,8,9,6};
        insertion(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
