package com.example.java_code_learn.task6_concurrency_bank.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
public class ConcurrentBank {
    private Lock lock = new ReentrantLock();
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccount createAccount(Integer amount) {
        BankAccount bankAccount = new BankAccount(amount);
        bankAccounts.add(bankAccount);
        return bankAccount;
    }

    public void transfer(BankAccount account1, BankAccount account2, Integer sum) {
        lock.lock();
        try {
            if (sum > 0) {
                checkAmount(account1, sum);
            } else {
                checkAmount(account2, sum);
            }
            account1.setAmount(account1.getAmount() - sum);
            account2.setAmount(account2.getAmount() + sum);
        } finally {
            lock.unlock();
        }
    }

    public Integer getTotalBalance() {
        int totalBalance = 0;
        for (BankAccount account : bankAccounts) {
            totalBalance = totalBalance + account.getAmount();
        }
        return totalBalance;
    }

    private void checkAmount(BankAccount account, Integer sum) {
        if (account.getAmount() - sum < 0) {
            throw new IllegalArgumentException("Not enough money in the account. Incorrect argument");
        }
    }
}
