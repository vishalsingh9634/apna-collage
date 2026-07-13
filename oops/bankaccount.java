public class bankaccount {
    private int account_no;
    private int balance;
    public int getaccountno(){
        return account_no;
    }
    public void setaccountno(int account_no){
        this.account_no=account_no;
    }
    public int getbalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            balance += amount;
            System.out.println("deposited :"+amount);
        }
        else{
            System.out.println("invalid deposit amount :");
        }
    }

    public void withdrow(int amount){
        if(amount<=balance){
            balance -=amount;
            System.out.println("withdrow : "+amount);
        }
        else{
            System.out.println("transaction failed");
        }
    }

    public static void main(String[] args) {
        bankaccount bank=new bankaccount();
        bank.setaccountno(12345678);
        bank.deposit(5000);
        bank.withdrow(2000);
        System.out.println("account_no:" +bank.getaccountno());
        System.out.println("balance : "+bank.getbalance());

    }
}
