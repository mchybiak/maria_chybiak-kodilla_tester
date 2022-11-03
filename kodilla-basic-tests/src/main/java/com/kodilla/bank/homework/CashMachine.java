// Ma ona zawierać tablicę ze zrealizowanymi transakcjami
// (liczbowa wartość dodatnia, jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
// Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.

package com.kodilla.bank.homework;

public class CashMachine {

    public int[] transactions;
    public int size;

    public CashMachine(){
        this.size = 0;
        this.transactions = new int[0];
    }

    public void operations(int transaction){
        this.size++;
        int[] newTable = new int[this.size];
        System.arraycopy(transactions,0, newTable, 0, transactions.length);
        newTable[this.size -1] = transaction;
        this.transactions = newTable;
    }

    public int[] getTransactions(){
        return transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getNumberOfOperations(){
        System.out.println("ATM number of operations: " + transactions.length);
        return  transactions.length;
    }

    public int getNumberOfDeposits(){
        int numberOfDeposits = 0;
        for (int i=0; i<this.transactions.length; i++) {
            if (transactions[i] > 0)
                numberOfDeposits++;
        }
        return numberOfDeposits;
        }

        public int getNumberOfWithdrawals(){
        int numberOFWithdrawals = 0;
        for (int i=0; i<this.transactions.length; i++){
            if (transactions[i] < 0)
                numberOFWithdrawals++;
        }
        return numberOFWithdrawals++;
        }

        public int getSumOfDeposits(){
        int sumOfDeposits = 0;
        for (int i=0; i<this.transactions.length; i++){
            if (transactions[i] >0)
                sumOfDeposits += transactions[i];
        }
        return sumOfDeposits;
        }

        public int getSumOfWithdrawals(){
        int sumOfWithdrawals = 0;
        for (int i=0; i<this.transactions.length; i++ ){
            if (transactions[i] < 0)
                sumOfWithdrawals += transactions[i];
        }
        return sumOfWithdrawals;
        }
    }

