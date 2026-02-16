import java.util.*;
public class linearsearch{
    public static int searching(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
               
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,80,70,30,40};
        int target=30;
        int index= searching(arr, target);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("elemet found index no. :"+index);
        }

    }
}