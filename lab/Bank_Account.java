package com.lab;


class BankAccount {
	  public double balance;

	  public BankAccount(double balance) {
	    this.balance = balance;
	  }

	  public double getBalance() {
	    return balance;
	  }

	  public void deposit(double amount) {
	    balance =balance + amount;
	  }

	  public void withdraw(double amount) {
	    if (amount <= balance) {
	      balance =balance - amount;
	    } else {
	      System.out.println("Insufficient Balance.");
	    }
	  }
	}

class SavingsAccount extends BankAccount {
	  public double withdrawal;

	  public SavingsAccount(double balance, double withdrawal) {
	    super(balance);
	    this.withdrawal = withdrawal;
	  }

	  @Override
	  public void withdraw(double amount) {
	    if (amount <= withdrawal) {
	      super.withdraw(amount);
	    } else {
	      System.out.println("Withdrawal limit exceeded.");
	    }
	  }
	}

class CheckingAccount extends BankAccount {
	  public double overdraftFee;

	  public CheckingAccount(double balance, double overdraftFee) {
	    super(balance);
	    this.overdraftFee = overdraftFee;
	  }

	  @Override
	  public void withdraw(double amount) {
	    if (amount <= getBalance()) {
	      super.withdraw(amount);
	    } else {
	      System.out.println("Overdraft fee applied.");
	      super.withdraw(amount + overdraftFee);
	    }
	  }
	
}

public class Bank_Account {

	public static void main(String[] args) {
		
			    BankAccount savingsAccount = new SavingsAccount(2000, 650);
			    BankAccount checkingAccount = new CheckingAccount(1000, 100);

			    withdrawFromAccount(savingsAccount, 300);
			    withdrawFromAccount(checkingAccount, 250);

			    System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
			    System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
	


	}
	public static void withdrawFromAccount(BankAccount account, double amount) {
	    account.withdraw(amount);
	  }
}
