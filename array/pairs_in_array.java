public class pairs_in_array {
    public static void printpair(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int firstnumber=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+firstnumber +","+arr[j]+" )");

                tp++;
            }
            
            System.out.println();
        }
        System.out.println("total pairs :"+tp);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        printpair(arr);

    }
}
