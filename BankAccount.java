/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author ljapo
 */
public class BankAccount {

    private int accountNumber;
    private int balance;
    
    BankAccount(int accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0;
    }
    public int getaccountNumber(){
        return accountNumber;
    }
    void setbalance(int balance){
        this.balance=balance;
    }
    int getbalance(){
        return balance;
    }}
    class Main{
    public static void main(String[] args) {
        BankAccount ba= new BankAccount(123);
        ba.setbalance(100);
        System.out.println("the AccountNumber "+ba.getaccountNumber());
        System.out.println("the balance "+ba.getbalance());
    }
    
}
