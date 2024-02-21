package org.exemple;

import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount bankAccount1 ;
    private BankAccount bankAccount2 ;
    @BeforeEach
    public void setup(){
        bankAccount1 = new BankAccount(1000,200) ;
    }
    @Test
    public void bankaccountDepositNegativeSomme()
    {
        bankAccount1.deposit(-600);
    }
    @Test
    public void bankaccountDeposit()
    {
        double resultBefore  =  bankAccount1.getBalance() ;
        bankAccount1.deposit(200);
        double resultAfter = bankAccount1.getBalance() ;

        Assertions.assertEquals(200,(resultAfter - resultBefore) );
    }
    @Test
    public void banckaccountwithdrawNegative(){
        bankAccount1.withdraw(-300);
    }
    @Test
    public void banckaccountwithdrawSupperieur(){   // apres le test, dans la condition le amount doit etre inferieur a la balance
        bankAccount1.deposit(500);
        bankAccount1.withdraw(10000000);
    }
    @Test
    public void banckaccountwithdraw(){

        bankAccount1.withdraw(500);

        double result = bankAccount1.getBalance() ;
        Assertions.assertEquals(500,result);
    }

    @Test
    public void banckaccountTransferNullAccount(){
        bankAccount2 = null ;

        bankAccount1.transfer(1000,bankAccount2);
    }
    @Test
    public void banckaccountTransferInsufficientBalance(){
        bankAccount2 = new BankAccount(200,300) ;

        bankAccount1.transfer(10000000,bankAccount2);
    }

    @Test
    public void banckaccountTransfer(){
        bankAccount2 = new BankAccount(200,300) ;
        double resultBeforeact2 = bankAccount2.getBalance() ;
        double resultBeforeact1 = bankAccount1.getBalance() ;

        bankAccount1.transfer(100,bankAccount2);

        double resultAfteract2 = bankAccount2.getBalance() ;
        double resultAfteract1 = bankAccount1.getBalance() ;

        Assertions.assertEquals(resultBeforeact2 + 100 , resultAfteract2);
        Assertions.assertEquals(resultBeforeact1 - 100 , resultAfteract1);

    }
    @Test
    public void banckaccountAddInterest()
    {
        double resultBeforAdding = bankAccount1.getBalance() ;

        bankAccount1.addInterest();

        Assertions.assertEquals(resultBeforAdding * 201 , bankAccount1.getBalance());

    }

}
