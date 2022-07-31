// Utwórz pakiet com.kodilla.bank.homework, a w nim klasę CashMachine (Bankomat).
// Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia,
// jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
// Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.

package com.kodilla.bank.homework;

public class CashMachine {

    public int [] transactionsOfATM;  // tablica z transakcjami

    public CashMachine (int [] transactionsOfATM) {  // konstruktor
        this.transactionsOfATM = transactionsOfATM;
    }

    public int getNumberOfTransactions(){ // metoda zwracająca ilość transakcji
        return transactionsOfATM.length;
    }

    public int getATMsBalance(){ // metoda zwracająca bilans bankomatu
        int sum = 0;
        for (int i = 0; i < transactionsOfATM.length; i++) {
            sum = sum + transactionsOfATM[i];
        }
        return sum;
    }

    public int getNumberOfWithdrawalFromATM(){ // metoda zwracająca wpłat do jednego bankomatu (>0)
        int counter = 0;
        for (int i = 0; i < transactionsOfATM.length; i++){
            if (transactionsOfATM[i] > 0)
                continue;
            counter++;
        }
        return counter ++;
    }

    public int getNumberOfDepositFromATM(){ // metoda zwracająca ilość wypłat z jednego bankomatu (<0)
        int counter = 0;
        for (int i = 0; i < transactionsOfATM.length; i++){
            if (transactionsOfATM[i] < 0)
                continue;
            counter++;
        }
        return counter ++;
    }

    public int getTotalValueOfWithdrawalFromATM(){ // metoda zwracająca sumę wszystkich wpłat do jednego bankomatu
    int totalValueOfAllWithdrawal = 0;
    for (int i = 0; i < transactionsOfATM.length; i++) {
        if (transactionsOfATM[i] > 0)
            continue;
        totalValueOfAllWithdrawal += transactionsOfATM[i];
    }
    return  totalValueOfAllWithdrawal;

    }

    public int getTotalValueOfDepositFromATM(){ // metoda zwracająca sumę wszystkich wypłat z jednego bankomatu
        int totalValueOfAllDeposit = 0;
        for (int i = 0; i < transactionsOfATM.length; i++){
            if (transactionsOfATM[i] < 0)
                continue;
            totalValueOfAllDeposit += transactionsOfATM[i];
        }
        return  totalValueOfAllDeposit;
    }

    public double getAverageValueOfWithdrawalFromATM(){ // metoda zwracająca wartość średniej wpłaty do jednego bankomatu
        if (this.getNumberOfWithdrawalFromATM() == 0) {
            return 0;
        }
        return this.getTotalValueOfWithdrawalFromATM() / this.getNumberOfWithdrawalFromATM();
    }


    public double getAverageValueOfDepositFromATM(){ // metoda zwracająca wartość średniej wypłaty z jednego bankomatu
    if (this.getNumberOfDepositFromATM() ==0) {
        return 0;
    }
    return this.getTotalValueOfDepositFromATM() / this.getNumberOfDepositFromATM();
    }
}



