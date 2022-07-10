package com.greatlearning.currencyDenomination;

import java.util.Scanner;

public class CurrencyDenominationDriver{
	public static void main(String[] args) {
	
	MergeSortImplementation mergeSort = new MergeSortImplementation(); 
	NotesCounter notesCounter = new NotesCounter();
	int size;
	int[] notes;
	
	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of Denominations");
		size = sc.nextInt();
		
		notes = new int[size];
		
		for(int i = 0; i < notes.length; i++) {
			System.out.println("Please enter the value of Denomination " + (i+1));
			int num = sc.nextInt();
			notes[i] = num;
		}
		
		mergeSort.mergeSort(notes, 0, notes.length - 1);	
		
		
		System.out.println("Please enter the amount to be paid");
		int amount = sc.nextInt();
		notesCounter.noteCounterImplementation(notes, amount);
	}
}
