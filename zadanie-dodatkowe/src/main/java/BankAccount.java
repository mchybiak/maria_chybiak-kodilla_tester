import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    List<Integer> transactionsList = new ArrayList<>(99);

    public int crediting(int transaction) {
        transactionsList.add(transaction);
        return transaction;
    }
    public int debiting(int transaction) {
        transactionsList.add(-transaction);
        return transaction;
    }
}


