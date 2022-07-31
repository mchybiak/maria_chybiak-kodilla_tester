// Utwórz klasę Bank, która będzie zawierać tablicę bankomatów.
// Bank powinien mieć metody zwracające:
//
//całkowity bilans ze wszystkich bankomatów,
//liczbę transakcji związanych z wypłatą,
//liczbę transakcji związaną z wpłatą pieniędzy,
//średnią wartość wypłaty,
//średnią wartość wpłaty.


package com.kodilla.bank.homework;

public class Bank {

    public CashMachine[] ATMsList;  // tablica zawierająca listę bankowatów

    public int getBalanceOfAllATMs(){  // metoda zwracająca całkowity bilans ze wszystkich bankomatów.
        int sum = 0;
        for (int i = 0; i < ATMsList.length; i++){
            sum = sum + ATMsList[i].getATMsBalance();
        }
        return sum;
    }

    public int getNumberOfAllWithdrawalFromATMs(){ // metoda zwracająca ilość wpłat do wszytskich bankomatów
        int counter = 0;
        for (int i = 0; i < ATMsList.length; i++) {
            counter = counter + ATMsList[i].getNumberOfWithdrawalFromATM();
        }
        return counter;
    }

    public int getNumberOfAllDepositFromATMs(){ // metoda zwracająca ilość wypłat ze wszystkich bankomatów
        int counter = 0;
        for (int i = 0; i < ATMsList.length; i++) {
            counter = counter + ATMsList[i].getNumberOfDepositFromATM();
        }
        return counter;
    }

    public int getTotalValueOfAllWithdrawalFromATMs (){ // metoda zwracająca wartość wpłat do wszystkich bankomatów
        int totalValueOfAllWithdrawalFromATMs = 0;
        for (int i = 0; i < ATMsList.length; i++){
            if (ATMsList[i].getTotalValueOfWithdrawalFromATM() > 0)
                continue;
            totalValueOfAllWithdrawalFromATMs += ATMsList[i].getTotalValueOfWithdrawalFromATM();

        }
        return totalValueOfAllWithdrawalFromATMs;
    }

    public int getTotalValueOfAllDepositFromATMs (){ // metoda zwracająca wartość wypłat ze wszystkich bankomatów
        int totalValueOfAllDepositFromATMs = 0;
        for (int i = 0; i < ATMsList.length; i++){
            if (ATMsList[i].getTotalValueOfDepositFromATM() > 0)
                continue;
            totalValueOfAllDepositFromATMs += ATMsList[i].getTotalValueOfDepositFromATM();

        }
        return totalValueOfAllDepositFromATMs;
    }

    public double getAverageValueOfWithdrawalFromATMs(){ // metoda zwracająca średnią wpłatę do wszytskich bankomatów
        if (this.getNumberOfAllWithdrawalFromATMs() == 0){
            return 0;
        }
        return  this.getTotalValueOfAllWithdrawalFromATMs() / this.getNumberOfAllWithdrawalFromATMs();
    }

    public double getAverageValueOfDepositFromATMs(){ // metoda zwracająca średnią wypłatę ze wszytskich bankomatów
        if (this.getNumberOfAllDepositFromATMs() == 0){
            return 0;
        }
        return  this.getTotalValueOfAllDepositFromATMs() / this.getNumberOfAllDepositFromATMs();
    }



}
