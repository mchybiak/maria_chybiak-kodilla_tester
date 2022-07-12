public class WywolanieBankAccount {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        int result = bankAccount.debiting(100);
        System.out.println(result);
    }
}
