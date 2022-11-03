// całkowity bilans ze wszystkich bankomatów,
//liczbę transakcji związanych z wypłatą,
//liczbę transakcji związaną z wpłatą pieniędzy,
//średnią wartość wypłaty,
//średnią wartość wpłaty.

package com.kodilla.bank.homework;

public class Bank {

    public CashMachine[] cashMachines;
    public int size;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getSize() {
        return size;
    }

    public int getTotalBalance() {  // całkowity bilans ze wszystkich bankomatów,
        int totalBalance = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalNumberOfDeposits() {  //liczbę transakcji związaną z wpłatą pieniędzy,
        int totalNumberOfDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalNumberOfDeposits += cashMachines[i].getNumberOfDeposits();
        }
        return totalNumberOfDeposits;
    }

    public int getTotalNumberOfWithdrawals(){ // całkowita ilość wypłat
        int totalNumberOfWithdrawals = 0;
        for (int i = 0; i < cashMachines.length; i++){
            totalNumberOfWithdrawals += cashMachines[i].getNumberOfWithdrawals();
        }
        return  totalNumberOfWithdrawals;
    }

    public int getTotalAverageOfDeposits(){ // średnia ze wszystkich wpłat
        int totalSumOfDeposits = 0;
        for (int i =0; i < cashMachines.length; i++){
            totalSumOfDeposits += cashMachines[i].getSumOfDeposits();
        }
        return totalSumOfDeposits/getTotalNumberOfDeposits();
    }

    public int getTotalAverageOfWithdrawals(){  // średnia ze wszystkich wypłat
        int totalSumInMinus = 0;
        for (int i=0; i< cashMachines.length; i++){
            totalSumInMinus += cashMachines[i].getSumOfWithdrawals();
        }
        return  totalSumInMinus / getTotalNumberOfWithdrawals();
    }

    public static void main(String[] args) {
        CashMachine CashMachine1 = new CashMachine();
        CashMachine CashMachine2 = new CashMachine();
        CashMachine CashMachine3 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[] {CashMachine1, CashMachine2, CashMachine3});

        CashMachine1.operations(100);
        CashMachine1.operations(-200);
        CashMachine2.operations(1000);
        CashMachine2.operations(-500);
        CashMachine3.operations(10000);
        CashMachine3.operations(-1000);

        System.out.println("Average of all deposits is: " + bank1.getTotalAverageOfDeposits());
        System.out.println("Average of all withdrawals is: " + bank1.getTotalAverageOfWithdrawals());
        System.out.println("Balance from all cashmachines is: " + bank1.getTotalBalance());
    }
}
