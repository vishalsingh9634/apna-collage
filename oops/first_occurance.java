public class first_occurance{
    public static int first(int arr[],int key,int i){
        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr, key, i+1);

    }

    public static void main(String[] args) {
    int arr[]={1,2,4,5,7,8,9,6,4,3,5};
    System.out.println(first(arr, 5, 0));
    }
}