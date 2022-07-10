package com.greatlearning.payMoney;

import java.util.Scanner;

public class PayMoney {
	int size;
	int[] transactions;
	
	Scanner sc = new Scanner(System.in);
	//method to taken input from user
	public void insertTransactions() {
		System.out.println("Please enter the number of transactions to be performed");
		
		//taking input from user of the size of the transactions and setting the size of the array.
		int num = sc.nextInt();
		transactions = new int[num];
		
		//This will element by element enter the values of transactions in the array
		for(int i = 0; i < transactions.length; i++) {
			System.out.println("Please enter the value of the transaction " + (i+1));
			int val = sc.nextInt();
			transactions[i] = val;
		}
	}
	
	//Method to find the number of transactions after which the target will be achieved.
	public void targetTransaction() {
		System.out.println("Please enter the number of targets");
		int val = sc.nextInt();

		while(val-- != 0) { // it will allow all the targets to be checked one after another.
			int flag = 0; // if target is met this will be set to 1 and if not it will remain 0. 
			
			long target;
			
			System.out.println("Please enter the value of the Target");
			target = sc.nextLong();
			long sum = 0;
			
			for(int i = 0; i < transactions.length; i++) {
				sum += transactions[i];
				
				if(sum >= target) {
					System.out.println("Target achieved after " + (i+1) + " transactions!");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Target not achieved!");
			}
		}
	}
}
