public class prime_in_range {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return isprime;

    }
    public static void primerange(int n){
        for(int i=2;i<=n-1;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primerange(20);
    }
}
