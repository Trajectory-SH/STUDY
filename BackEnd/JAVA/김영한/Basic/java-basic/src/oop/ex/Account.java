package oop.ex;

public class Account {
    int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다 -> 잔액 :  " + balance);
            return;
        }
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("balance = " + balance);
    }
}
