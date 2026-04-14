public class prime {
public static boolean prime_no(int n){
    boolean prime=true;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            prime=false;
            break;
        }
    }
    return prime;
}
public static void main(String[] args) {
    System.out.println(prime_no(4));
}
}