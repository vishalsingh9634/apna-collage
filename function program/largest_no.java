import java.util.*;
public class largest_no {
    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,5,2,3,4,56,320,2,1,5,3};
        System.out.println(getlargest(num));
    }
}
