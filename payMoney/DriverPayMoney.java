package com.greatlearning.payMoney;

public class DriverPayMoney {
	public static void main(String[] args) {
		
		//Object of Class PayMoney
		PayMoney t1 = new PayMoney();
		
		//Calling the methods from PayMoney class.
		t1.insertTransactions();
		t1.targetTransaction();
	}
}
