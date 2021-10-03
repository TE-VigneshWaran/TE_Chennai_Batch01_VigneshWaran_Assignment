package com.assignment.program;

import java.util.Scanner;
 class Bank {

private Long balance;
	
	public Bank() {
	
		this.balance = 15000l;
	}
	
	public Long getBalance() {
		return this.balance;
	}
	
	public void withDraw(long withDrawAmount) {
		if (withDrawAmount <= balance) {
			this.balance -= withDrawAmount;
			System.out.println("With Draw Successfull");
			System.out.println("Current Balance : " 
				+ getBalance());
		} else {
			System.out.println("Insufficient Amount");
		}
	}

	public void deposite(long depositeAmount) {
		if (depositeAmount >= 100) {
			this.balance += depositeAmount;
			System.out.println("Deposite Successfull");
			System.out.println("Current Balance : " + getBalance());
		} else {
			System.out.println("Amount Should be more than 100");
		}
	}
}

public class Assignment15 {
	
public static void main(String[] args) {
	System.out.println(" Welcome to Union Bank Of India ");
	Scanner obj = new Scanner(System.in);
	System.out.println("enter amount to be deposit : ");
	long depositamt = obj.nextLong();
	System.out.println("enter amount to be withdrawn : ");
	long withdrawamt = obj.nextLong();
	
	Bank ref = new Bank();

	System.out.println(ref.getBalance());
	ref.deposite(depositamt);
	ref.withDraw(withdrawamt);
}
}


