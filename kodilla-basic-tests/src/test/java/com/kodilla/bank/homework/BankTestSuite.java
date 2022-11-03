package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    public void shouldReturnCorrectLength(){
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();
        CashMachine cashMachine6 = new CashMachine();
        CashMachine cashMachine7 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4, cashMachine5, cashMachine6, cashMachine7});
        CashMachine[] cashMachines = bank1.getCashMachines();
        assertEquals(7, cashMachines.length);
    }

    @Test
    public void shouldReturnTotalBalance(){

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4, cashMachine5});

        cashMachine1.operations(1000);
        cashMachine2.operations(-500);
        cashMachine3.operations(1500);
        cashMachine4.operations(500);
        cashMachine5.operations(-1000);

        bank1.getTotalBalance();
        assertEquals(1500, bank1.getTotalBalance());
    }

    @Test
    public void  shouldReturnTotalNumberOfDeposits(){

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4, cashMachine5});

        cashMachine1.operations(1000);
        cashMachine2.operations(-500);
        cashMachine3.operations(1500);
        cashMachine4.operations(500);
        cashMachine5.operations(-1000);

        bank1.getTotalNumberOfDeposits();
        assertEquals(3, bank1.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldReturnTotalNumberOfWithdrawals(){

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4, cashMachine5});

        cashMachine1.operations(1000);
        cashMachine2.operations(-500);
        cashMachine3.operations(1500);
        cashMachine4.operations(500);
        cashMachine5.operations(-1000);

        bank1.getTotalNumberOfWithdrawals();
        assertEquals(2, bank1.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnTotalAverageOfDeposits(){

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4, cashMachine5});

        cashMachine1.operations(1000);
        cashMachine2.operations(-500);
        cashMachine3.operations(1500);
        cashMachine4.operations(500);
        cashMachine5.operations(-1000);

        bank1.getTotalAverageOfDeposits();
        assertEquals(1000, bank1.getTotalAverageOfDeposits());
    }

    @Test
    public void shouldReturnTotalAverageOfWithdrawals(){

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();

        Bank bank1 = new Bank(new CashMachine[]{cashMachine1, cashMachine2, cashMachine3, cashMachine4, cashMachine5});

        cashMachine1.operations(1000);
        cashMachine2.operations(-500);
        cashMachine3.operations(1500);
        cashMachine4.operations(500);
        cashMachine5.operations(-1000);

        bank1.getTotalAverageOfWithdrawals();
        assertEquals(-750, bank1.getTotalAverageOfWithdrawals());
    }
}