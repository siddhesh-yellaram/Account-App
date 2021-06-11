package com.techlab.accounttest;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account(101,"A1",5000);
		Account a2 = new Account(102, "A2", 450);
		a1.deposit(500);
		a2.deposit(500);
		if(a2.withdraw(500)) {
			createAccount(a2);
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public static void createAccount(Account obj) {
		System.out.println("Account No: "+obj.getAccNo());
		System.out.println("Account Name: "+obj.getAccName());
		System.out.println("Account Balance: "+obj.getBalance());
	}
	
	
}
