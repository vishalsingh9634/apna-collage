public class armstrong {
    public boolean arm(int n){
        int original=n;
        int temp=n;
        int count=0;
       
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        int sum=0;
        temp=n;
        while (temp!=0) {
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit,count);
            temp=temp/10;
        }
        return sum==original;
    }
    public static void main(String args[]){
        int n=371;
        armstrong obj=new armstrong();
        System.out.println(obj.arm(n));
    }
}
