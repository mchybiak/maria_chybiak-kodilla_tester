package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    public void shouldReturnZeroLength(){
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void  shouldReturnNumberOfTransactions(){
        CashMachine cashMachine = new CashMachine();

        cashMachine.operations(200);
        cashMachine.operations(-100);
        cashMachine.operations(10000);
        cashMachine.operations(-234);
        cashMachine.operations(-123);
        cashMachine.operations(-120);
        cashMachine.operations(99999);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(7, transactions.length);
    }

    @Test
    public void shouldAddDeposit(){

        CashMachine cashMachine = new CashMachine();
        cashMachine.operations(1000);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(1000, transactions[0]);
        assertEquals(1, transactions.length);
    }

    @Test
    public void shouldReturnBalance(){

        CashMachine cashMachine = new CashMachine();
        cashMachine.operations(1000);
        cashMachine.operations(-100);
        cashMachine.operations(200);
        cashMachine.operations(-10);
        cashMachine.operations(2500);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3590, cashMachine.getBalance());
        assertEquals(5, transactions.length);
    }

}