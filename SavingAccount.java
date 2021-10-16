package com.bridgelabz.bank;
public class SavingAccount {
	public static float anualInterestRate;
	private float savingBalance;
	public SavingAccount(float savingBalance) {
		this.savingBalance=savingBalance;
	}
	public void calculateMonthlyInterest() {
		float monthlyInterest;
		monthlyInterest=(savingBalance*anualInterestRate)/12;
		System.out.println("Mothly interst= "+monthlyInterest);
		savingBalance=savingBalance+monthlyInterest;
		System.out.println("Saving Balance= "+savingBalance);;
	}
	public static float modifyInterestRate(float anualInterest) {
		anualInterestRate=anualInterest;
		return anualInterestRate;
	}
	public static void main(String[] args) {
		SavingAccount saver1=new SavingAccount(2000);
		SavingAccount saver2=new SavingAccount(3000);
		SavingAccount.modifyInterestRate(4);
		System.out.println("For Anual Interest Rate 4%:");
		System.out.println("Saver 1:");
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 2:");
		saver2.calculateMonthlyInterest();
		SavingAccount.modifyInterestRate(5);
		System.out.println();
		System.out.println("For Anual Interest Rate 5%:");
		System.out.println("Saver 1:");
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 2:");
		saver2.calculateMonthlyInterest();
	}
}
