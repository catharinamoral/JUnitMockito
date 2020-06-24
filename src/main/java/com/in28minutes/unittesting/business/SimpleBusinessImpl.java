package com.in28minutes.unittesting.business;

public class SimpleBusinessImpl {

	public int calculateSum(int[] data) {
		int sum = 0;
		for(int value:data) {
			sum += value;
		}
		return sum;
	}
	
}
