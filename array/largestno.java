public class largestno {
    public static int searching(int arr[]){
        int largest=Integer.MIN_VALUE;
        int Minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(Minimum>arr[i]){
                Minimum=arr[i];
            }
        }
        System.out.println("Minimum value :"+Minimum);
        return largest;
    }
    
    public static void main(String[] args) {
        int arr[]={10,20,30,50,80,40,25,35};
        System.out.println("largest value :"+searching(arr));
    }
}
