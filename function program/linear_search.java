public class linear_search {
    public static int linear(int num[],int target){
        for(int i=0;i<=num.length-1;i++){
            if(target==num[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={10,20,30,40,50,60,70,80};
        int target=50;
        System.out.println(linear(num, target));
    }
}
